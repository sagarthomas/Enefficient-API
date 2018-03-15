package model.adt;

public class ApplianceADT {
	
	private String BRAND_NAME, MODEL_NUM_1, REC_REF_KEY;
	
	public ApplianceADT(String BRAND_NAME, String MODEL_NUM_1, String REC_REF_KEY) {
		this.BRAND_NAME = BRAND_NAME;
		this.MODEL_NUM_1 = MODEL_NUM_1;
		this.REC_REF_KEY = REC_REF_KEY;
	}
	
	public String getBRAND_NAME() {
		return this.BRAND_NAME;
	}
	
	public String getMMODEL_NUM_1() {
		return this.MODEL_NUM_1;
	}
	
	
	public String getREC_REF_KEY() {
		return this.REC_REF_KEY;
	}
	
}
