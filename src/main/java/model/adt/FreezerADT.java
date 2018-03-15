package model.adt;

public class FreezerADT extends ApplianceADT {
	
	private String AEC, EG_WEB_SHAPE_LABEL_EN, EG_WEB_SHAPE_LABEL_FR, VOL_LIT, VOL_CUB, TYPE_LABEL_EN, TYPE_LABEL_FR, SIZE_CATEGORY, EG_WEB_DEFROST_LABEL_EN, EG_WEB_DEFROST_LABEL_FR, HR24_FREEZE_KG;
	
	public FreezerADT(String BRAND_NAME, String MODEL_NUM_1, String REC_REF_KEY, String AEC, String EG_WEB_SHAPE_LABEL_EN, String EG_WEB_SHAPE_LABEL_FR, String VOL_LIT, String VOL_CUB, String TYPE_LABEL_EN, String TYPE_LABEL_FR, String SIZE_CATEGORY, String EG_WEB_DEFROST_LABEL_EN, String EG_WEB_DEFROST_LABEL_FR, String HR24_FREEZE_KG) {
		super(BRAND_NAME, MODEL_NUM_1, REC_REF_KEY);
		
		this.AEC = AEC;
		this.EG_WEB_SHAPE_LABEL_EN = EG_WEB_SHAPE_LABEL_EN; 
		this.EG_WEB_SHAPE_LABEL_FR = EG_WEB_SHAPE_LABEL_FR;
		this.VOL_LIT = VOL_LIT;
		this.VOL_CUB = VOL_CUB;
		this.TYPE_LABEL_EN = TYPE_LABEL_EN;
		this.TYPE_LABEL_FR = TYPE_LABEL_FR;
		this.SIZE_CATEGORY = SIZE_CATEGORY;
		this.EG_WEB_DEFROST_LABEL_EN = EG_WEB_DEFROST_LABEL_EN;
		this.EG_WEB_DEFROST_LABEL_FR = EG_WEB_DEFROST_LABEL_FR;
		this.HR24_FREEZE_KG = HR24_FREEZE_KG;
	}
	
	public String getAEC() {
		return this.AEC;
	}
	
	public String getEG_WEB_SHAPE_LABEL_EN() {
		return this.EG_WEB_SHAPE_LABEL_EN;
	}
	
	public String getEG_WEB_SHAPE_LABEL_FR() {
		return this.EG_WEB_SHAPE_LABEL_FR;
	}
	
	public String getVOL_LIT() {
		return this.VOL_LIT;
	}
	
	public String getVOL_CUB() {
		return this.VOL_CUB;
	}
	
	public String getTYPE_LABEL_EN() {
		return this.TYPE_LABEL_EN;
	}
	
	public String getTYPE_LABEL_FR() {
		return this.TYPE_LABEL_FR;
	}
	
	public String getSIZE_CATEGORY() {
		return this.SIZE_CATEGORY;
	}
	
	public String getEG_WEB_DEFROST_LABEL_EN() {
		return this.EG_WEB_DEFROST_LABEL_EN;
	}
	
	public String getEG_WEB_DEFROST_LABEL_FR() {
		return this.EG_WEB_DEFROST_LABEL_FR;
	}
	
	public String getHR24_FREEZE_KG() {
		return this.HR24_FREEZE_KG;
	}
	
}