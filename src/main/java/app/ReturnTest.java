package app;

/**
 * Simple test class for Spring MVC API returns
 * @author Sagar Thomas
 */
public class ReturnTest {
	
	private final String brand;
	
	/**
	 * Constructor
	 * @param brand of the appliance
	 */
	public ReturnTest(String brand) {
		this.brand = brand;
	}
	
	/**
	 * Gets the brand value
	 * @return
	 */
	public String getBrand() {
		return brand;
	}

}
