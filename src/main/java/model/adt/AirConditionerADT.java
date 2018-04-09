

package model.adt;

/**
 * This class defines the Air Conditioner ADT which inherits from the ApplianceADT class.  It is used to store information about appliances from the air conditioner dataset
 * @author Matthew Dombrady
 */
public class AirConditionerADT extends ApplianceADT {
	
	// These class variables contain every field from appliances in the air conditioner dataset
	private String EE_RATIO, COOL_CAP_KW, COOL_CAP_BTU, PROD_CLASS_LABEL_EN, PROD_CLASS_LABEL_FR, HEAT_ELEMENT_LABEL_EN, HEAT_ELEMENT_LABEL_FR, VOLTAGE_LABEL_EN, VOLTAGE_LABEL_FR, ENERGUIDE_LABEL_EN, ENERGUIDE_LABEL_FR, REVERSE_CYCLES_LABEL_EN, REVERSE_CYCLES_LABEL_FR, AMPS;
	
	/**
	 * This constructor creates an AirConditionerADT object
	 * @param BRAND_NAME The appliance's brand name
	 * @param MODEL_NUM_1 The appliance's model number
	 * @param REC_REF_KEY The appliance's unique reference key
	 * @param EE_RATIO An unused field
	 * @param COOL_CAP_KW An unused field
	 * @param COOL_CAP_BTU A number representing the air conditioner's electricity usage.  This number will later be converted into gigajoules
	 * @param PROD_CLASS_LABEL_EN An unused field
	 * @param PROD_CLASS_LABEL_FR An unused field
	 * @param HEAT_ELEMENT_LABEL_EN An unused field
	 * @param HEAT_ELEMENT_LABEL_FR An unused field
	 * @param VOLTAGE_LABEL_EN An unused field
	 * @param VOLTAGE_LABEL_FR An unused field
	 * @param ENERGUIDE_LABEL_EN An unused field
	 * @param ENERGUIDE_LABEL_FR An unused field
	 * @param REVERSE_CYCLES_LABEL_EN An unused field
	 * @param REVERSE_CYCLES_LABEL_FR An unused field
	 * @param AMPS An unused field
	 */
	public AirConditionerADT(String BRAND_NAME, String MODEL_NUM_1, String REC_REF_KEY, String EE_RATIO, String COOL_CAP_KW, String COOL_CAP_BTU, String PROD_CLASS_LABEL_EN, String PROD_CLASS_LABEL_FR, String HEAT_ELEMENT_LABEL_EN, String HEAT_ELEMENT_LABEL_FR, String VOLTAGE_LABEL_EN, String VOLTAGE_LABEL_FR, String ENERGUIDE_LABEL_EN, String ENERGUIDE_LABEL_FR, String REVERSE_CYCLES_LABEL_EN, String REVERSE_CYCLES_LABEL_FR, String AMPS) {
		super(BRAND_NAME, MODEL_NUM_1, REC_REF_KEY);
		
		this.EE_RATIO = EE_RATIO; 
		this.COOL_CAP_KW =COOL_CAP_KW;
		this.COOL_CAP_BTU = COOL_CAP_BTU;
		this.PROD_CLASS_LABEL_EN = PROD_CLASS_LABEL_EN;
		this.PROD_CLASS_LABEL_FR = PROD_CLASS_LABEL_FR;
		this.HEAT_ELEMENT_LABEL_EN = HEAT_ELEMENT_LABEL_EN;
		this.HEAT_ELEMENT_LABEL_FR = HEAT_ELEMENT_LABEL_FR;
		this.VOLTAGE_LABEL_EN = VOLTAGE_LABEL_EN;
		this.VOLTAGE_LABEL_FR = VOLTAGE_LABEL_FR;
		this.ENERGUIDE_LABEL_EN = ENERGUIDE_LABEL_EN;
		this.ENERGUIDE_LABEL_FR = ENERGUIDE_LABEL_FR;
		this.REVERSE_CYCLES_LABEL_EN = REVERSE_CYCLES_LABEL_EN;
		this.REVERSE_CYCLES_LABEL_FR = REVERSE_CYCLES_LABEL_FR;
		this.AMPS = AMPS;
	}
	
	// The below methods are getters for every class variable
	
	public String getEE_RATIO() {
		return this.EE_RATIO;
	}
	
	public String getCOOL_CAP_KW() {
		return this.COOL_CAP_KW;
	}
	
	public String getCOOL_CAP_BTU() {
		return this.COOL_CAP_BTU;
	}
	
	public String getPROD_CLASS_LABEL_EN() {
		return this.PROD_CLASS_LABEL_EN;
	}
	
	public String getPROD_CLASS_LABEL_FR() {
		return this.PROD_CLASS_LABEL_FR;
	}
	
	public String getHEAT_ELEMENT_LABEL_EN() {
		return this.HEAT_ELEMENT_LABEL_EN;
	}
	
	public String getHEAT_ELEMENT_LABEL_FR() {
		return this.HEAT_ELEMENT_LABEL_FR;
	}
	
	public String getVOLTAGE_LABEL_EN() {
		return this.VOLTAGE_LABEL_EN;
	}
	
	public String getVOLTAGE_LABEL_FR() {
		return this.VOLTAGE_LABEL_FR;
	}
	
	public String getENERGUIDE_LABEL_EN() {
		return this.ENERGUIDE_LABEL_EN;
	}
	
	public String getENERGUIDE_LABEL_FR() {
		return this.ENERGUIDE_LABEL_FR;
	}
	
	public String getREVERSE_CYCLES_LABEL_EN() {
		return this.REVERSE_CYCLES_LABEL_EN;
	}
	
	public String getREVERSE_CYCLES_LABEL_FR() {
		return this.REVERSE_CYCLES_LABEL_FR;
	}
	
	public String getAMPS() {
		return this.AMPS;
	}
	
	public String getConsumption() {
		// Return value concverted into gigajoules
		return Double.toString(Double.parseDouble(this.COOL_CAP_BTU) * 1055.06);
	}
}