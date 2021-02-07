package ch08;

public class Exception1 {

	public static void main(String[] args) {
		try {
			try {} catch (Exception e) {}
		} catch (Exception e) {
//			try {} catch (Exception e) {}	// Error. variable e' has twice.
		} // try catch's End
	
		try {
		} catch(Exception e) {
			
		} // try-catch's End
	}	// main 
}
