package app;

import java.util.ArrayList;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import model.adt.ApplianceADT;
import model.adt.UserADT;
import model.util.CalculateScore;
/**
 * Spring controller that calculates and returns a specific user's score
 * @author Sagar Thomas
 *
 */
@RestController
public class ScoreController {
	
	private ArrayList<UserADT> users;

	/**
	 * Mapped REST url path for creating getting the score of a user
	 * @param id
	 * @return score of user with specified id
	 */
	@RequestMapping("/users/{id}/score")
	public double score(@PathVariable String id) {
		JsonParser parser = new JsonParser();
		Gson gson = new Gson();
		users = new ArrayList<UserADT>();
		MongoClient client = new MongoClient(new MongoClientURI("mongodb://admin:flegends@ds119449.mlab.com:19449/enefficient-users"));
		MongoDatabase db = client.getDatabase("enefficient-users");
		for(String uid : db.listCollectionNames()) {
			MongoCollection<Document> userCol = db.getCollection(uid);
			JsonElement raw_user = parser.parse(new BasicDBObject(userCol.find().first()).toJson());
			users.add(gson.fromJson(raw_user, UserADT.class));
		}
		client.close();
		
		UserADT currentUser = users.get(0);
		for (UserADT u : users) {
			if (id.equals(u.getID())) {
				currentUser = u;
			}
			CalculateScore.calcScore(u);
			addMongo(u);
		}
		
		return currentUser.getScore();
	}
	
	private void addMongo(UserADT u) {
    	Gson gson = new Gson();
    	MongoClient client = new MongoClient(new MongoClientURI("mongodb://admin:flegends@ds119449.mlab.com:19449/enefficient-users"));
		MongoDatabase db = client.getDatabase("enefficient-users");
		MongoCollection<Document> uCol = db.getCollection(u.getID());
		UserADT user = u; 
		String json = gson.toJson(user);
		ObjectId uid = (ObjectId) uCol.find().first().get("_id");
		uCol.deleteOne(new Document("_id", uid));
		Document doc = Document.parse(json);
		uCol.insertOne(doc);
		client.close();
    }
}
