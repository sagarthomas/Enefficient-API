package app;

// This is the object which will be returned to the controller as a result
public class ApplianceReturn {
	
	private static String brand, model, type, consumption;
	
	public ApplianceReturn(String brand, String model, String type, String consumption) {
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.consumption = consumption;
	}
	
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

}
