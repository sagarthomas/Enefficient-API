package app;

import data.ApplicationDetails;

public class AppDetails {
	
	private String name, version, details;
	
	public AppDetails() {
		// TODO Auto-generated constructor stub
		name = ApplicationDetails.APP_NAME;
		version = ApplicationDetails.VERSION;
		details = ApplicationDetails.DESCRIPTION;
	}

	public String getName() {
		return name;
	}

	public String getVersion() {
		return version;
	}

	public String getDetails() {
		return details;
	}
	
	
}
