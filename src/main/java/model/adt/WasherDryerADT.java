
package model.adt;
/**
 * This class defines the Washer-Dryer ADT which inherits from the ApplianceADT class.  It is used to store information about appliances from the washer-dryers dataset
 * @author Matthew Dombrady
 */
public class WasherDryerADT extends ApplianceADT {
	
	// These class variables contain every field from the appliances in the washer-dryers dataset
	private String AEC, MOD_J1_AEC, DRYER_AEC, PROD_DESC_LABEL_EN, PROD_DESC_LABEL_FR, WASHER_TYPE_LABEL_EN, WASHER_TYPE_LABEL_FR, AVG_L_PER_CYCLE, VOLTAGE_LABEL_EN, VOLTAGE_LABEL_FR, WASHER_CAPACITY, WATER_LEVELS_CONTROL_LABEL_EN, WATER_LEVELS_CONTROL_LABEL_FR, MOD_J1_EF_LIT, WATER_CON_FACTOR, ANNUAL_WATER_CON_L, DRYER_TYPE_LABEL_EN, DRYER_TYPE_LABEL_FR, DRYER_CAPACITY, DRYER_CONTROL_LABEL_FR;
	
	/**
	 * This constructor creates a WasherDryerADT object
	 * @param BRAND_NAME The appliance's brand namme
	 * @param MODEL_NUM_1 The appliance's model number
	 * @param REC_REF_KEY The appliance's unique reference key
	 * @param AEC A number representing the washer-dryer's annual energy consumption in gigajoules
	 * @param MOD_J1_AEC An unused field
	 * @param DRYER_AEC An unused field
	 * @param PROD_DESC_LABEL_EN An unused field
	 * @param PROD_DESC_LABEL_FR An unused field
	 * @param WASHER_TYPE_LABEL_EN An unused field
	 * @param WASHER_TYPE_LABEL_FR An unused field
	 * @param AVG_L_PER_CYCLE An unused field
	 * @param VOLTAGE_LABEL_EN An unused field
	 * @param VOLTAGE_LABEL_FR An unused field
	 * @param WASHER_CAPACITY An unused field
	 * @param WATER_LEVELS_CONTROL_LABEL_EN An unused field
	 * @param WATER_LEVELS_CONTROL_LABEL_FR An unused field
	 * @param MOD_J1_EF_LIT An unused field
	 * @param WATER_CON_FACTOR An unused field
	 * @param ANNUAL_WATER_CON_L An unused field
	 * @param DRYER_TYPE_LABEL_EN An unused field
	 * @param DRYER_TYPE_LABEL_FR An unused field
	 * @param DRYER_CAPACITY An unused field
	 * @param DRYER_CONTROL_LABEL_FR An unused field
	 */
	public WasherDryerADT(String BRAND_NAME, String MODEL_NUM_1, String REC_REF_KEY, String AEC, String MOD_J1_AEC, String DRYER_AEC, String PROD_DESC_LABEL_EN, String PROD_DESC_LABEL_FR, String WASHER_TYPE_LABEL_EN, String WASHER_TYPE_LABEL_FR, String AVG_L_PER_CYCLE, String VOLTAGE_LABEL_EN, String VOLTAGE_LABEL_FR, String WASHER_CAPACITY, String WATER_LEVELS_CONTROL_LABEL_EN, String WATER_LEVELS_CONTROL_LABEL_FR, String MOD_J1_EF_LIT, String WATER_CON_FACTOR, String ANNUAL_WATER_CON_L, String DRYER_TYPE_LABEL_EN, String DRYER_TYPE_LABEL_FR, String DRYER_CAPACITY, String DRYER_CONTROL_LABEL_FR) {
		super(BRAND_NAME, MODEL_NUM_1, REC_REF_KEY);
		
		this.AEC = AEC;
		this.MOD_J1_AEC = MOD_J1_AEC; 
		this.DRYER_AEC = DRYER_AEC; 
		this.PROD_DESC_LABEL_EN = PROD_DESC_LABEL_EN; 
		this.PROD_DESC_LABEL_FR = PROD_DESC_LABEL_FR; 
		this.WASHER_TYPE_LABEL_EN = WASHER_TYPE_LABEL_EN;
		this.WASHER_TYPE_LABEL_FR = WASHER_TYPE_LABEL_FR; 
		this.AVG_L_PER_CYCLE = AVG_L_PER_CYCLE;
		this.VOLTAGE_LABEL_EN = VOLTAGE_LABEL_EN;
		this.VOLTAGE_LABEL_FR = VOLTAGE_LABEL_FR;
		this.WASHER_CAPACITY = WASHER_CAPACITY;
		this.WATER_LEVELS_CONTROL_LABEL_EN = WATER_LEVELS_CONTROL_LABEL_EN;
		this.WATER_LEVELS_CONTROL_LABEL_FR = WATER_LEVELS_CONTROL_LABEL_FR;
		this.MOD_J1_EF_LIT = MOD_J1_EF_LIT;
		this.WATER_CON_FACTOR = WATER_CON_FACTOR;
		this.ANNUAL_WATER_CON_L = ANNUAL_WATER_CON_L;
		this.DRYER_TYPE_LABEL_EN = DRYER_TYPE_LABEL_EN;
		this.DRYER_TYPE_LABEL_FR = DRYER_TYPE_LABEL_FR;
		this.DRYER_CAPACITY = DRYER_CAPACITY;
		this.DRYER_CONTROL_LABEL_FR = DRYER_CONTROL_LABEL_FR;
	}
	
