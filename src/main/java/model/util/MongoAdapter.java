package model.util;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import data.ApplicationDetails;

/**
 * Acts as another layer of abstraction to connect with the MongoDB backend for
 * a more simplified and intuitive usage
 * @author Sagar Thomas
 */
public class MongoAdapter {
	private MongoClient client;
	
	public MongoAdapter(String mode) {
		
		if(mode.equals(ApplicationDetails.USERS_DB)) {
			client = new MongoClient(new MongoClientURI(ApplicationDetails.M_USERS_URI));
		}
		
	}
	
	
	
	
	public void close() {
		client.close();
	}

}
