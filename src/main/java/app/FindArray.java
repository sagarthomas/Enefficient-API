package app;

import model.adt.ApplianceADT;
import model.util.Dataset;

public class FindArray {
	
	private static ApplianceADT[] array;
	
	public static void main(String[] args) {
		Dataset.init();
		System.out.println(Dataset.getDryers());
	}
	
	public static ApplianceADT[] getArray(String type) {
		
		switch(type) {
		
			case "Dryer":
				array = new ApplianceADT[Dataset.getDryers().size()];
				Dataset.getDryers().toArray(array);
		}
		
		return array;
	}
}
