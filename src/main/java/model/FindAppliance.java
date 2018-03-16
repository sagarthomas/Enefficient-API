package model;

import model.adt.ApplianceADT;


public class FindAppliance {
	
	/*public static void main(String[] args) {
		ApplianceADT[] apps = new ApplianceADT[3];
		
		apps[0] = new ApplianceADT("AGE", "12345", "Elijah");
		apps[1] = new ApplianceADT("Elijah", "99999", "Elijah");
		apps[2] = new ApplianceADT("Masure", "MASURE-99", "Elijah");
		
		System.out.println(find(apps, "Elijah", "99999"));
	}*/
	
	public static ApplianceADT find(ApplianceADT[] appliances, String brand, String modelNum) {
		
		System.out.println(appliances.length);
		 
		if (findBrand(appliances, brand)[0] != -1 && findBrand(appliances, brand)[1] != -1 && findModel(appliances, modelNum, findBrand(appliances, brand)) != -1) {
			return appliances[findModel(appliances, modelNum, findBrand(appliances, brand))];
		}
		
		else if (findBrand(appliances, brand)[0] == -1 || findBrand(appliances, brand)[1] == -1) {
			System.out.println("Could not find brand");
			return new ApplianceADT("", "", "");
		}
		
		else {
			System.out.println("Found brand but could not find model");
			return new ApplianceADT(brand, "", "");
		}
	}
	
	private static int[] findBrand(ApplianceADT[] appliances, String brand) {
		
		// This two-element array will denote the start and end index of the section
		// of the appliances array which have the desired brand name
		int[] bounds = new int[2];
		
		// Find an index corresponding to an appliance with the desired brand name
		int brandIndex = binarySearch(appliances, 0, appliances.length-1, brand);
		
		System.out.println(brandIndex);
		int i = brandIndex;
		int j = brandIndex;
		
		
		
		// Look "up" and "down" for the first and last elements with the desired brand name
		
		while (true) {
			
			i--;
			if (i < 0 || i >= appliances.length || appliances[i].getBRAND_NAME().compareTo(brand) != 0) {
				bounds[0] = i+1;
				break;
			}
			
			else {
				bounds[0] = -1;
				break;
			}
		}
		
		while (true) {
			j++;
			if (j < 0 || j >= appliances.length || appliances[j].getBRAND_NAME().compareTo(brand) != 0) {
				bounds[1] = j-1;
				break;
			}
			
			else {
				bounds[1] = -1;
				break;
			}
		}
		
		
		// Return start and end indices
		return bounds;
	}
	
	// Regular binary search
	private static int binarySearch(ApplianceADT[] appliances, int lo, int hi, String brand) {
		
		int mid;
		
		if (hi <= lo) {
			return -1;
		}
		
		mid = lo + (hi-lo)/2;
		
		if (brand.compareTo(appliances[mid].getBRAND_NAME()) > 0) {
			return binarySearch(appliances, mid+1, hi, brand);
		}
		
		else if (brand.compareTo(appliances[mid].getBRAND_NAME()) < 0) {
			return binarySearch(appliances, lo, mid, brand);
		}
		
		return mid;
		
	}
	
	
	private static int findModel(ApplianceADT[] appliances, String modelNum, int[] bounds) {
		
		// Perform a linear search of the appliances array between the bounds
		for (int i = bounds[0]; i <= bounds[1]; i++) {
			if (appliances[i].getMMODEL_NUM_1().compareTo(modelNum) == 0) {
				
				// Return appliance of desired model number
				return i;
			}
		}
		
		return -1;
	}

}
