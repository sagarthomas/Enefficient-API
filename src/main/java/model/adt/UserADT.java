package model.adt;

import java.util.ArrayList;
/**
 * An ADT to store all important information about a user of this application
 * @author Sagar Thomas
 *
 */
public class UserADT {
	
	private String uid, location, email;
	private double score;
	private int houseType;
	private ArrayList<ArrayList<ApplianceADT>> appliances;
	
	/**
	 * Initializes the UserADT instance
	 * @param uid Unique id of the user
	 * @param email Email address of the user
	 */
	public UserADT(String uid, String email) {
		this.uid = uid;
		this.email = email;
		this.appliances = new ArrayList<ArrayList<ApplianceADT>>(1);
	}

	/**
	 * Unique id of the user
	 * @return uid 
	 */
	public String getID() {
		return uid;
	}

	/**
	 * Location of the user
	 * @return location 
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets the location of the user
	 * @param location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Gets the house type of the user
	 * @return houseType
	 */
	public int getHouseType() {
		return houseType;
	}

	/**
	 * Sets the house type of the user
	 * @param houseType
	 */
	public void setHouseType(int houseType) {
		this.houseType = houseType;
	}

	/**
	 * Get the email of the user
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email of the user
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the energy score of the user
	 * @return
	 */
	public double getScore() {
		return score;
	}

	/**
	 * Sets the energy score of the user
	 * @param score
	 */
	public void setScore(double score) {
		this.score = score;
	}

	/**
	 * Gets a list of the user's appliances
	 * @return appliances list of all appliances the user has arranged by type
	 */
	public ArrayList<ArrayList<ApplianceADT>> getAppliances() {
		return appliances;
	}


	/**
	 * Sets the list of the user's appliances
	 * @param appliances 
	 */
	public void setAppliances(ArrayList<ArrayList<ApplianceADT>> appliances) {
		this.appliances = appliances;
	}
	
	

}
