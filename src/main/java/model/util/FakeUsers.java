
package model.util;

import java.util.ArrayList;

import org.bson.Document;
import org.springframework.boot.autoconfigure.data.mongo.MongoReactiveDataAutoConfiguration;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoURI;
import com.mongodb.client.MongoDatabase;

import app.ApplianceReturn;
import data.ApplicationDetails;
import model.adt.ApplianceADT;
import model.adt.UserADT;
import model.adt.UserGraph;
import model.adt.*;
import model.util.Dataset;

/**
 * This class generates fake users for testing purposes
 * @author Matthew Dombrady
 */
public class FakeUsers {
	
	// This array list will contain the fake users
	private ArrayList<UserADT> fakeUsers;

	/**
	 * This constructor creates an array list of "dummy" UserADTs
	 */
	public FakeUsers() {
		
		// Initialize appliance array lists from dataset
		Dataset.init();
		
		fakeUsers = new ArrayList<UserADT>();		
		ArrayList<ApplianceReturn> apps;		
		
		// This loop adds new users to the array list
		for (int i = 0; i < 10; i++) {
			
			// Assign basic IDs and emails
			fakeUsers.add(new UserADT("user" + i, "user" + i + "@gmail.com" ));
			apps = new ArrayList<ApplianceReturn>();
			
		
			// Each user is assigned one appliance from each type.
			// User #1 will get the first appliance from each list, user #2 will get the second, and so on.
			apps.add(new ApplianceReturn(Dataset.REFRIDGERATORS.get(i).getBRAND_NAME(), Dataset.REFRIDGERATORS.get(i).getMMODEL_NUM_1(), "Refridgerator", ((RefridgeratorADT)Dataset.REFRIDGERATORS.get(i)).getConsumption())); 
			apps.add(new ApplianceReturn(Dataset.WASHERS.get(i).getBRAND_NAME(), Dataset.WASHERS.get(i).getMMODEL_NUM_1(), "Washer", ((WasherADT)Dataset.WASHERS.get(i)).getConsumption())); 
			apps.add(new ApplianceReturn(Dataset.WASHER_DRYERS.get(i).getBRAND_NAME(), Dataset.WASHER_DRYERS.get(i).getMMODEL_NUM_1(), "Washer-Dryer", ((WasherDryerADT)Dataset.WASHER_DRYERS.get(i)).getConsumption())); 
			apps.add(new ApplianceReturn(Dataset.FREEZERS.get(i).getBRAND_NAME(), Dataset.FREEZERS.get(i).getMMODEL_NUM_1(), "Freezer", ((FreezerADT)Dataset.FREEZERS.get(i)).getConsumption())); 
			apps.add(new ApplianceReturn(Dataset.OVENS.get(i).getBRAND_NAME(), Dataset.OVENS.get(i).getMMODEL_NUM_1(), "Oven", ((OvenADT)Dataset.OVENS.get(i)).getConsumption())); 
			apps.add(new ApplianceReturn(Dataset.COOKTOPS.get(i).getBRAND_NAME(), Dataset.COOKTOPS.get(i).getMMODEL_NUM_1(), "Cooktop", ((CooktopADT)Dataset.COOKTOPS.get(i)).getConsumption())); 
			apps.add(new ApplianceReturn(Dataset.DISHWASHERS.get(i).getBRAND_NAME(), Dataset.DISHWASHERS.get(i).getMMODEL_NUM_1(), "Dishwasher", ((DishwasherADT)Dataset.DISHWASHERS.get(i)).getConsumption())); 
			apps.add(new ApplianceReturn(Dataset.RANGES.get(i).getBRAND_NAME(), Dataset.RANGES.get(i).getMMODEL_NUM_1(), "Range", ((RangeADT)Dataset.RANGES.get(i)).getConsumption())); 
			apps.add(new ApplianceReturn(Dataset.AIRCONDITIONERS.get(i).getBRAND_NAME(), Dataset.AIRCONDITIONERS.get(i).getMMODEL_NUM_1(), "Air Conditioner", ((AirConditionerADT)Dataset.AIRCONDITIONERS.get(i)).getConsumption())); 
			apps.add(new ApplianceReturn(Dataset.REFRIDGERATORS.get(i).getBRAND_NAME(), Dataset.REFRIDGERATORS.get(i).getMMODEL_NUM_1(), "Refridgerator", ((RefridgeratorADT)Dataset.REFRIDGERATORS.get(i)).getConsumption())); 
			apps.add(new ApplianceReturn(Dataset.REFRIDGERATORS.get(i).getBRAND_NAME(), Dataset.REFRIDGERATORS.get(i).getMMODEL_NUM_1(), "Refridgerator", ((RefridgeratorADT)Dataset.REFRIDGERATORS.get(i)).getConsumption())); 
			apps.add(new ApplianceReturn(Dataset.DRYERS.get(i).getBRAND_NAME(), Dataset.DRYERS.get(i).getMMODEL_NUM_1(), "Dryer", ((ClothesDryerADT)Dataset.DRYERS.get(i)).getConsumption())); 
			
			fakeUsers.get(i).setAppliances(apps);
			
			
		}
		
		
	}
	
	/**
	 * This method is the accessor for the array list of fake users
	 * @return The array list of "dummy" UserADTs
	 */
	public ArrayList<UserADT> getFakeUsers() {
		return fakeUsers;
	}
	
	
	public static void main(String [] args) {
		
		ArrayList<ApplianceReturn> apps = new ArrayList<ApplianceReturn>();
		//UserADT user = new UserADT("user32", "user32@gmail.com");
		try {
		MongoAdapter adp = new MongoAdapter(ApplicationDetails.USERS_DB);
		//UserADT user = new UserADT("US5YEOOvrKYK4wL7L8FhElVm3Ev1", "sagarthomas27@hotmail.com");
		//adp.addUser(user);
		UserADT user1 = adp.getUser("US5YEOOvrKYK4wL7L8FhElVm3Ev1");
		Dataset.init();
		apps.add(new ApplianceReturn(Dataset.REFRIDGERATORS.get(1).getBRAND_NAME(), Dataset.REFRIDGERATORS.get(1).getMMODEL_NUM_1(), "Refridgerator", ((RefridgeratorADT)Dataset.REFRIDGERATORS.get(1)).getConsumption())); 
		apps.add(new ApplianceReturn(Dataset.WASHERS.get(1).getBRAND_NAME(), Dataset.WASHERS.get(1).getMMODEL_NUM_1(), "Washer", ((WasherADT)Dataset.WASHERS.get(1)).getConsumption())); 
		apps.add(new ApplianceReturn(Dataset.WASHER_DRYERS.get(1).getBRAND_NAME(), Dataset.WASHER_DRYERS.get(1).getMMODEL_NUM_1(), "Washer-Dryer", ((WasherDryerADT)Dataset.WASHER_DRYERS.get(1)).getConsumption())); 
		user1.setAppliances(apps);
		adp.updateUserApplianceList(user1);
		adp.close();
		
			//MongoAdapter adapter = new MongoAdapter(ApplicationDetails.USERS_DB);
			//adp.addUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		/*
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
		 
		*/
		
	}
	
	
	
	
}
