package model.util;

import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import com.mongodb.client.MongoDatabase;


import model.adt.UserADT;

/**
 * UserAuth is used to add newly created accounts to the database in MLab
 * @author Sagar Thomas
 */
public class UserAuth {
	
	/**
	 * Creates an account for a new user and updates the database
	 * @param Id The unique ID given to a user
	 * @param email The user's email address
	 * @throws MongoException General exception thrown should there be some issue connecting to the database or updating
	 * information in the database
	 * @return A UserADT instance containing the newly created user's information
	 */
	public static UserADT createAccount(String Id, String email) {
	
		try {
			MongoClient client = new MongoClient(new MongoClientURI("mongodb://admin:flegends@ds119449.mlab.com:19449/enefficient-users"));
			
			MongoDatabase db = client.getDatabase("enefficient-users");
			UserADT user = new UserADT(Id, email);
			Gson gson = new Gson();
			String json = gson.toJson(user);
			db.createCollection(Id);
			Document doc = Document.parse(json);
			
			db.getCollection(Id).insertOne(doc);
			
			client.close();
			return user;
		} catch(MongoException e) {
			e.getMessage();
			e.printStackTrace();
			return null;
		}
	}

}
