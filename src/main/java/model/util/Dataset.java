package model.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import model.adt.*;
import com.google.gson.*;

import org.bson.Document;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * This class is used to retrieve the dataset information from the database
 * @author Sagar Thomas
 *
 */
public class Dataset {
	// ArrayLists for appliances
	public static final ArrayList<AirConditionerADT> AIRCONDITIONERS = new ArrayList<AirConditionerADT>();
	public static final ArrayList<ClothesDryerADT> DRYERS = new ArrayList<ClothesDryerADT>();
	public static final ArrayList<CooktopADT> COOKTOPS = new ArrayList<CooktopADT>();
	public static final ArrayList<DishwasherADT> DISHWASHERS = new ArrayList<DishwasherADT>();
	public static final ArrayList<FreezerADT> FREEZERS = new ArrayList<FreezerADT>();
	public static final ArrayList<OvenADT> OVENS = new ArrayList<OvenADT>();
	public static final ArrayList<RangeADT> RANGES = new ArrayList<RangeADT>();
	public static final ArrayList<RefridgeratorADT> REFRIDGERATORS = new ArrayList<RefridgeratorADT>();
	public static final ArrayList<WasherADT> WASHERS = new ArrayList<WasherADT>();
	public static final ArrayList<WasherDryerADT> WASHER_DRYERS = new ArrayList<WasherDryerADT>();
	
	private static JsonParser parser;
	private static Gson gson;
	private static JsonObject[] data;
	
