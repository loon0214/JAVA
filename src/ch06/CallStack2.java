package ch06;

public class CallStack2 {

	public static void main(String[] args) {
		System.out.println("1.main(String[] args)has been started.");
		firstMethod();
		System.out.println("2.main(String[] args) has been finished.");
	}
	
	static void firstMethod() {
		System.out.println("3.firstMethod() has been started.\n");
		secondMethod();
		System.out.println("4.firstMethod() has been finished.");
	}
	
	static void secondMethod() {
		System.out.println("5.2nd method has been started.");
		System.out.println("6.2nd method has been finished.\n");
	}
}
