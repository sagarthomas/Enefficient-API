package exceptions;

/**
 * Exception that is thrown if a MongoDB database could not be found
 * @author Sagar Thomas 
 */
public class NoSuchDatabaseFound  extends Exception {
	
	public NoSuchDatabaseFound() {}
	
	public NoSuchDatabaseFound(String message) {
		super(message);
	}

}
