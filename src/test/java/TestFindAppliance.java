import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.FindAppliance;
import model.adt.ApplianceADT;

public class TestFindAppliance {
	
	private static ApplianceADT[] array = new ApplianceADT[3];

	@Before
	public void setUp() throws Exception {
		// Initialize predefined array of appliances
		array[0] = new ApplianceADT("Brand1", "123", "00000");
		array[1] = new ApplianceADT("Brand2", "456", "00000");
		array[2] = new ApplianceADT("Brand3", "789", "00000");		
	}

	@Test
	public void testFindBoth() {
		// Case where both specified brand name and model number exist in array
		assert FindAppliance.find(array, "Brand1", "123").getBRAND_NAME() == "Brand1";
	}
	
	@Test
	public void testFindBrandOnly() {
		// Case where specified brand name but not model number exists in array
		assert (FindAppliance.find(array, "Brand1", "WrongModelNum").getBRAND_NAME() == "Brand1" && FindAppliance.find(array, "Brand1", "WrongModelNum").getMMODEL_NUM_1() == "");
	}
	
	@Test
	// Case where neither the specified brand name or model number exists in array
	public void testFindNeither() {
		assert (FindAppliance.find(array, "WrongBrandName", "WrongModelNum").getBRAND_NAME() == "" && FindAppliance.find(array, "WrongBrandName", "WrongModelNum").getMMODEL_NUM_1() == "");
	}
	
	

}
