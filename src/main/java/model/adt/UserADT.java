package model.adt;

import java.util.ArrayList;

public class UserADT {
	
	private String uid, location, houseType, email;
	private double score;
	private ArrayList<ApplianceADT> appliances;
	
	public UserADT(String uid, String email) {
		this.uid = uid;
		this.email = email;
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

	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
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

	public ArrayList<ApplianceADT> getAppliances() {
		return appliances;
	}

	public void setAppliances(ArrayList<ApplianceADT> appliances) {
		this.appliances = appliances;
	}
	
	

}
