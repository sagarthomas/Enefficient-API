package app;

import data.ApplicationDetails;
/**
 * Contains all the details of the application
 * @author Sagar Thomas
 */
public class AppDetails {
	
	private String name, version, details, authors, course;
	
	/**
	 * Simple Constructor
	 */
	public AppDetails() {
		// TODO Auto-generated constructor stub
		name = ApplicationDetails.APP_NAME;
		version = ApplicationDetails.VERSION;
		details = ApplicationDetails.DESCRIPTION;
		authors = ApplicationDetails.AUTHORS;
		course = ApplicationDetails.COURSE;
	}

	/**
	 * Gets the name of the application
	 * @return name 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the version of the application
	 * @return version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Gets a brief description of the application
	 * @return details
	 */
	public String getDetails() {
		return details;
	}
	
	/**
	 * Gets the authors
	 * @return authors
	 */
	public String getAuthors() {
		return authors;
	}
	
	/**
	 * Gets the course 
	 * @return course
	 */ 
	public String getCourse() {
		return course;
	}
	
	
}
