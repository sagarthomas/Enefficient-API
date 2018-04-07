/**
 * This class uses the graph of users created in UserGraph.java to make appliance recommendations to the user
 * @author Matthew Dombrady
 */

package model.adt;

import java.util.ArrayList;

import app.ApplianceReturn;
//import model.util.Bag;
import model.util.Dataset;

public class Recommend {
	
	// currentUserId is the ID of the current user
	// type will contain the type of the recommended appliance
	// consumption will contain the annual energy consumption of the recommended appliance
	private String currentUserId, type, consumption;
	
	// currentUser will hold the current user's UserADT
	private UserADT currentUser;
	
	// G will contain the graph of users created in UserGraph.java
	private UserGraph G;
	
	// userIndex will contain the house type number of the current user
	// replaceID will contain a number corresponding to the type of appliance which should be replaced
	private int userIndex, replaceID;
	
	// userApps will contain the current user's appliances
	private ArrayList<ApplianceReturn> userApps;
	
	// These variables will contain the average energy consumption for each type of appliance
	private double fridgeAvg, washerAvg, dryerAvg, washdryAvg, freezerAvg, ovenAvg, cooktopAvg, dishwasherAvg, rangeAvg, ACAvg;
	
	// replace will contain the ApplianceADT corresponding to the appliance recommended to the user as a replacement
	private ApplianceADT replace;
	
	/**
	 * This constructor creates a Recommend object
	 * @param G A graph of users
	 * @param currentUserId The ID of the current user
	 */
	public Recommend(UserGraph G, String currentUserId) {
		this.G = G;
		this.currentUserId = currentUserId;
		
		// Search the graph to find which UserADT corresponds to the current user
		this.currentUser = findUser();
		this.userApps = currentUser.getAppliances();
		
		// Call method to calculate the average energy usage of every type of appliance
		calcAverages();
		
		// Find which of the user's appliances should be replaced
		this.replaceID = findReplacement();
		
		// Find replacement recommendation
		replace = replace();
		
		
	}
	
	/**
	 * This method searches the graph of users to find the current user
	 * @return j The UserADT corresponding to the current user
	 */
	private UserADT findUser() {
		for (int i = 0; i < G.V(); i++) {
			for (UserADT j : G.adj(i)) {
				// If the current element's ID matches the current user's ID, that element is the current user
				if (j.getID() == this.currentUserId) {
					// userIndex is assigned to be the vertex in G.adj() which contains the current user.
					// This is because each vertex in G.adj() represents a house type.
					// So, userIndex will allow the algorithm to only inspect other users with the same house type
					// as the current user
	
					this.userIndex = i;
					
					// Return the current user's UserADT
					return j;
				}
			}
		}
		
		return null;
	}
	
