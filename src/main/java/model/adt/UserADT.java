package model.adt;

import java.util.ArrayList;

import app.ApplianceReturn;

public class UserADT {
	
	private String uid, location, email;
	private double score;
	private int houseType;
	private ArrayList<ApplianceReturn> appliances;
	
	public UserADT(String uid, String email) {
		this.uid = uid;
		this.email = email;
		this.appliances = new ArrayList<ApplianceReturn>();
	}

	public String getID() {
		return uid;
	}


	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getHouseType() {
		return houseType;
	}

	public void setHouseType(int houseType) {
		this.houseType = houseType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public ArrayList<ApplianceReturn> getAppliances() {
		return appliances;
	}

	public void setAppliances(ArrayList<ApplianceReturn> appliances) {
		this.appliances = appliances;
	}
	
	

}
