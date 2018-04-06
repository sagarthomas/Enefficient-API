/**
 * This class defines the Cooktop ADT which inherits from the ApplianceADT class.  It is used to store information about appliances from the cooktops dataset
 * @author Matthew Dombrady
 */

package model.adt;

public class CooktopADT extends ApplianceADT {
	
	// These class variables contain every field from the cooktops dataset
	private String AEC_03, COOK_TOP_TYPE_LABEL_EN, COOK_TOP_TYPE_LABEL_FR, NOMINAL_WIDTH_LABEL_EN, NOMINAL_WIDTH_LABEL_FR;
	
	/**
	 * This constructor creates a CooktopADT object
	 * @param BRAND_NAME The appliance's brand name
	 * @param MODEL_NUM_1 The appliance's model number
	 * @param REC_REF_KEY The appliance's unique reference key
	 * @param AEC_03 A number representing the cooktop's annual energy consumption in gigajoules
	 * @param COOK_TOP_TYPE_LABEL_EN An unused field
	 * @param COOK_TOP_TYPE_LABEL_FR An unused field
	 * @param NOMINAL_WIDTH_LABEL_EN An unused field
	 * @param NOMINAL_WIDTH_LABEL_FR An unused field 
	 */
	public CooktopADT(String BRAND_NAME, String MODEL_NUM_1, String REC_REF_KEY, String AEC_03, String COOK_TOP_TYPE_LABEL_EN, String COOK_TOP_TYPE_LABEL_FR, String NOMINAL_WIDTH_LABEL_EN, String NOMINAL_WIDTH_LABEL_FR) {
		super(BRAND_NAME, MODEL_NUM_1, REC_REF_KEY);
		
		this.AEC_03 = AEC_03; 
		this.COOK_TOP_TYPE_LABEL_EN = COOK_TOP_TYPE_LABEL_EN; 
		this.COOK_TOP_TYPE_LABEL_FR = COOK_TOP_TYPE_LABEL_FR;
		this.NOMINAL_WIDTH_LABEL_EN = NOMINAL_WIDTH_LABEL_EN;
		this.NOMINAL_WIDTH_LABEL_FR = NOMINAL_WIDTH_LABEL_FR;
		
	}
	
	// The below methods are getters for every class variable
	
	public String getAEC_03() {
		return this.AEC_03;
	}
	
	public String getCOOK_TOP_TYPE_LABEL_EN() {
		return this.COOK_TOP_TYPE_LABEL_EN;
	}
	
	public String getCOOK_TOP_TYPE_LABEL_FR() {
		return this.COOK_TOP_TYPE_LABEL_FR;
	}
	
	public String getNOMINAL_WIDTH_LABEL_EN() {
		return this.NOMINAL_WIDTH_LABEL_EN;
	}
	
	public String getNOMINAL_WIDTH_LABEL_FR() {
		return this.NOMINAL_WIDTH_LABEL_FR;
	}
	
	public String getConsumption() {
		return this.AEC_03;
	}
}
