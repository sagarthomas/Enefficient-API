package model.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import model.adt.*;
import com.google.gson.*;

public class Dataset {
	// ArrayLists for appliances
	private static final ArrayList<AirConditionerADT> AIRCONDITIONERS = new ArrayList<AirConditionerADT>();
	private static final ArrayList<ClothesDryerADT> DRYERS = new ArrayList<ClothesDryerADT>();
	private static final ArrayList<CooktopADT> COOKTOPS = new ArrayList<CooktopADT>();
	private static final ArrayList<DishwasherADT> DISHWASHERS = new ArrayList<DishwasherADT>();
	private static final ArrayList<FreezerADT> FREEZERS = new ArrayList<FreezerADT>();
	private static final ArrayList<OvenADT> OVENS = new ArrayList<OvenADT>();
	private static final ArrayList<RangeADT> RANGES = new ArrayList<RangeADT>();
	private static final ArrayList<RefridgeratorADT> REFRIDGERATORS = new ArrayList<RefridgeratorADT>();
	private static final ArrayList<WasherADT> WASHERS = new ArrayList<WasherADT>();
	private static final ArrayList<WasherDryerADT> WASHER_DRYERS = new ArrayList<WasherDryerADT>();
	
	private static JsonParser parser;
	private static Gson gson;
	
	public static void init() {
		parser = new JsonParser();
		gson = new Gson();
		
		try {
			JsonObject applianceData = parser.parse(new FileReader("src\\\\model\\\\data\\\\appliances.json")).getAsJsonObject();
			
			populateACs(applianceData, gson);
			populateCooktops(applianceData, gson);
			populateDishwashers(applianceData, gson);
			populateDishwashers(applianceData, gson);
			populateDryers(applianceData, gson);
			populateFreezers(applianceData, gson);
			populateOvens(applianceData, gson);
			populateRanges(applianceData, gson);
			populateRefridgerators(applianceData, gson);
			populateWasherDryers(applianceData, gson);
			populateWashers(applianceData, gson);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found! " + e.getMessage());
			e.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Data import and parsing successful!");
		
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
	
	private static void populateRefridgerators(JsonObject data, Gson extractor) {
		
		JsonArray array = data.getAsJsonArray("refrigerators-wine-chiller");
		
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
