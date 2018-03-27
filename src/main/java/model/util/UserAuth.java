package model.util;

import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;


import model.adt.UserADT;

public class UserAuth {
	
	
	public static UserADT createAccount(String Id, String email) {
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
	}

}
