package ch06;

public class ReferenceParam {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("1. main() : x = " + d.x);
		
		change(d);
		System.out.println("2. After change(d)");
		System.out.println("3. main() : x = " + d.x);
	}
	
	static void change(Data d) { // 참조형 매개변수 
		d.x = 1000;
		System.out.println("4. change() : x " + d.x);
	}
}
