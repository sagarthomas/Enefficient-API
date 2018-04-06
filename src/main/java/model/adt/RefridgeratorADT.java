/**
 * This class defines the Refridgerator ADT which inherits from the ApplianceADT class.  It is used to store information about appliances from the refrigerators and wine chillers dataset
 * @author Matthew Dombrady 
 */

package model.adt;

public class RefridgeratorADT extends ApplianceADT {
	
	// These class variables contain every field from the appliances in the refrigerators and wine chillers dataset
	private String AEC, TYPE_LABEL_EN, TYPE_LABEL_FR, EG_WEB_DEFROST_LABEL_EN, EG_WEB_DEFROST_LABEL_FR, EG_WEB_FREEZER_LOC_LABEL_EN, EG_WEB_FREEZER_LOC_LABEL_FR, TOTAL_VOL_LIT, TOTAL_VOL_CUB, SIZE_CATEGORY, EG_WEB_TTD_ICE_LABEL_EN, EG_WEB_TTD_ICE_LABEL_FR, FRESH_VOL_LIT, FRESH_VOL_CUB, FREEZER_VOL_LIT, FREEZER_VOL_CUB;
	
	/**
	 * This constructor creates a RefridgeratorADT object
	 * @param BRAND_NAME The appliance's brand name
	 * @param MODEL_NUM_1 The appliance's model number
	 * @param REC_REF_KEY The appliances unique reference key
	 * @param AEC A number representing the refrigerator's annual energy consumption in gigajoules
	 * @param TYPE_LABEL_EN An unused field
	 * @param TYPE_LABEL_FR An unused field
	 * @param EG_WEB_DEFROST_LABEL_EN An unused field
	 * @param EG_WEB_DEFROST_LABEL_FR An unused field
	 * @param EG_WEB_FREEZER_LOC_LABEL_EN An unused field
	 * @param EG_WEB_FREEZER_LOC_LABEL_FR An unused field
	 * @param TOTAL_VOL_LIT An unused field
	 * @param TOTAL_VOL_CUB An unused field
	 * @param SIZE_CATEGORY An unused field
	 * @param EG_WEB_TTD_ICE_LABEL_EN An unused field
	 * @param EG_WEB_TTD_ICE_LABEL_FR An unused field
	 * @param FRESH_VOL_LIT An unused field
	 * @param FRESH_VOL_CUB An unused field
	 * @param FREEZER_VOL_LIT An unused field
	 * @param FREEZER_VOL_CUB An unused field
	 */
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
	
	// The below methods are getters for every class variable
	
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
