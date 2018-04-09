package exceptions;

public class NoSuchDatabaseFound  extends Exception {
	
	public NoSuchDatabaseFound() {}
	
	public NoSuchDatabaseFound(String message) {
		super(message);
	}

}
