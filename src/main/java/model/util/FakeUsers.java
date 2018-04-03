package model.util;

import java.util.ArrayList;
import model.adt.ApplianceADT;
import model.adt.UserADT;
import model.adt.UserGraph;
import model.adt.*;
import model.util.Dataset;

public class FakeUsers {
	
	private ArrayList<UserADT> fakeUsers;

	public FakeUsers() {
		
		Dataset.init();
		
		fakeUsers = new ArrayList<UserADT>();		
		ArrayList<ArrayList<ApplianceADT>> apps;		
		
		for (int i = 0; i < 10; i++) {
			fakeUsers.add(new UserADT("user" + i, "user" + i + "@gmail.com" ));
			apps = new ArrayList<ArrayList<ApplianceADT>>();
			
			for (int j = 0; j < 10; j++)
				apps.add(new ArrayList<ApplianceADT>());
			
			apps.get(0).add(Dataset.REFRIDGERATORS.get(i));
			apps.get(1).add(Dataset.WASHERS.get(i));
			apps.get(2).add(Dataset.DRYERS.get(i));
			apps.get(3).add(Dataset.WASHER_DRYERS.get(i));
			apps.get(4).add(Dataset.FREEZERS.get(i));
			apps.get(5).add(Dataset.OVENS.get(i));
			apps.get(6).add(Dataset.COOKTOPS.get(i));
			apps.get(7).add(Dataset.DISHWASHERS.get(i));
			apps.get(8).add(Dataset.RANGES.get(i));
			apps.get(9).add(Dataset.AIRCONDITIONERS.get(i));
			
			fakeUsers.get(i).setAppliances(apps);
			
			
		}
	}
	
	public ArrayList<UserADT> getFakeUsers() {
		return fakeUsers;
	}
	
	
}
