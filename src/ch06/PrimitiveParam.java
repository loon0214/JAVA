package ch06;

public class PrimitiveParam {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("1.main() : x = " + d.x);
		
		change(d.x);
		System.out.println("2.After change(d.x) ");
		System.out.println("3.main() : x = " + d.x);
	}
	
	static void change(int x) {	// 기본형 매개변수
		x = 1000;
		System.out.println("4.change() : x = " + x);
	}
}