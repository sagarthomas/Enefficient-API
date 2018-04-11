package app;

import java.util.ArrayList;

import org.bson.Document;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import data.ApplicationDetails;
import exceptions.NoSuchDatabaseFound;
import exceptions.NoSuchMethodForDatabase;
import model.adt.ApplianceADT;
import model.adt.Recommend;
import model.adt.UserADT;
import model.adt.UserGraph;
import model.util.MongoAdapter;

/**
 * Spring MVC Controller to recommend an appliance the current user
 * @author Matthew Dombrady, Sagar Thomas
 *
 */
@RestController
public class RecommendController {
	
	/**
	 * Mapped Spring method for recommend 
	 * @param id of the user
	 * @return ApplianceReturn 
	 * @throws NoSuchMethodForDatabase
	 * @throws NoSuchDatabaseFound
	 */
	@RequestMapping(value = "/users/{id}/recommend")
	public ApplianceReturn recomend(@PathVariable String id) throws NoSuchMethodForDatabase, NoSuchDatabaseFound {
		//Init required variables
		
		
		
		//Get all list of users from Mongo
		//MongoClient client = new MongoClient(new MongoClientURI("mongodb://admin:flegends@ds119449.mlab.com:19449/enefficient-users"));
		//MongoDatabase db = client.getDatabase("enefficient-users");
		MongoAdapter adapter = new MongoAdapter(ApplicationDetails.USERS_DB);
		
		ArrayList<UserADT> users = new ArrayList<UserADT>();
		
		users = adapter.getAllUsers();
		adapter.close();
		UserGraph G = new UserGraph(users, 7);
		Recommend r = new Recommend(G, id);
		ApplianceReturn a = r.getReplace();
		
		
		
		return a;
	}

}
