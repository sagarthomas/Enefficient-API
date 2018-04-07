/**
 * This class creates a simple object containing only the important information of an appliance.  This is so a minimally complex JSON can be passed to the front-end.
 * @author Matthew Dombrady
 */

package app;

// This is the object which will be returned to the controller as a result
public class ApplianceReturn {
	
	// These class variables define the important information of an appliance to be passed to the front-end
	private String brand, model, type, consumption;
	
	/**
	 * This constructor creates an ApplianceReturn object
	 * @param brand The appliance's brand name
	 * @param model The appliance's model number
	 * @param type The type of the appliance
	 * @param consumption The annual energy consumption of the appliance in gigajoules
	 */
	public ApplianceReturn(String brand, String model, String type, String consumption) {
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.consumption = consumption;
	}
	
	// The below methods are getters for every class variable
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getConsumption() {
		return this.consumption;
	}
	
	public String toString() {
		return this.brand + ", " + this.model + ", " + this.type + ", " + this.consumption;
	}

}
