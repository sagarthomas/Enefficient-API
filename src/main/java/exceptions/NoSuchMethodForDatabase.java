package exceptions;

/**
 * Exception that is thrown when MongoAdapter attempts to call a method that the database does not use
 * @author Sagar Thomas
 *
 */
public class NoSuchMethodForDatabase extends Exception {
	
	public NoSuchMethodForDatabase() {}
	
	public NoSuchMethodForDatabase(String message) {
		super(message);
	}

}
