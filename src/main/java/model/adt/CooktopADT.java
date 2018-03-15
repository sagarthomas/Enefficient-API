package model.adt;

public class CooktopADT extends ApplianceADT {
	
	private String AEC_03, COOK_TOP_TYPE_LABEL_EN, COOK_TOP_TYPE_LABEL_FR, NOMINAL_WIDTH_LABEL_EN, NOMINAL_WIDTH_LABEL_FR;
	
	public CooktopADT(String BRAND_NAME, String MODEL_NUM_1, String REC_REF_KEY, String AEC_03, String COOK_TOP_TYPE_LABEL_EN, String COOK_TOP_TYPE_LABEL_FR, String NOMINAL_WIDTH_LABEL_EN, String NOMINAL_WIDTH_LABEL_FR) {
		super(BRAND_NAME, MODEL_NUM_1, REC_REF_KEY);
		
		this.AEC_03 = AEC_03; 
		this.COOK_TOP_TYPE_LABEL_EN = COOK_TOP_TYPE_LABEL_EN; 
		this.COOK_TOP_TYPE_LABEL_FR = COOK_TOP_TYPE_LABEL_FR;
		this.NOMINAL_WIDTH_LABEL_EN = NOMINAL_WIDTH_LABEL_EN;
		this.NOMINAL_WIDTH_LABEL_FR = NOMINAL_WIDTH_LABEL_FR;
		
	}
	
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
}