	/**
	 * This method calculates, based on each appliance's average, which of the user's appliances needs replacing
	 * @return An index corresponding to the type of appliance which should be replaced
	 */
	private int findReplacement() {
		
		// diff will be used to hold the difference between the user's appliance and its corresponding average
		double diff = 0;
		
		// replaceID will hold the final return value
		int replaceID = 0;
		
		// These loops go through each of the user's appliances and determine
		// which has the greatest difference in energy usage compared to the average.
		// Separate loops must be used due to casting issues (it was determined before
		// that the user's list of appliances will be a 2D array list where each element contains
		// an array list of only one type of element.  This way a unique index can be assigned to represent
		// each type of appliance)
		
		for (ApplianceADT fridge : userApps.get(0)) {
			if (Double.parseDouble(((RefridgeratorADT)fridge).getConsumption()) > fridgeAvg) {
				diff = Double.parseDouble(((RefridgeratorADT)fridge).getConsumption()) - fridgeAvg;
				replaceID = 0;
			}
				
		}
		
		for (ApplianceADT washer : userApps.get(1)) {
			if (Double.parseDouble(((WasherADT)washer).getConsumption()) > washerAvg && Double.parseDouble(((WasherADT)washer).getConsumption()) - washerAvg > diff) {
				diff = Double.parseDouble(((WasherADT)washer).getConsumption()) - washerAvg;
				replaceID = 1;
			}
				
		}
		
		for (ApplianceADT dryer : userApps.get(2)) {
			if (Double.parseDouble(((ClothesDryerADT)dryer).getConsumption()) > dryerAvg && Double.parseDouble(((ClothesDryerADT)dryer).getConsumption()) -dryerAvg > diff) {
				diff = Double.parseDouble(((ClothesDryerADT)dryer).getConsumption()) - dryerAvg;
				replaceID = 2;
			}
				
		}
		
		for (ApplianceADT washdry : userApps.get(3)) {
			if (Double.parseDouble(((WasherDryerADT)washdry).getConsumption()) > washdryAvg && Double.parseDouble(((WasherDryerADT)washdry).getConsumption()) -washdryAvg > diff) {
				diff = Double.parseDouble(((WasherDryerADT)washdry).getConsumption()) - washdryAvg;
				replaceID = 3;
			}
				
		}
		
		for (ApplianceADT freezer : userApps.get(4)) {
			if (Double.parseDouble(((FreezerADT)freezer).getConsumption()) > freezerAvg && Double.parseDouble(((FreezerADT)freezer).getConsumption()) -freezerAvg > diff) {
				diff = Double.parseDouble(((FreezerADT)freezer).getConsumption()) - freezerAvg;
				replaceID = 4;
			}
				
		}
		
		for (ApplianceADT oven : userApps.get(5)) {
			if (Double.parseDouble(((OvenADT)oven).getConsumption()) > ovenAvg && Double.parseDouble(((OvenADT)oven).getConsumption()) -ovenAvg > diff) {
				diff = Double.parseDouble(((OvenADT)oven).getConsumption()) - ovenAvg;
				replaceID = 5;
			}
				
		}
		
		for (ApplianceADT cooktop : userApps.get(6)) {
			if (Double.parseDouble(((CooktopADT)cooktop).getConsumption()) > cooktopAvg && Double.parseDouble(((CooktopADT)cooktop).getConsumption()) -cooktopAvg > diff) {
				diff = Double.parseDouble(((CooktopADT)cooktop).getConsumption()) - cooktopAvg;
				replaceID = 6;
			}
				
		}
		
		for (ApplianceADT dishwash : userApps.get(7)) {
			if (Double.parseDouble(((DishwasherADT)dishwash).getConsumption()) > dishwasherAvg && Double.parseDouble(((DishwasherADT)dishwash).getConsumption()) -dishwasherAvg > diff) {
				diff = Double.parseDouble(((DishwasherADT)dishwash).getConsumption()) - dishwasherAvg;
				replaceID = 7;
			}
				
		}
		
		for (ApplianceADT range : userApps.get(8)) {
			if (Double.parseDouble(((RangeADT)range).getConsumption()) > rangeAvg && Double.parseDouble(((RangeADT)range).getConsumption()) -rangeAvg > diff) {
				diff = Double.parseDouble(((RangeADT)range).getConsumption()) - rangeAvg;
				replaceID = 8;
			}
				
		}
		
		for (ApplianceADT ac : userApps.get(9)) {
			if (Double.parseDouble(((AirConditionerADT)ac).getConsumption()) > ACAvg && Double.parseDouble(((AirConditionerADT)ac).getConsumption()) -ACAvg > diff) {
				diff = Double.parseDouble(((AirConditionerADT)ac).getConsumption()) - ACAvg;
				replaceID = 9;
			}
				
		}
		
		// replaceID contains the index of the appliance which has the greatest difference in energy usage
		// compared to the average
		return replaceID;
				
	}
	
	
	/**
	 * This method goes through the datasets and calculates the average energy usage for each type of appliance
	 */
	private void calcAverages() {
		
		// Initialize the appliance array lists using the datasets
		Dataset.init();
		
		// These loops calculate the average usage for each type of appliance
		
		for (int i = 0; i < Dataset.REFRIDGERATORS.size(); i++) {
			fridgeAvg = fridgeAvg + Double.parseDouble(Dataset.REFRIDGERATORS.get(i).getConsumption());
		}
		
		for (int i = 0; i < Dataset.DISHWASHERS.size(); i++) {
			washerAvg = washerAvg + Double.parseDouble(Dataset.DISHWASHERS.get(i).getConsumption());
		}
		
		for (int i = 0; i < Dataset.DRYERS.size(); i++) {
			dryerAvg = dryerAvg + Double.parseDouble(Dataset.DRYERS.get(i).getConsumption());
		}
		
		for (int i = 0; i < Dataset.WASHER_DRYERS.size(); i++) {
			washdryAvg = washdryAvg + Double.parseDouble(Dataset.WASHER_DRYERS.get(i).getConsumption());
		}
		
		for (int i = 0; i < Dataset.FREEZERS.size(); i++) {
			freezerAvg = freezerAvg + Double.parseDouble(Dataset.FREEZERS.get(i).getConsumption());
		}
		
		for (int i = 0; i < Dataset.OVENS.size(); i++) {
			ovenAvg = ovenAvg + Double.parseDouble(Dataset.OVENS.get(i).getConsumption());
		}
		
		for (int i = 0; i < Dataset.COOKTOPS.size(); i++) {
			cooktopAvg = cooktopAvg + Double.parseDouble(Dataset.COOKTOPS.get(i).getConsumption());
		}
		
		for (int i = 0; i < Dataset.DISHWASHERS.size(); i++) {
			dishwasherAvg = dishwasherAvg + Double.parseDouble(Dataset.DISHWASHERS.get(i).getConsumption());
		}
		
		for (int i = 0; i < Dataset.RANGES.size(); i++) {
			rangeAvg = rangeAvg + Double.parseDouble(Dataset.RANGES.get(i).getConsumption());
		}
		
		for (int i = 0; i < Dataset.AIRCONDITIONERS.size(); i++) {
			ACAvg = ACAvg + Double.parseDouble(Dataset.AIRCONDITIONERS.get(i).getConsumption());
		}
	}
	