	public static boolean init() {
		parser = new JsonParser();
		gson = new Gson();
		data = new JsonObject [11];
		
		try {
			// Create client to connect to the MongoDB database
			MongoClient client = new MongoClient(new MongoClientURI("mongodb://admin:yohelpme@ds163918.mlab.com:63918/enefficient"));
			// Create the database locally
			MongoDatabase db = client.getDatabase("enefficient");
			
			for (String name : db.listCollectionNames()) {
			    System.out.println(name);
			}
			
			MongoCollection<Document> ovens = db.getCollection("ovens");
			MongoCollection<Document> ac = db.getCollection("air-conditioning");
			MongoCollection<Document> cooktops = db.getCollection("cooktops");
			MongoCollection<Document> dishwashers = db.getCollection("dishwashers");
			MongoCollection<Document> dryers = db.getCollection("dryers");
			MongoCollection<Document> freezers = db.getCollection("freezers");
			MongoCollection<Document> ranges = db.getCollection("ranges");
			MongoCollection<Document> fridges = db.getCollection("refrigerators-wine-chiller");
			MongoCollection<Document> washer_dryers = db.getCollection("washer-dryers");
			MongoCollection<Document> washers = db.getCollection("washers");
			
			data[0] = parser.parse(new BasicDBObject(ovens.find().first()).toJson()).getAsJsonObject();
			data[1] = parser.parse(new BasicDBObject(ac.find().first()).toJson()).getAsJsonObject();
			data[2] = parser.parse(new BasicDBObject(cooktops.find().first()).toJson()).getAsJsonObject();
			data[3] = parser.parse(new BasicDBObject(dishwashers.find().first()).toJson()).getAsJsonObject();
			data[4] = parser.parse(new BasicDBObject(dryers.find().first()).toJson()).getAsJsonObject();
			data[5] = parser.parse(new BasicDBObject(freezers.find().first()).toJson()).getAsJsonObject();
			data[6] = parser.parse(new BasicDBObject(ranges.find().first()).toJson()).getAsJsonObject();
			data[7] = parser.parse(new BasicDBObject(washer_dryers.find().first()).toJson()).getAsJsonObject();
			data[8] = parser.parse(new BasicDBObject(washers.find().first()).toJson()).getAsJsonObject();
			// Fridge data is in two seperate documents due to its size so retrival is a bit different
			FindIterable<Document> documents = fridges.find();
			int i = 0;
			for (Document doc : documents) {
				data[9 + i] = parser.parse(new BasicDBObject(doc).toJson()).getAsJsonObject();
				i++;
			}
			
			
			
			//JsonObject applianceData = parser.parse(new FileReader("src\\\\model\\\\data\\\\appliances.json")).getAsJsonObject();
			
			populateACs(data[1], gson);
			populateCooktops(data[2], gson);
			populateDishwashers(data[3], gson);
			populateDryers(data[4], gson);
			populateFreezers(data[5], gson);
			populateOvens(data[0], gson);
			populateRanges(data[6], gson);
			populateRefridgerators(data[9], data[10], gson);
			populateWasherDryers(data[7], gson);
			populateWashers(data[8], gson);
			
		
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		System.out.println("Data import and parsing successful!");
		return true;
		
	}
	
	
	private static void populateACs(JsonObject data, Gson extractor) {
		
		JsonArray array = data.getAsJsonArray("air-conditioning");
		
		try {
			for (JsonElement e : array) 
				AIRCONDITIONERS.add(extractor.fromJson(e, AirConditionerADT.class));
			
		} catch(Exception e) {
			System.out.println("Problem with AC adt import");
			e.printStackTrace();
		}
	}
	
	private static void populateDryers(JsonObject data, Gson extractor) {
		
		JsonArray array = data.getAsJsonArray("dryers");
		
		try {
			for (JsonElement e : array) 
				DRYERS.add(extractor.fromJson(e, ClothesDryerADT.class));
			
		} catch(Exception e) {
			System.out.println("Problem with dryer adt import");
			e.printStackTrace();
		}
	}
	
	private static void populateCooktops(JsonObject data, Gson extractor) {
		
		JsonArray array = data.getAsJsonArray("cooktops");
		
		try {
			for (JsonElement e : array) 
				COOKTOPS.add(extractor.fromJson(e, CooktopADT.class));
			
		} catch(Exception e) {
			System.out.println("Problem with cooktop adt import");
			e.printStackTrace();
		}
	}
	
	private static void populateDishwashers(JsonObject data, Gson extractor) {
		
		JsonArray array = data.getAsJsonArray("dishwashers");
		
		try {
			for (JsonElement e : array) 
				DISHWASHERS.add(extractor.fromJson(e, DishwasherADT.class));
			
		} catch(Exception e) {
			System.out.println("Problem with dishwasher adt import");
			e.printStackTrace();
		}
	}
	
	private static void populateFreezers(JsonObject data, Gson extractor) {
		
		JsonArray array = data.getAsJsonArray("freezers");
		
		try {
			for (JsonElement e : array) 
				FREEZERS.add(extractor.fromJson(e, FreezerADT.class));
			
		} catch(Exception e) {
			System.out.println("Problem with freezer adt import");
			e.printStackTrace();
		}
	}
	
	private static void populateOvens(JsonObject data, Gson extractor) {
		
		JsonArray array = data.getAsJsonArray("ovens");
		
		try {
			for (JsonElement e : array) 
				OVENS.add(extractor.fromJson(e, OvenADT.class));
			
		} catch(Exception e) {
			System.out.println("Problem with oven adt import");
			e.printStackTrace();
		}
	}
	
	private static void populateRanges(JsonObject data, Gson extractor) {
		
		JsonArray array = data.getAsJsonArray("ranges");
		
		try {
			for (JsonElement e : array) 
				RANGES.add(extractor.fromJson(e, RangeADT.class));
			
		} catch(Exception e) {
			System.out.println("Problem with range adt import");
			e.printStackTrace();
		}
	}
	
	private static void populateRefridgerators(JsonObject data1, JsonObject data2, Gson extractor) {
		
		JsonArray array = data1.getAsJsonArray("refrigerators-wine-chiller");
		JsonArray array2 = data2.getAsJsonArray("fridges2");
		array.addAll(array2);
		
		try {
			for (JsonElement e : array) 
				REFRIDGERATORS.add(extractor.fromJson(e, RefridgeratorADT.class));
			
		} catch(Exception e) {
			System.out.println("Problem with fridge adt import");
			e.printStackTrace();
		}
	}
	
	private static void populateWashers(JsonObject data, Gson extractor) {
		
		JsonArray array = data.getAsJsonArray("washers");
		
		try {
			for (JsonElement e : array) 
				WASHERS.add(extractor.fromJson(e, WasherADT.class));
			
		} catch(Exception e) {
			System.out.println("Problem with washer adt import");
			e.printStackTrace();
		}
	}
	
	private static void populateWasherDryers(JsonObject data, Gson extractor) {
		
		JsonArray array = data.getAsJsonArray("washer-dryers");
		
		try {
			for (JsonElement e : array) 
				WASHER_DRYERS.add(extractor.fromJson(e, WasherDryerADT.class));
			
		} catch(Exception e) {
			System.out.println("Problem with washer dryer adt import");
			e.printStackTrace();
		}
	}

	public static ArrayList<AirConditionerADT> getAirconditioners() {
		return AIRCONDITIONERS;
	}

	public static ArrayList<ClothesDryerADT> getDryers() {
		return DRYERS;
	}

	public static ArrayList<CooktopADT> getCooktops() {
		return COOKTOPS;
	}

	public static ArrayList<DishwasherADT> getDishwashers() {
		return DISHWASHERS;
	}

	public static ArrayList<FreezerADT> getFreezers() {
		return FREEZERS;
	}

	public static ArrayList<OvenADT> getOvens() {
		return OVENS;
	}

	public static ArrayList<RangeADT> getRanges() {
		return RANGES;
	}

	public static ArrayList<RefridgeratorADT> getRefridgerators() {
		return REFRIDGERATORS;
	}

	public static ArrayList<WasherADT> getWashers() {
		return WASHERS;
	}

	public static ArrayList<WasherDryerADT> getWasherDryers() {
		return WASHER_DRYERS;
	}

	
	
	
	
}
