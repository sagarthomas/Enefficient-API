package model.adt;

import java.util.ArrayList;

import app.ApplianceReturn;

/**
 * An ADT to store a user's information
 * @author Sagar Thomas
 *
 */
public class UserADT {
	
	private String uid, location, email;
	private double score;
	private int houseType;
	private ArrayList<ApplianceReturn> appliances;
	
	/**
	 * Constructor 
	 * @param uid unique id of the user
	 * @param email email address of the user
	 */
	public UserADT(String uid, String email) {
		this.uid = uid;
		this.email = email;
		this.appliances = new ArrayList<ApplianceReturn>();
	}

	/**
	 * Gets the user id
	 * @return id 
	 */
	public String getID() {
		return uid;
	}

	/**
	 * Returns the user's location
	 * @return location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets the location
	 * @param location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Gets the house type
	 * @return houseType
	 */
	public int getHouseType() {
		return houseType;
	}

	/**
	 * Sets the house type 
	 * @param houseType
	 */
	public void setHouseType(int houseType) {
		this.houseType = houseType;
	}

	/**
	 * Gets the email
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the score
	 * @return score
	 */
	public double getScore() {
		return score;
	}

	/**
	 * Sets the score
	 * @param score
	 */
	public void setScore(double score) {
		this.score = score;
	}

	/**
	 * Gets the list of appliances
	 * @return appliances
	 */
	public ArrayList<ApplianceReturn> getAppliances() {
		return appliances;
	}

	/**
	 * Sets the appliances
	 * @param appliances
	 */
	public void setAppliances(ArrayList<ApplianceReturn> appliances) {
		this.appliances = appliances;
	}
	
	

}
