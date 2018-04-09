
package model.adt;
/**
 * This class defines the Washer ADT which inherits from the ApplianceADT class.  It is used to store information about appliances from the washers dataset
 * @author Matthew Dombrady
 */
public class WasherADT extends ApplianceADT {
	
	// These class variables contain every field from the washers dataset
	private String MOD_J1_AEC, TYPE_LABEL_EN, TYPE_LABEL_FR, AVG_L_PER_CYCLE, PROD_CLASS_LABEL_EN, PROD_CLASS_LABEL_FR, PAYMENT_MECH_LABEL_EN, PAYMENT_MECH_LABEL_FR, CAPACITY, MAX_WASH_TEMP_AVAIL_LABEL_EN, MAX_WASH_TEMP_AVAIL_LABEL_FR, WATER_LEVELS_CONTROL_LABEL_EN, WATER_LEVELS_CONTROL_LABEL_FR, MOD_J1_EF_LIT, WATER_CON_FACTOR, ANNUAL_WATER_CON_L;
	
	/**
	 * This constructor creates a WasherADT object
	 * @param BRAND_NAME The appliance's brand name
	 * @param MODEL_NUM_1 The appliance's model number
	 * @param REC_REF_KEY The appliance's unique reference key
	 * @param MOD_J1_AEC A number representing the washer's annual energy consumption in gigajoules
	 * @param TYPE_LABEL_EN An unused field
	 * @param TYPE_LABEL_FR An unused field
	 * @param AVG_L_PER_CYCLE An unused field
	 * @param PROD_CLASS_LABEL_EN An unused field
	 * @param PROD_CLASS_LABEL_FR An unused field
	 * @param PAYMENT_MECH_LABEL_EN An unused field
	 * @param PAYMENT_MECH_LABEL_FR An unused field
	 * @param CAPACITY An unused field
	 * @param MAX_WASH_TEMP_AVAIL_LABEL_EN An unused field
	 * @param MAX_WASH_TEMP_AVAIL_LABEL_FR An unused field
	 * @param WATER_LEVELS_CONTROL_LABEL_EN An unused field
	 * @param WATER_LEVELS_CONTROL_LABEL_FR An unused field
	 * @param MOD_J1_EF_LIT An unused field
	 * @param WATER_CON_FACTOR An unused field
	 * @param ANNUAL_WATER_CON_L An unused field
	 */
	public WasherADT(String BRAND_NAME, String MODEL_NUM_1, String REC_REF_KEY, String MOD_J1_AEC, String TYPE_LABEL_EN, String TYPE_LABEL_FR, String AVG_L_PER_CYCLE, String PROD_CLASS_LABEL_EN, String PROD_CLASS_LABEL_FR, String PAYMENT_MECH_LABEL_EN, String PAYMENT_MECH_LABEL_FR, String CAPACITY, String MAX_WASH_TEMP_AVAIL_LABEL_EN, String MAX_WASH_TEMP_AVAIL_LABEL_FR, String WATER_LEVELS_CONTROL_LABEL_EN, String WATER_LEVELS_CONTROL_LABEL_FR, String MOD_J1_EF_LIT, String WATER_CON_FACTOR, String ANNUAL_WATER_CON_L) {
		super(BRAND_NAME, MODEL_NUM_1, REC_REF_KEY);
		this.MOD_J1_AEC = MOD_J1_AEC;
		this.TYPE_LABEL_EN = TYPE_LABEL_EN; 
		this.TYPE_LABEL_FR = TYPE_LABEL_FR;
		this.AVG_L_PER_CYCLE = AVG_L_PER_CYCLE;
		this.PROD_CLASS_LABEL_EN = PROD_CLASS_LABEL_EN;
		this.PROD_CLASS_LABEL_FR = PROD_CLASS_LABEL_FR;
		this.PAYMENT_MECH_LABEL_EN = PAYMENT_MECH_LABEL_EN;
		this.PAYMENT_MECH_LABEL_FR = PAYMENT_MECH_LABEL_FR;
		this.CAPACITY = CAPACITY;
		this.MAX_WASH_TEMP_AVAIL_LABEL_EN = MAX_WASH_TEMP_AVAIL_LABEL_EN; 
		this.MAX_WASH_TEMP_AVAIL_LABEL_FR = MAX_WASH_TEMP_AVAIL_LABEL_FR;
		this.WATER_LEVELS_CONTROL_LABEL_EN = WATER_LEVELS_CONTROL_LABEL_EN;
		this.WATER_LEVELS_CONTROL_LABEL_FR = WATER_LEVELS_CONTROL_LABEL_FR; 
		this.MOD_J1_EF_LIT = MOD_J1_EF_LIT;
		this.WATER_CON_FACTOR = WATER_CON_FACTOR;
		this.ANNUAL_WATER_CON_L = ANNUAL_WATER_CON_L;
		
	}
	
	// The below methods are getters for every class variable
	
	public String getMOD_J1_AEC() {
		return this.MOD_J1_AEC;
	}
	
	public String getTYPE_LABEL_EN() {
		return this.TYPE_LABEL_EN;
	}
	
	public String getTYPE_LABEL_FR() {
		return this.TYPE_LABEL_FR;
	}
	
	public String getAVG_L_PER_CYCLE() {
		return this.AVG_L_PER_CYCLE;
	}
	
	public String getPROD_CLASS_LABEL_EN() {
		return this.PROD_CLASS_LABEL_EN;
	}
	
	public String getPROD_CLASS_LABEL_FR() {
		return this.PROD_CLASS_LABEL_FR;
	}
	
	public String getPAYMENT_MECH_LABEL_EN() {
		return this.PAYMENT_MECH_LABEL_EN;
	}
	
	public String getPAYMENT_MECH_LABEL_FR() {
		return this.PAYMENT_MECH_LABEL_FR;
	}
	
	public String getCAPACITY() {
		return this.CAPACITY;
	}
	
	public String getMAX_WASH_TEMP_AVAIL_LABEL_EN() {
		return this.MAX_WASH_TEMP_AVAIL_LABEL_EN;
	}
	
	public String getMAX_WASH_TEMP_AVAIL_LABEL_FR() {
		return this.MAX_WASH_TEMP_AVAIL_LABEL_FR;
	}
	
	public String getWATER_LEVELS_CONTROL_LABEL_EN() {
		return this.WATER_LEVELS_CONTROL_LABEL_EN;
	}
	
	public String getWATER_LEVELS_CONTROL_LABEL_FR() {
		return this.WATER_LEVELS_CONTROL_LABEL_FR;
	}
	
	public String getMOD_J1_EF_LIT() {
		return this.MOD_J1_EF_LIT;
	}
	
	public String getWATER_CON_FACTOR() {
		return this.WATER_CON_FACTOR;
	}
	
	public String getANNUAL_WATER_CON_L() {
		return this.ANNUAL_WATER_CON_L;
	}
	
	public String getConsumption() {
		return this.MOD_J1_AEC;
	}
}