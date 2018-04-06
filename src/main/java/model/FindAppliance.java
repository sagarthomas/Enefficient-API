/**
 * This class searches the dataset for an appliance specified by the user
 * @author Matthew Dombrady
 */

package model;

import java.util.ArrayList;

import model.adt.ApplianceADT;
import model.adt.CooktopADT;
import model.adt.RangeADT;
import model.util.Dataset;
import model.util.MergeSort;

public class FindAppliance {

	/**
	 * This method returns the found appliance so it can be added to the user's account
	 * @param appliances An array of appliances to search
	 * @param brand The brand name of the desired appliance
	 * @param modelNum The model number of the desired appliance
	 * @return The found appliance
	 */
	public static ApplianceADT find(ApplianceADT[] appliances, String brand, String modelNum) {
		
	
		// This "if" statement corresponds to if the appliance can be found
		if (findBrand(appliances, brand)[0] != -1 && findBrand(appliances, brand)[1] != -1 && findModel(appliances, modelNum, findBrand(appliances, brand)) != -1) {
			return appliances[findModel(appliances, modelNum, findBrand(appliances, brand))];
		}
		
		// This "if" statement corresponds to if the brand name cannot be found
		else if (findBrand(appliances, brand)[0] == -1 || findBrand(appliances, brand)[1] == -1) {
			System.out.println("Could not find brand");
			
			// Return placeholder ApplianceADT
			return new ApplianceADT("", "", "");
		}
		
		// This corresponds to when the brand can be found but not the model number
		else {
			System.out.println("Found brand but could not find model");
			
			// Return placeholder ApplianceADT
			return new ApplianceADT(brand, "", "");
		}
	}
	
	
	/**
	 * This method employs binary search to locate the section of the dataset with brand names corresponding to the specified brand name
	 * @param appliances The list of appliances from the dataset
	 * @param brand The specified brand name
	 * @return A tuple containing the bounds within which all appliances have the specified brand name
	 */
	private static int[] findBrand(ApplianceADT[] appliances, String brand) {
		
		// This two-element array will denote the start and end index of the section
		// of the appliances array which have the desired brand name
		int[] bounds = {-1, -1};
		
		// Find an index corresponding to an appliance with the desired brand name
		int brandIndex = binarySearch(appliances, 0, appliances.length-1, brand);
		
		int i = brandIndex;
		int j = brandIndex;
		
		
		
		// Look "up" and "down" for the first and last elements with the desired brand name
		
		while (true) {
						
			i--;
			if (i < 0 || i >= appliances.length || appliances[i].getBRAND_NAME().compareTo(brand) != 0) {
				bounds[0] = i+1;
				break;
			}
			
		}
		
		while (true) {
			j++;
			if (j < 0 || j >= appliances.length || appliances[j].getBRAND_NAME().compareTo(brand) != 0) {
				bounds[1] = j-1;
				break;
			}
			
		}
		
		
		// Return start and end indices
		return bounds;
	}
	
	// Regular binary search
	
	/**
	 * Regular binary search
	 * @param appliances The list of appliances from the dataset
	 * @param lo The lower boundary
	 * @param hi The higher boundary
	 * @param brand The brand name of the desired appliance
	 * @return An index at which the appliance has the specified brand name; not necessarily the desired appliance
	 */
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
	
	/**
	 * This method searches the section of the array specified by the bounds determined in findBrand() for the desired model number
	 * @param appliances The array of appliances from the dataset
	 * @param modelNum The specified model number
	 * @param bounds The bounds calculated in findBrand
	 * @return The index of the desired appliance
	 */
	private static int findModel(ApplianceADT[] appliances, String modelNum, int[] bounds) {
		
		// Perform a linear search of the appliances array between the bounds
		for (int i = bounds[0]; i <= bounds[1]; i++) {
			if (appliances[i].getMMODEL_NUM_1().compareTo(modelNum) == 0) {
				
				// Return appliance of desired model number
				return i;
			}
		}
		
		// Retunr -1 if model number not found
		return -1;
	}

}
