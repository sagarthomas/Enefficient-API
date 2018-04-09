package model.util;

import java.util.ArrayList;

import java.util.List;

import org.bson.Document;

import com.google.gson.Gson;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import app.ApplianceReturn;
import data.ApplicationDetails;
import exceptions.NoSuchDatabaseFound;
import exceptions.NoSuchMethodForDatabase;
import model.adt.UserADT;

/**
 * Acts as another layer of abstraction to connect with the MongoDB backend for
 * a more simplified and intuitive usage
 * @author Sagar Thomas
 */
public class MongoAdapter {
	private MongoClient client;
	private MongoDatabase db;
	private String state;
	private Gson gson;
	
	/**
	 * Sets up the client using a database name to retrieve
	 * @param database name of database to get
	 * @throws NoSuchDatabaseFound if specified database is not found
	 */
	public MongoAdapter(String database) throws NoSuchDatabaseFound {
		gson = new Gson();
		
		if(database.equals(ApplicationDetails.USERS_DB)) { 
			client = new MongoClient(new MongoClientURI(ApplicationDetails.M_USERS_URI));
			db = client.getDatabase(ApplicationDetails.USERS_DB);
			state = ApplicationDetails.USERS_DB;
		} else if(database.equals(ApplicationDetails.APPLIANCES_DB)) {
			client = new MongoClient(new MongoClientURI(ApplicationDetails.M_USERS_URI));
			db = client.getDatabase(ApplicationDetails.APPLIANCES_DB);
			state = ApplicationDetails.APPLIANCES_DB;
		} else
			throw new NoSuchDatabaseFound();
			
	}
	
	//User DB specific methods
	
	/**
	 * Adds a user to the database
	 * @param user unique id of user
	 * @throws NoSuchMethodForDatabase if wrong database is being used
	 */
	public void addUser(UserADT user) throws NoSuchMethodForDatabase {
		if (state.equals(ApplicationDetails.USERS_DB)) {
			//Check if user already exists
			for(String id : db.listCollectionNames()) {
				if(user.getID().equals(id))
					return;
			}
			db.createCollection(user.getID());
			MongoCollection<Document> uCol = db.getCollection(user.getID());
			String json = gson.toJson(user);
			Document doc = Document.parse(json);
			uCol.insertOne(doc);
		} else
			throw new NoSuchMethodForDatabase(state + "does not have a method to add users!");
	}
	
	/**
	 * Gets a user from the database
	 * @param id unique identifier of user
	 * @return the user with given id
	 * @throws NoSuchMethodForDatabase thrown if wrong database is being used
	 */
	public UserADT getUser(String id) throws NoSuchMethodForDatabase {
		//TODO: Userexists check
		if (state.equals(ApplicationDetails.USERS_DB)) {
			MongoCollection<Document> uCol = db.getCollection(id);
			Document doc = uCol.find(new BasicDBObject().append("uid", id)).first();
			doc.remove("_id");
			String json = doc.toJson();
			return gson.fromJson(json, UserADT.class);
			
		} else
			throw new NoSuchMethodForDatabase(state + "does not have a method to add users!");
	}
	
	/**
	 * Updates the user's appliance list
	 * @param updatedUser object with updated info
	 * @throws NoSuchMethodForDatabase thrown if wrong database
	 */
	public void updateUserApplianceList(UserADT updatedUser) throws NoSuchMethodForDatabase {
		if (state.equals(ApplicationDetails.USERS_DB)) {
			List<ApplianceReturn> list = updatedUser.getAppliances();
			
			List<DBObject> objs = new ArrayList<DBObject>();
			for(ApplianceReturn r : list) {
				objs.add(new BasicDBObject("brand", r.getBrand())
						.append("model", r.getModel())
						.append("type", r.getType())
						.append("consumption", r.getConsumption()));
			}
			BasicDBObject newDoc = new BasicDBObject();
			newDoc.append("$set", new BasicDBObject().append("appliances", objs));
			//Lets search for the correct user
			BasicDBObject searchQuery = new BasicDBObject().append("uid", updatedUser.getID());
			MongoCollection<Document> uCol = db.getCollection(updatedUser.getID());
			uCol.updateOne(searchQuery, newDoc);
			
		} else 
			throw new NoSuchMethodForDatabase();
	}
	
	
	
	
	
	/**
	 * Closes the MongoClient connection
	 */
	public void close() {
		client.close();
	}

}
