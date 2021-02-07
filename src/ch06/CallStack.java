package ch06;

public class CallStack {

	public static void main(String[] args) {
		firstMethod();	// static method는 객체 생성없이 호출가능.
	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("2nd Method");
	}
}
