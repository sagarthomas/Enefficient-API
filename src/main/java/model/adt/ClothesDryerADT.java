/**
 * This class defines the Dryer ADT which inherits from the ApplianceADT class.  It is used to store information about appliances from the dryers dataset
 * @author Matthew Dombrady
 */

package model.adt;

public class ClothesDryerADT extends ApplianceADT {
	
	// These class variables contain every field from the dryers dataset
	private String AEC, EF, TYPE_LABEL_EN, TYPE_LABEL_FR, VOLTAGE_LABEL_EN, VOLTAGE_LABEL_FR, CAPACITY, DRY_CONTROL_LABEL_EN, DRY_CONTROL_LABEL_FR;
	
	/**
	 * This constructor creates a ClothesDryerADT object
	 * @param BRAND_NAME The appliance's brand name
	 * @param MODEL_NUM_1 The appliances's model number
	 * @param REC_REF_KEY The appliance's unique reference key
	 * @param AEC A number representing the dryer's annual energy consumption in gigajoules
	 * @param EF An unused field
	 * @param TYPE_LABEL_EN An unused field
	 * @param TYPE_LABEL_FR An unused field
	 * @param VOLTAGE_LABEL_EN An unused field
	 * @param VOLTAGE_LABEL_FR An unused field
	 * @param CAPACITY An unused field
	 * @param DRY_CONTROL_LABEL_EN An unused field
	 * @param DRY_CONTROL_LABEL_FR An unused field
	 */
	public ClothesDryerADT(String BRAND_NAME, String MODEL_NUM_1, String REC_REF_KEY, String AEC, String EF, String TYPE_LABEL_EN, String TYPE_LABEL_FR, String VOLTAGE_LABEL_EN, String VOLTAGE_LABEL_FR, String CAPACITY, String DRY_CONTROL_LABEL_EN, String DRY_CONTROL_LABEL_FR) {
		super(BRAND_NAME, MODEL_NUM_1, REC_REF_KEY);
		
		this.AEC = AEC;
		this.EF = EF;
		this.TYPE_LABEL_EN = TYPE_LABEL_EN; 
		this.TYPE_LABEL_FR = TYPE_LABEL_FR; 
		this.VOLTAGE_LABEL_EN = VOLTAGE_LABEL_EN;
		this.VOLTAGE_LABEL_FR = VOLTAGE_LABEL_FR;
		this.CAPACITY = CAPACITY;
		this.DRY_CONTROL_LABEL_EN = DRY_CONTROL_LABEL_EN; 
		this.DRY_CONTROL_LABEL_FR = DRY_CONTROL_LABEL_FR;
	}
	
	// The below methods are getters for every class variable
	
	public String getAEC() {
		return this.AEC;
	}
	
	public String getEF() {
		return this.EF;
	}
	
	public String getTYPE_LABEL_EN() {
		return this.TYPE_LABEL_EN;
	}
	
	public String getTYPE_LABEL_FR() {
		return this.TYPE_LABEL_FR;
	}
	
	public String getVOLTAGE_LABEL_EN() {
		return this.VOLTAGE_LABEL_EN;
	}
	
	public String getVOLTAGE_LABEL_FR() {
		return this.VOLTAGE_LABEL_FR;
	}
	
	public String getCAPACITY() {
		return this.CAPACITY;
	}
	
	public String DRY_CONTROL_LABEL_EN() {
		return this.DRY_CONTROL_LABEL_EN;
	}
	
	public String getDRY_CONTROL_LABEL_FR() {
		return this.DRY_CONTROL_LABEL_FR;
	}
	
	public String getConsumption() {
		return this.AEC;
	}
	
		
}
