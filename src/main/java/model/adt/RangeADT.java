/**
 * This class defines the Range ADT which inherits from the ApplianceADT class.  It is used to store information about appliances from the ranges dataset
 * @author Matthew Dombrady
 */

package model.adt;

public class RangeADT extends ApplianceADT {
	
	// These class variables contain every field from the appliances in the ranges dataset
	private String AEC_03, RANGE_TYPE_LABEL_EN, RANGE_TYPE_LABEL_FR, COOKTOP_TYPE_LABEL_EN, COOKTOP_TYPE_LABEL_FR, OVEN_EQUIP_TYPE_LABEL_EN, OVEN_EQUIP_TYPE_LABEL_FR, OVEN_TYPE_LABEL_EN, OVEN_TYPE_LABEL_FR, OVEN_COOK_METH_LABEL_EN, OVEN_COOK_METH_LABEL_FR, USE_OVEN_SPACE_LOWER, USE_OVEN_SPACE_UPPER, NOMINAL_WIDTH_LABEL_EN, NOMINAL_WIDTH_LABEL_FR;
		
	/**
	 * This constructor creates a RangeADT object
	 * @param BRAND_NAME The appliance's brand name
	 * @param MODEL_NUM_1 The appliance's model number
	 * @param REC_REF_KEY The appliance's unique reference key
	 * @param AEC_03 A number representing the range's annual energy consumption in gigajoules
	 * @param RANGE_TYPE_LABEL_EN An unused field
	 * @param RANGE_TYPE_LABEL_FR An unused field
	 * @param COOKTOP_TYPE_LABEL_EN An unused field
	 * @param COOKTOP_TYPE_LABEL_FR An unused field
	 * @param OVEN_EQUIP_TYPE_LABEL_EN An unused field
	 * @param OVEN_EQUIP_TYPE_LABEL_FR An unused field
	 * @param OVEN_TYPE_LABEL_EN An unused field
	 * @param OVEN_TYPE_LABEL_FR An unused field
	 * @param OVEN_COOK_METH_LABEL_EN An unused field
	 * @param OVEN_COOK_METH_LABEL_FR An unused field
	 * @param USE_OVEN_SPACE_LOWER An unused field
	 * @param USE_OVEN_SPACE_UPPER An unused field
	 * @param NOMINAL_WIDTH_LABEL_EN An unused field
	 * @param NOMINAL_WIDTH_LABEL_FR An unused field
	 */
	public RangeADT(String BRAND_NAME, String MODEL_NUM_1, String REC_REF_KEY, String AEC_03, String RANGE_TYPE_LABEL_EN, String RANGE_TYPE_LABEL_FR, String COOKTOP_TYPE_LABEL_EN, String COOKTOP_TYPE_LABEL_FR, String OVEN_EQUIP_TYPE_LABEL_EN, String OVEN_EQUIP_TYPE_LABEL_FR, String OVEN_TYPE_LABEL_EN, String OVEN_TYPE_LABEL_FR, String OVEN_COOK_METH_LABEL_EN, String OVEN_COOK_METH_LABEL_FR, String USE_OVEN_SPACE_LOWER, String USE_OVEN_SPACE_UPPER, String NOMINAL_WIDTH_LABEL_EN, String NOMINAL_WIDTH_LABEL_FR) {
		super(BRAND_NAME, MODEL_NUM_1, REC_REF_KEY);
		
		this.AEC_03 = AEC_03;
		this.RANGE_TYPE_LABEL_EN = RANGE_TYPE_LABEL_EN; 
		this.RANGE_TYPE_LABEL_FR = RANGE_TYPE_LABEL_FR;
		this.COOKTOP_TYPE_LABEL_EN = COOKTOP_TYPE_LABEL_EN;
		this.COOKTOP_TYPE_LABEL_FR = COOKTOP_TYPE_LABEL_FR;
		this.OVEN_EQUIP_TYPE_LABEL_EN = OVEN_EQUIP_TYPE_LABEL_EN;
		this.OVEN_EQUIP_TYPE_LABEL_FR = OVEN_EQUIP_TYPE_LABEL_FR;
		this.OVEN_TYPE_LABEL_EN = OVEN_TYPE_LABEL_EN;
		this.OVEN_TYPE_LABEL_FR = OVEN_TYPE_LABEL_FR;
		this.OVEN_COOK_METH_LABEL_EN = OVEN_COOK_METH_LABEL_EN;
		this.OVEN_COOK_METH_LABEL_FR = OVEN_COOK_METH_LABEL_FR;
		this.USE_OVEN_SPACE_LOWER = USE_OVEN_SPACE_LOWER;
		this.USE_OVEN_SPACE_UPPER = USE_OVEN_SPACE_UPPER;
		this.NOMINAL_WIDTH_LABEL_EN = NOMINAL_WIDTH_LABEL_EN;
		this.NOMINAL_WIDTH_LABEL_FR = NOMINAL_WIDTH_LABEL_FR;
	}
	
	// The below methods are getters for every class variable
	
	public String getAEC_03() {
		return this.AEC_03;
	}
	
	public String getRANGE_TYPE_LABEL_EN() {
		return this.RANGE_TYPE_LABEL_EN;
	}
	
	public String getRANGE_TYPE_LABEL_FR() {
		return this.RANGE_TYPE_LABEL_FR;
	}
	
	public String getCOOKTOP_TYPE_LABEL_EN() {
		return this.COOKTOP_TYPE_LABEL_FR;
	}
	
	public String getCOOKTOP_TYPE_LABEL_FR() {
		return this.COOKTOP_TYPE_LABEL_FR;
	}
	
	public String getOVEN_EQUIP_TYPE_LABEL_EN() {
		return this.OVEN_EQUIP_TYPE_LABEL_EN;
	}
	
	public String getOVEN_EQUIP_TYPE_LABEL_FR() {
		return this.OVEN_EQUIP_TYPE_LABEL_FR;
	}
	
	public String geOVEN_TYPE_LABEL_EN() {
		return this.OVEN_TYPE_LABEL_EN;
	}
	
	
	public String getOVEN_TYPE_LABEL_FR() {
		return this.OVEN_TYPE_LABEL_FR;
	}
	
	public String getOVEN_COOK_METH_LABEL_EN() {
		return this.OVEN_COOK_METH_LABEL_EN;
	}
	
	public String getOVEN_COOK_METH_LABEL_FR() {
		return this.OVEN_COOK_METH_LABEL_FR;
	}
	
	public String getUSE_OVEN_SPACE_LOWER() {
		return this.USE_OVEN_SPACE_LOWER;
	}
	
	public String getUSE_OVEN_SPACE_UPPER() {
		return this.USE_OVEN_SPACE_UPPER;
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