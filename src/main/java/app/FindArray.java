package app;
import model.FindAppliance;
import model.adt.*;
import model.util.Dataset;
import model.util.MergeSort;

public class FindArray {
	
	private static ApplianceADT[] array;
	
	public static void main(String[] args) {
		Dataset.init();
		
		
		array = new ClothesDryerADT[Dataset.getDryers().size()];
		Dataset.getDryers().toArray(array);
		
		MergeSort.sort(array);
		
		
		//System.out.println(array[0].getBRAND_NAME());
		ApplianceADT found = FindAppliance.find(array, "GE", "PCKS433ET#**");
		System.out.println(found.getBRAND_NAME());
		System.out.println(((ClothesDryerADT)found).getConsumption());
	}
	
	public static ApplianceADT[] getArray(String type) {
		
		switch(type) {
		
			case "Dryer":
				//array = new ApplianceADT[Dataset.getDryers().size()];
				Dataset.getDryers().toArray(array);
		}
		
		return array;
	}
}
