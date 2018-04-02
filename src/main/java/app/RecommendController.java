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

import model.adt.ApplianceADT;
import model.adt.Recommend;
import model.adt.UserADT;
import model.adt.UserGraph;

@RestController
public class RecommendController {
	
	@RequestMapping(value = "/users/{id}/recommend")
	public ApplianceReturn recomend(@PathVariable String id) {
		//Init required variables
		JsonParser parser = new JsonParser();
		Gson gson = new Gson();
		
		
		//Get all list of users from Mongo
		MongoClient client = new MongoClient(new MongoClientURI("mongodb://admin:flegends@ds119449.mlab.com:19449/enefficient-users"));
		MongoDatabase db = client.getDatabase("enefficient-users");
		
		ArrayList<UserADT> users = new ArrayList<UserADT>();
		
		for(String userID : db.listCollectionNames()) {
			//db.getCollection(userID).find().first().replace(key, value);
			MongoCollection<Document> userCol = db.getCollection(userID);
			JsonElement raw_user = parser.parse(new BasicDBObject(userCol.find().first()).toJson());
			users.add(gson.fromJson(raw_user, UserADT.class));
		}
		
		client.close();
		
		UserGraph G = new UserGraph(users, 7);
		Recommend r = new Recommend(G, id);
		ApplianceADT a = r.replace();
		
		
		
		
		
		
		return new ApplianceReturn(a.getBRAND_NAME(), a.getMMODEL_NUM_1(), r.getType(), r.getConsumption());
	}

}