	// The below methods are getters for every class variables
	
	public String getAEC() {
		return this.AEC;
	}
	
	public String getMOD_J1_AEC() {
		return this.MOD_J1_AEC;
	}
	
	public String getDRYER_AEC() {
		return this.DRYER_AEC;
	}
	
	public String getPROD_DESC_LABEL_EN() {
		return this.PROD_DESC_LABEL_EN;
	}
	
	public String getPROD_DESC_LABEL_FR() {
		return this.PROD_DESC_LABEL_FR;
	}
	
	public String getWASHER_TYPE_LABEL_EN() {
		return this.WASHER_TYPE_LABEL_EN;
	}
	
	public String getWASHER_TYPE_LABEL_FR() {
		return this.WASHER_TYPE_LABEL_FR;
	}
	
	public String getAVG_L_PER_CYCLE() {
		return this.AVG_L_PER_CYCLE;
	}
	
	public String getVOLTAGE_LABEL_EN() {
		return this.VOLTAGE_LABEL_EN;
	}
	
	public String getVOLTAGE_LABEL_FR() {
		return this.VOLTAGE_LABEL_FR;
	}
	
	public String getWASHER_CAPACITY() {
		return this.WASHER_CAPACITY;
	}
	
	public String getWATER_LEVELS_CONTROL_LABEL_EN() {
		return this.WATER_LEVELS_CONTROL_LABEL_EN;
	}
	
	public String getWATER_LEVELS_CONTROL_LABEL_FR() {
		return this.WATER_LEVELS_CONTROL_LABEL_FR;
	}
	
	public String geMOD_J1_EF_LIT() {
		return this.MOD_J1_EF_LIT;
	}
	
	public String getWATER_CON_FACTOR() {
		return this.WATER_CON_FACTOR;
	}
	
	public String getANNUAL_WATER_CON_L() {
		return this.ANNUAL_WATER_CON_L;
	}
	
	public String getDRYER_TYPE_LABEL_EN() {
		return this.DRYER_TYPE_LABEL_EN;
	}
	
	public String getDRYER_TYPE_LABEL_FR() {
		return this.DRYER_TYPE_LABEL_FR;
	}
	
	public String getDRYER_CAPACITY() {
		return this.DRYER_CAPACITY;
	}
	
	public String getDRYER_CONTROL_LABEL_FR() {
		return this.DRYER_CONTROL_LABEL_FR;
	}
		
	public String getConsumption() {
		return this.AEC;
	}
}
