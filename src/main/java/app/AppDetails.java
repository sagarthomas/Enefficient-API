package app;

import data.ApplicationDetails;

public class AppDetails {
	
	private String name, version, details, authors, course;
	
	public AppDetails() {
		// TODO Auto-generated constructor stub
		name = ApplicationDetails.APP_NAME;
		version = ApplicationDetails.VERSION;
		details = ApplicationDetails.DESCRIPTION;
		authors = ApplicationDetails.AUTHORS;
		course = ApplicationDetails.COURSE;
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
	
	public String getAuthors() {
		return authors;
	}
	
	public String getCourse() {
		return course;
	}
	
	
}
