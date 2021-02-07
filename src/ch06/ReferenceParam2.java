package ch06;

public class ReferenceParam2 {

	public static void main(String[] args) {
		int[] x = {10}; // 크기가 1인 배열. x[0] = 10;
		System.out.println("1. main() : x " + x[0]);
		
		change(x);
		System.out.println("2. After change(x)");
		System.out.println("3. main() : x = " + x[0]);
	}
	
	static void change(int[] x) { // 참조형 매개변수 
		x[0] = 1000;
		System.out.println("4. change() : x " + x[0]);
	}
}