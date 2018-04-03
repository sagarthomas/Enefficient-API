package model.util;

import java.util.ArrayList;

import org.bson.Document;
import org.springframework.boot.autoconfigure.data.mongo.MongoReactiveDataAutoConfiguration;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoURI;
import com.mongodb.client.MongoDatabase;

import model.adt.ApplianceADT;
import model.adt.UserADT;
import model.adt.UserGraph;
import model.adt.*;
import model.util.Dataset;

public class FakeUsers {
	
	private ArrayList<UserADT> fakeUsers;

	public FakeUsers() {
		
		Dataset.init();
		
		fakeUsers = new ArrayList<UserADT>();		
		ArrayList<ArrayList<ApplianceADT>> apps;		
		
		for (int i = 0; i < 10; i++) {
			fakeUsers.add(new UserADT("user" + i, "user" + i + "@gmail.com" ));
			apps = new ArrayList<ArrayList<ApplianceADT>>();
			
			for (int j = 0; j < 10; j++)
				apps.add(new ArrayList<ApplianceADT>());
			
			apps.get(0).add(Dataset.REFRIDGERATORS.get(i));
			apps.get(1).add(Dataset.WASHERS.get(i));
			apps.get(2).add(Dataset.DRYERS.get(i));
			apps.get(3).add(Dataset.WASHER_DRYERS.get(i));
			apps.get(4).add(Dataset.FREEZERS.get(i));
			apps.get(5).add(Dataset.OVENS.get(i));
			apps.get(6).add(Dataset.COOKTOPS.get(i));
			apps.get(7).add(Dataset.DISHWASHERS.get(i));
			apps.get(8).add(Dataset.RANGES.get(i));
			apps.get(9).add(Dataset.AIRCONDITIONERS.get(i));
			
			fakeUsers.get(i).setAppliances(apps);
			
			
		}
	}
	
	public ArrayList<UserADT> getFakeUsers() {
		return fakeUsers;
	}
	
	/*
	public static void main(String [] args) {
		
		Gson gson = new Gson();
		FakeUsers faker = new FakeUsers();
		ArrayList<UserADT> users = faker.getFakeUsers();
		
		MongoClient client = new MongoClient(new MongoClientURI("mongodb://admin:flegends@ds119449.mlab.com:19449/enefficient-users"));
		MongoDatabase db = client.getDatabase("enefficient-users");
		db.createCollection("US5YEOOvrKYK4wL7L8FhElVm3Ev1");
		UserADT user = new UserADT("US5YEOOvrKYK4wL7L8FhElVm3Ev1", "sagarthomas27@hotmail.com");
		user.setAppliances(users.get(0).getAppliances());
		String json = gson.toJson(user);
		Document doc = Document.parse(json);
		db.getCollection("US5YEOOvrKYK4wL7L8FhElVm3Ev1").insertOne(doc);
		client.close();
		/*
		for(UserADT u : users) {
			db.createCollection(u.getID());
			String json = gson.toJson(u);
			Document doc = Document.parse(json);
			db.getCollection(u.getID()).insertOne(doc);
		}
		
		//client.close();
	}
	*/
	
	
	
}
