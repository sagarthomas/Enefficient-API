package model.adt;

import java.util.ArrayList;

import model.util.Bag;
import model.util.Dataset;

public class Recommend {
	
	private String currentUserId;
	private UserADT currentUser;
	private UserGraph G;
	private int userIndex, replaceID;
	private ArrayList<ArrayList<ApplianceADT>> userApps;
	private double fridgeAvg, washerAvg, dryerAvg, washdryAvg, freezerAvg, ovenAvg, cooktopAvg, dishwasherAvg, rangeAvg, ACAvg;
	
	public Recommend(UserGraph G, String currentUserId, ArrayList<ArrayList<ApplianceADT>> userApps, int recommendIndex) {
		this.G = G;
		this.currentUserId = currentUserId;
		this.currentUser = findUser();
		this.userApps = userApps;
		
		calcAverages();
		this.replaceID = findReplacement();
		
	}
	
	private UserADT findUser() {
		for (int i = 0; i < G.V(); i++) {
			for (UserADT j : G.adj(i)) {
				if (j.getID() == this.currentUserId) {
					this.userIndex = i;
					return j;
				}
			}
		}
		
		return null;
	}
	
	private int findReplacement() {
		
		double diff = 0;
		int replaceID = 0;
		
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
		
		return replaceID;
				
	}
	
	private void calcAverages() {
		
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
	
	public ApplianceADT replace() {
		
		double diff = 0;
		ApplianceADT replace = null;
		
		for (UserADT user : G.adj(userIndex)) {
			if (user != currentUser) {
				ArrayList<ApplianceADT> apps = user.getAppliances().get(replaceID);
				
				for (int i = 0; i < apps.size(); i++) {
					
					switch(replaceID) {
					
					case 0:
						if (Double.parseDouble(((RefridgeratorADT)apps.get(i)).getConsumption()) < fridgeAvg && fridgeAvg - Double.parseDouble(((RefridgeratorADT)apps.get(i)).getConsumption()) > diff) {
							replace = apps.get(i);
							diff = fridgeAvg - Double.parseDouble(((RefridgeratorADT)apps.get(i)).getConsumption());
						}
						break;
						
					case 1:
						if (Double.parseDouble(((WasherADT)apps.get(i)).getConsumption()) < washerAvg && washerAvg - Double.parseDouble(((WasherADT)apps.get(i)).getConsumption()) > diff) {
							replace = apps.get(i);
							diff = washerAvg - Double.parseDouble(((WasherADT)apps.get(i)).getConsumption());
						}
						break;
						
					case 2:
						if (Double.parseDouble(((ClothesDryerADT)apps.get(i)).getConsumption()) < dryerAvg && dryerAvg - Double.parseDouble(((ClothesDryerADT)apps.get(i)).getConsumption()) > diff) {
							replace = apps.get(i);
							diff = dryerAvg - Double.parseDouble(((ClothesDryerADT)apps.get(i)).getConsumption());
						}
						break;
						
					case 3:
						if (Double.parseDouble(((WasherDryerADT)apps.get(i)).getConsumption()) < washdryAvg && washdryAvg - Double.parseDouble(((WasherDryerADT)apps.get(i)).getConsumption()) > diff) {
							replace = apps.get(i);
							diff = washdryAvg - Double.parseDouble(((WasherDryerADT)apps.get(i)).getConsumption());
						}
						break;
						
					case 4:
						if (Double.parseDouble(((FreezerADT)apps.get(i)).getConsumption()) < freezerAvg && freezerAvg - Double.parseDouble(((FreezerADT)apps.get(i)).getConsumption()) > diff) {
							replace = apps.get(i);
							diff = freezerAvg - Double.parseDouble(((FreezerADT)apps.get(i)).getConsumption());
						}
						break;
						
					case 5:
						if (Double.parseDouble(((OvenADT)apps.get(i)).getConsumption()) < ovenAvg && ovenAvg - Double.parseDouble(((OvenADT)apps.get(i)).getConsumption()) > diff) {
							replace = apps.get(i);
							diff = ovenAvg - Double.parseDouble(((OvenADT)apps.get(i)).getConsumption());
						}
						break;
						
					case 6:
						if (Double.parseDouble(((CooktopADT)apps.get(i)).getConsumption()) < cooktopAvg && cooktopAvg - Double.parseDouble(((CooktopADT)apps.get(i)).getConsumption()) > diff) {
							replace = apps.get(i);
							diff = cooktopAvg - Double.parseDouble(((CooktopADT)apps.get(i)).getConsumption());
						}
						break;
						
					case 7:
						if (Double.parseDouble(((DishwasherADT)apps.get(i)).getConsumption()) < dishwasherAvg && dishwasherAvg - Double.parseDouble(((DishwasherADT)apps.get(i)).getConsumption()) > diff) {
							replace = apps.get(i);
							diff = dishwasherAvg - Double.parseDouble(((DishwasherADT)apps.get(i)).getConsumption());
						}
						break;
						
					case 8:
						if (Double.parseDouble(((RangeADT)apps.get(i)).getConsumption()) < rangeAvg && rangeAvg - Double.parseDouble(((RangeADT)apps.get(i)).getConsumption()) > diff) {
							replace = apps.get(i);
							diff = rangeAvg - Double.parseDouble(((RangeADT)apps.get(i)).getConsumption());
						}
						break;
						
					case 9:
						if (Double.parseDouble(((AirConditionerADT)apps.get(i)).getConsumption()) < ACAvg && ACAvg - Double.parseDouble(((AirConditionerADT)apps.get(i)).getConsumption()) > diff) {
							replace = apps.get(i);
							diff = ACAvg - Double.parseDouble(((AirConditionerADT)apps.get(i)).getConsumption());
						}
						break;
					}
				}
			}
		}
		
		return replace;
	}

}
