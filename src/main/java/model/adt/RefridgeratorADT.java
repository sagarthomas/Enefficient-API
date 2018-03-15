package model.adt;

public class RefridgeratorADT extends ApplianceADT {
	
	private String AEC, TYPE_LABEL_EN, TYPE_LABEL_FR, EG_WEB_DEFROST_LABEL_EN, EG_WEB_DEFROST_LABEL_FR, EG_WEB_FREEZER_LOC_LABEL_EN, EG_WEB_FREEZER_LOC_LABEL_FR, TOTAL_VOL_LIT, TOTAL_VOL_CUB, SIZE_CATEGORY, EG_WEB_TTD_ICE_LABEL_EN, EG_WEB_TTD_ICE_LABEL_FR, FRESH_VOL_LIT, FRESH_VOL_CUB, FREEZER_VOL_LIT, FREEZER_VOL_CUB;
	
	public RefridgeratorADT(String BRAND_NAME, String MODEL_NUM_1, String REC_REF_KEY, String AEC, String TYPE_LABEL_EN, String TYPE_LABEL_FR, String EG_WEB_DEFROST_LABEL_EN, String EG_WEB_DEFROST_LABEL_FR, String EG_WEB_FREEZER_LOC_LABEL_EN, String EG_WEB_FREEZER_LOC_LABEL_FR, String TOTAL_VOL_LIT, String TOTAL_VOL_CUB, String SIZE_CATEGORY, String EG_WEB_TTD_ICE_LABEL_EN, String EG_WEB_TTD_ICE_LABEL_FR, String FRESH_VOL_LIT, String FRESH_VOL_CUB, String FREEZER_VOL_LIT, String FREEZER_VOL_CUB) {
		super(BRAND_NAME, MODEL_NUM_1, REC_REF_KEY);
		
		this.AEC = AEC; 
		this.TYPE_LABEL_EN = TYPE_LABEL_EN; 
		this.TYPE_LABEL_FR = TYPE_LABEL_FR;
		this.EG_WEB_DEFROST_LABEL_EN = EG_WEB_DEFROST_LABEL_EN;
		this.EG_WEB_DEFROST_LABEL_FR = EG_WEB_DEFROST_LABEL_FR;
		this.EG_WEB_FREEZER_LOC_LABEL_EN = EG_WEB_FREEZER_LOC_LABEL_EN;
		this.EG_WEB_FREEZER_LOC_LABEL_FR = EG_WEB_FREEZER_LOC_LABEL_FR;
		this.TOTAL_VOL_LIT = TOTAL_VOL_LIT;
		this.TOTAL_VOL_CUB = TOTAL_VOL_CUB;
		this.SIZE_CATEGORY = SIZE_CATEGORY;
		this.EG_WEB_TTD_ICE_LABEL_EN = EG_WEB_TTD_ICE_LABEL_EN;
		this.EG_WEB_TTD_ICE_LABEL_FR = EG_WEB_TTD_ICE_LABEL_FR;
		this.FRESH_VOL_LIT = FRESH_VOL_LIT;
		this.FRESH_VOL_CUB = FRESH_VOL_CUB;
		this.FREEZER_VOL_LIT = FREEZER_VOL_LIT;
		this.FREEZER_VOL_CUB = FREEZER_VOL_CUB;
	}
	
	public String getAEC() {
		return this.AEC;
	}
	
	public String getTYPE_LABEL_EN() {
		return this.TYPE_LABEL_EN;
	}
	
	public String getTYPE_LABEL_FR() {
		return this.TYPE_LABEL_FR;
	}
	
	public String getEG_WEB_DEFROST_LABEL_EN() {
		return this.EG_WEB_DEFROST_LABEL_EN;
	}
	
	public String getEG_WEB_DEFROST_LABEL_FR() {
		return this.EG_WEB_DEFROST_LABEL_FR;
	}
	
	public String getEG_WEB_FREEZER_LOC_LABEL_EN() {
		return this.EG_WEB_FREEZER_LOC_LABEL_EN;
	}
	
	public String getEG_WEB_FREEZER_LOC_LABEL_FR() {
		return this.EG_WEB_FREEZER_LOC_LABEL_FR;
	}
	
	public String getTOTAL_VOL_LIT() {
		return this.TOTAL_VOL_LIT;
	}
	
	public String getTOTAL_VOL_CUB() {
		return this.TOTAL_VOL_CUB;
	}
	
	public String getSIZE_CATEGORY() {
		return this.SIZE_CATEGORY;
	}
	
	public String getEG_WEB_TTD_ICE_LABEL_EN() {
		return this.EG_WEB_TTD_ICE_LABEL_EN;
	}
	
	public String getEG_WEB_TTD_ICE_LABEL_FR() {
		return this.EG_WEB_TTD_ICE_LABEL_FR;
	}
	
	public String getFRESH_VOL_LIT() {
		return this.FRESH_VOL_LIT;
	}
	
	public String getFRESH_VOL_CUB() {
		return this.FRESH_VOL_CUB;
	}
	
	public String getFREEZER_VOL_LIT() {
		return this.FREEZER_VOL_LIT;
	}
	
	public String getFREEZER_VOL_CUB() {
		return this.FREEZER_VOL_CUB;
	}
	
	public String getConsumption() {
		return this.AEC;
	}
}
