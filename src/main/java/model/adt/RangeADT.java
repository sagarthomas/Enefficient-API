package model.adt;

public class RangeADT extends ApplianceADT {
	
	private String AEC_03, RANGE_TYPE_LABEL_EN, RANGE_TYPE_LABEL_FR, COOKTOP_TYPE_LABEL_EN, COOKTOP_TYPE_LABEL_FR, OVEN_EQUIP_TYPE_LABEL_EN, OVEN_EQUIP_TYPE_LABEL_FR, OVEN_TYPE_LABEL_EN, OVEN_TYPE_LABEL_FR, OVEN_COOK_METH_LABEL_EN, OVEN_COOK_METH_LABEL_FR, USE_OVEN_SPACE_LOWER, USE_OVEN_SPACE_UPPER, NOMINAL_WIDTH_LABEL_EN, NOMINAL_WIDTH_LABEL_FR;
		
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