	/**
	 * This method looks through each user who has the same house type as the current user, and recommends the appliance (of the same type as determined in findReplacement()) would best improve the current user's score
	 * @return The ApplianceADT corresponding with the replacement recommendation
	 */
	public ApplianceADT replace() {
		
		// diff will be used to contain the difference in energy usage between the user
		double diff = 0;
		ApplianceADT replace = null;
		
		// This loop goes through every user who has the same house type as the current user
		for (UserADT user : G.adj(userIndex)) {
			// Only inspect other users, not the current user
			if (user != currentUser) {
				
				// apps is an array list containing a user's appliances only of the type corresponding to replaceID
				ArrayList<ApplianceADT> apps = user.getAppliances().get(replaceID);
				
				// This loop goes through apps and calculates the difference between each appliance and the average.
				// It only changes diff if the difference will be greater than the previous value
				for (int i = 0; i < apps.size(); i++) {
					
					switch(replaceID) {
					
					case 0:
						if (Double.parseDouble(((RefridgeratorADT)apps.get(i)).getConsumption()) < fridgeAvg && fridgeAvg - Double.parseDouble(((RefridgeratorADT)apps.get(i)).getConsumption()) > diff) {
							replace = apps.get(i);
							diff = fridgeAvg - Double.parseDouble(((RefridgeratorADT)apps.get(i)).getConsumption());
							type = "Refridgerator";
							consumption = ((RefridgeratorADT)apps.get(i)).getConsumption();
						}
						break;
						
					case 1:
						if (Double.parseDouble(((WasherADT)apps.get(i)).getConsumption()) < washerAvg && washerAvg - Double.parseDouble(((WasherADT)apps.get(i)).getConsumption()) > diff) {
							replace = apps.get(i);
							diff = washerAvg - Double.parseDouble(((WasherADT)apps.get(i)).getConsumption());
							type = "Washer";
							consumption = ((WasherADT)apps.get(i)).getConsumption();
						}
						break;
						
					case 2:
						if (Double.parseDouble(((ClothesDryerADT)apps.get(i)).getConsumption()) < dryerAvg && dryerAvg - Double.parseDouble(((ClothesDryerADT)apps.get(i)).getConsumption()) > diff) {
							replace = apps.get(i);
							diff = dryerAvg - Double.parseDouble(((ClothesDryerADT)apps.get(i)).getConsumption());
							type = "Dryer";
							consumption = ((ClothesDryerADT)apps.get(i)).getConsumption();
						}
						break;
						
					case 3:
						
						if (Double.parseDouble(((WasherDryerADT)apps.get(i)).getConsumption()) < washdryAvg && washdryAvg - Double.parseDouble(((WasherDryerADT)apps.get(i)).getConsumption()) > diff) {
							replace = apps.get(i);
							diff = washdryAvg - Double.parseDouble(((WasherDryerADT)apps.get(i)).getConsumption());
							type = "Washer-Dryer";
							consumption = ((WasherDryerADT)apps.get(i)).getConsumption();
						}
						break;
						
					case 4:
						if (Double.parseDouble(((FreezerADT)apps.get(i)).getConsumption()) < freezerAvg && freezerAvg - Double.parseDouble(((FreezerADT)apps.get(i)).getConsumption()) > diff) {
							replace = apps.get(i);
							diff = freezerAvg - Double.parseDouble(((FreezerADT)apps.get(i)).getConsumption());
							type = "Freezer";
							consumption = ((FreezerADT)apps.get(i)).getConsumption();
						}
						break;
						
					case 5:
						if (Double.parseDouble(((OvenADT)apps.get(i)).getConsumption()) < ovenAvg && ovenAvg - Double.parseDouble(((OvenADT)apps.get(i)).getConsumption()) > diff) {
							replace = apps.get(i);
							diff = ovenAvg - Double.parseDouble(((OvenADT)apps.get(i)).getConsumption());
							type = "Oven";
							consumption = ((OvenADT)apps.get(i)).getConsumption();
						}
						break;
						
					case 6:
						if (Double.parseDouble(((CooktopADT)apps.get(i)).getConsumption()) < cooktopAvg && cooktopAvg - Double.parseDouble(((CooktopADT)apps.get(i)).getConsumption()) > diff) {
							replace = apps.get(i);
							diff = cooktopAvg - Double.parseDouble(((CooktopADT)apps.get(i)).getConsumption());
							type = "Cooktop";
							consumption = ((CooktopADT)apps.get(i)).getConsumption();
						}
						break;
						
					case 7:
						if (Double.parseDouble(((DishwasherADT)apps.get(i)).getConsumption()) < dishwasherAvg && dishwasherAvg - Double.parseDouble(((DishwasherADT)apps.get(i)).getConsumption()) > diff) {
							replace = apps.get(i);
							diff = dishwasherAvg - Double.parseDouble(((DishwasherADT)apps.get(i)).getConsumption());
							type = "DIshwasher";
							consumption = ((DishwasherADT)apps.get(i)).getConsumption();
						}
						break;
						
					case 8:
						if (Double.parseDouble(((RangeADT)apps.get(i)).getConsumption()) < rangeAvg && rangeAvg - Double.parseDouble(((RangeADT)apps.get(i)).getConsumption()) > diff) {
							replace = apps.get(i);
							diff = rangeAvg - Double.parseDouble(((RangeADT)apps.get(i)).getConsumption());
							type = "Range";
							consumption = ((RangeADT)apps.get(i)).getConsumption();
						}
						break;
						
					case 9:
						if (Double.parseDouble(((AirConditionerADT)apps.get(i)).getConsumption()) < ACAvg && ACAvg - Double.parseDouble(((AirConditionerADT)apps.get(i)).getConsumption()) > diff) {
							replace = apps.get(i);
							diff = ACAvg - Double.parseDouble(((AirConditionerADT)apps.get(i)).getConsumption());
							type = "Air Conditioner";
							consumption = ((AirConditionerADT)apps.get(i)).getConsumption();
						}
						break;
					}
				}
			}
		}
		
		// Return the ApplianceADT with the best difference
		return replace;
	}
	
	/**
	 * Accessor for the replacement's consumption
	 * @return The consumption of the recommended replacement
	 */
	public String getConsumption() {
		return consumption;
	}
	
	/**
	 * Accessor for the replacement's type
	 * @return The type of the recommended replacement
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Accessor for the replaceID
	 * @return replaceID, an index corresponding to which type of appliance should be replaced
	 */
	public int replaceID() {
		return replaceID;
	}

}
