package exceptions;

public class NoSuchMethodForDatabase extends Exception {
	
	public NoSuchMethodForDatabase() {}
	
	public NoSuchMethodForDatabase(String message) {
		super(message);
	}

}
