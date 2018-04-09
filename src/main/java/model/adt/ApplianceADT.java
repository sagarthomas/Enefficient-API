/**
 * This class defines the Appliance ADT which will be the superclass every type of appliance inherits from
 * @author Matthew Dombrady
 */

package model.adt;

/**
 * This class defines the Appliance ADT which will be the superclass every type of appliance inherits from
 * @author Matthew Dombrady
 */
public class ApplianceADT {

	// These class variables contain every field common between all types of appliances from the datasets 
	private String BRAND_NAME, MODEL_NUM_1, REC_REF_KEY;
	
	/**
	 * This constructor defines the ApplianceADT superclass
	 * @param BRAND_NAME A string containing the appliance's brand name
	 * @param MODEL_NUM_1 A string representing the appliance's model number
	 * @param REC_REF_KEY A string representing the appliance's unique reference key
	 */
	public ApplianceADT(String BRAND_NAME, String MODEL_NUM_1, String REC_REF_KEY) {
		this.BRAND_NAME = BRAND_NAME;
		this.MODEL_NUM_1 = MODEL_NUM_1;
		this.REC_REF_KEY = REC_REF_KEY;
	}

	// The below methods are getters for all class variables
	public String getBRAND_NAME() {
		return this.BRAND_NAME;
	}
	
	public String getMMODEL_NUM_1() {
		return this.MODEL_NUM_1;
	}
	
	
	public String getREC_REF_KEY() {
		return this.REC_REF_KEY;
	}
	
}
