

package model.adt;
/**
 * This class defines the Oven ADT which inherits from the ApplianceADT class.  It is used to store information about appliances from the ovens dataset
 * @author Matthew Dombrady
 */
public class OvenADT extends ApplianceADT {
	
	// These class variables contain every field from the appliances in the ovens database
	private String AEC_03, TYPE_LABEL_EN, TYPE_LABEL_FR, EQUIP_TYPE_LABEL_EN, EQUIP_TYPE_LABEL_FR, U_TYPE_LABEL_EN, U_TYPE_LABEL_FR, L_TYPE_LABEL_EN, L_TYPE_LABEL_FR, U_COOK_METH_LABEL_EN, U_COOK_METH_LABEL_FR, L_COOK_METH_LABEL_EN, L_COOK_METH_LABEL_FR, U_USABLE_SPACE, L_USABLE_SPACE, NOMINAL_WIDTH_LABEL_EN, NOMINAL_WIDTH_LABEL_FR; 
	
	/**
	 * This constructor creates an OvenADT object
	 * @param BRAND_NAME The appliance's brand name
	 * @param MODEL_NUM_1 The appliance's model number
	 * @param REC_REF_KEY The appliance's unique reference key
	 * @param AEC_03 A number representing the oven's annual energy consumption in gigajoules
	 * @param TYPE_LABEL_EN An unused field
	 * @param TYPE_LABEL_FR An unused field
	 * @param EQUIP_TYPE_LABEL_EN An unused field
	 * @param EQUIP_TYPE_LABEL_FR An unused field
	 * @param U_TYPE_LABEL_EN An unused field
	 * @param U_TYPE_LABEL_FR An unused field
	 * @param L_TYPE_LABEL_EN An unused field
	 * @param L_TYPE_LABEL_FR An unused field
	 * @param U_COOK_METH_LABEL_EN An unused field
	 * @param U_COOK_METH_LABEL_FR An unused field
	 * @param L_COOK_METH_LABEL_EN An unused field
	 * @param L_COOK_METH_LABEL_FR An unused field
	 * @param U_USABLE_SPACE An unused field
	 * @param L_USABLE_SPACE An unused field
	 * @param NOMINAL_WIDTH_LABEL_EN An unused field
	 * @param NOMINAL_WIDTH_LABEL_FR An unused field
	 */
	public OvenADT(String BRAND_NAME, String MODEL_NUM_1, String REC_REF_KEY, String AEC_03, String TYPE_LABEL_EN, String TYPE_LABEL_FR, String EQUIP_TYPE_LABEL_EN, String EQUIP_TYPE_LABEL_FR, String U_TYPE_LABEL_EN, String U_TYPE_LABEL_FR, String L_TYPE_LABEL_EN, String L_TYPE_LABEL_FR, String U_COOK_METH_LABEL_EN, String U_COOK_METH_LABEL_FR, String L_COOK_METH_LABEL_EN, String L_COOK_METH_LABEL_FR, String U_USABLE_SPACE, String L_USABLE_SPACE, String NOMINAL_WIDTH_LABEL_EN, String NOMINAL_WIDTH_LABEL_FR) {
		super(BRAND_NAME, MODEL_NUM_1, REC_REF_KEY);
		
		this.AEC_03 = AEC_03; 
		this.TYPE_LABEL_EN = TYPE_LABEL_EN;
		this.TYPE_LABEL_FR = TYPE_LABEL_FR; 
		this.EQUIP_TYPE_LABEL_EN = EQUIP_TYPE_LABEL_EN;
		this.EQUIP_TYPE_LABEL_FR = EQUIP_TYPE_LABEL_FR;
		this.U_TYPE_LABEL_EN = U_TYPE_LABEL_EN;
		this.U_TYPE_LABEL_FR = U_TYPE_LABEL_FR;
		this.L_TYPE_LABEL_EN = L_TYPE_LABEL_EN;
		this.L_TYPE_LABEL_FR = L_TYPE_LABEL_FR;
		this.U_COOK_METH_LABEL_EN = U_COOK_METH_LABEL_EN;
		this.U_COOK_METH_LABEL_FR = U_COOK_METH_LABEL_FR;
		this.L_COOK_METH_LABEL_EN = L_COOK_METH_LABEL_EN;
		this.L_COOK_METH_LABEL_FR = L_COOK_METH_LABEL_FR;
		this.U_USABLE_SPACE = U_USABLE_SPACE;
		this.L_USABLE_SPACE = L_USABLE_SPACE;
		this.NOMINAL_WIDTH_LABEL_EN = NOMINAL_WIDTH_LABEL_EN;
		this.NOMINAL_WIDTH_LABEL_FR = NOMINAL_WIDTH_LABEL_FR;
	}
	
	// The below methods are getters for every class variable
	
	public String getAEC_03() {
		return this.AEC_03;
	}
	
	public String getTYPE_LABEL_EN() {
		return this.TYPE_LABEL_EN;
	}
	
	public String getTYPE_LABEL_FR() {
		return this.TYPE_LABEL_FR;
	}
	
	public String getEQUIP_TYPE_LABEL_EN() {
		return this.EQUIP_TYPE_LABEL_EN;
	}
	
	public String getEQUIP_TYPE_LABEL_FR() {
		return this.EQUIP_TYPE_LABEL_FR;
	}
	
	public String getU_TYPE_LABEL_EN() {
		return this.U_TYPE_LABEL_EN;
	}
	
	public String getU_TYPE_LABEL_FR() {
		return this.U_TYPE_LABEL_FR;
	}
	
	public String getL_TYPE_LABEL_EN() {
		return this.L_TYPE_LABEL_EN;
	}
	
	public String getL_TYPE_LABEL_FR() {
		return this.L_TYPE_LABEL_FR;
	}
	
	public String getU_COOK_METH_LABEL_EN() {
		return this.U_COOK_METH_LABEL_EN;
	}
	
	public String getU_COOK_METH_LABEL_FR() {
		return this.U_COOK_METH_LABEL_FR;
	}
	
	public String getL_COOK_METH_LABEL_EN() {
		return this.L_COOK_METH_LABEL_EN;
	}
	
	public String getL_COOK_METH_LABEL_FR() {
		return this.L_COOK_METH_LABEL_FR;
	}
	
	public String getU_USABLE_SPACE() {
		return this.U_USABLE_SPACE;
	}
	
	public String getL_USABLE_SPACE() {
		return this.L_USABLE_SPACE;
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
