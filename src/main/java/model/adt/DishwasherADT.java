

package model.adt;
/**
 * This class defines the Dishwasher ADT which inherits from the ApplianceADT class.  It is used to store information about appliances from the dishwashers dataset
 * @author Matthew Dombrady
 */
public class DishwasherADT extends ApplianceADT {
	
	// These class variables contain every field from appliances in the dishwashers dataset
	private String TAEC_C373_04, MAX_H20_FACTOR_L_PER_CYCLE, MAX_H20_FACTOR_G_PER_CYCLE, DWSIZE_LABEL_EN, DWSIE_LABEL_FR, TYPE_LABEL_EN, TYPE_LABEL_FR, EF_C373_04, HW_CONSUMPT; 
	
	/**
	 * This constructor creates a DishwasherADT object
	 * @param BRAND_NAME The appliance's brand name
	 * @param MODEL_NUM_1 The appliance's model number
	 * @param REC_REF_KEY The appliance's unique reference key
	 * @param TAEC_C373_04 A number representing the dishwasher's annual energy consumption in gigajoules
	 * @param MAX_H20_FACTOR_L_PER_CYCLE An unused field
	 * @param MAX_H20_FACTOR_G_PER_CYCLE An unused field
	 * @param DWSIZE_LABEL_EN An unused field
	 * @param DWSIE_LABEL_FR An unused field
	 * @param TYPE_LABEL_EN An unused field
	 * @param TYPE_LABEL_FR An unused field
	 * @param EF_C373_04 An unused field
	 * @param HW_CONSUMPT An unused field
	 */
	public DishwasherADT(String BRAND_NAME, String MODEL_NUM_1, String REC_REF_KEY, String TAEC_C373_04, String MAX_H20_FACTOR_L_PER_CYCLE, String MAX_H20_FACTOR_G_PER_CYCLE, String DWSIZE_LABEL_EN, String DWSIE_LABEL_FR, String TYPE_LABEL_EN, String TYPE_LABEL_FR, String EF_C373_04, String HW_CONSUMPT) {
		super(BRAND_NAME, MODEL_NUM_1, REC_REF_KEY);
		
		this.TAEC_C373_04 = TAEC_C373_04;
		this.MAX_H20_FACTOR_L_PER_CYCLE = MAX_H20_FACTOR_L_PER_CYCLE;
		this.MAX_H20_FACTOR_G_PER_CYCLE = MAX_H20_FACTOR_G_PER_CYCLE; 
		this.DWSIZE_LABEL_EN = DWSIZE_LABEL_EN;
		this.DWSIE_LABEL_FR = DWSIE_LABEL_FR;
		this.TYPE_LABEL_EN = TYPE_LABEL_EN;
		this.TYPE_LABEL_FR = TYPE_LABEL_FR;
		this.EF_C373_04 = EF_C373_04;
		this.HW_CONSUMPT = HW_CONSUMPT;
	}
	
	// The below methods are getters for every class variable
	
	public String getTAEC_C373_04() {
		return this.TAEC_C373_04;
	}
	
	public String getMAX_H20_FACTOR_L_PER_CYCLE() {
		return this.MAX_H20_FACTOR_L_PER_CYCLE;
	}
	
	public String getMAX_H20_FACTOR_G_PER_CYCLE() {
		return this.MAX_H20_FACTOR_G_PER_CYCLE;
	}
	
	public String getDWSIZE_LABEL_EN() {
		return this.DWSIZE_LABEL_EN;
	}
	
	public String getDWSIE_LABEL_FR() {
		return this.DWSIE_LABEL_FR;
	}
	
	public String getTYPE_LABEL_EN() {
		return this.TYPE_LABEL_EN;
	}
	
	public String getTYPE_LABEL_FR() {
		return this.TYPE_LABEL_FR;
	}
	
	public String getEF_C373_04() {
		return this.EF_C373_04;
	}
	
	public String getHW_CONSUMPT() {
		return this.HW_CONSUMPT;
	}
	
	public String getConsumption() {
		return this.TAEC_C373_04;
	}
	
}
