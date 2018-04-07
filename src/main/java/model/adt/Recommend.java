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
	private ApplianceReturn replace;
	
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
		
		// Find replacement recommendation
		findReplacement();
		
		
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
	 * This method calculates, based on comapring the user's appliances with other users', which appliance should be replaced
	 * @return An index corresponding to the type of appliance which should be replaced
	 */
	private void findReplacement() {
		
		// diff will be used to hold the difference between the user's appliance and its corresponding average
		double diff = 0;
		
		// This loop goes through every user of the same house type in the graph
		for (UserADT u : G.adj(userIndex)) {
			
			// Only compare to other users, not the current user itself
			if (u != currentUser) {
				
				// This array list will hold the appliances to be compared to from the other user
				ArrayList<ApplianceReturn> compareApps = u.getAppliances();
				
				// These loops compare every appliance from the current user to every appliance from the other user
				for (ApplianceReturn a : currentUser.getAppliances()) {
					for (ApplianceReturn b : compareApps) {
						
						// Only consider the comparison if the appliances being compared are of the same type
						if (a.getType().equals(b.getType()) && Double.parseDouble(a.getConsumption()) > Double.parseDouble(b.getConsumption())) {
							
							// If the difference in consumptionsis greater than the previous maximum difference, set the appliance from the other user to be the replacement
							if (Double.parseDouble(a.getConsumption()) - Double.parseDouble(b.getConsumption()) > diff) {
								diff = Double.parseDouble(a.getConsumption()) - Double.parseDouble(b.getConsumption());
								replace = b;
							}
						}
					}
				}
			}
		}
		
	
	}
}
		
		
		
