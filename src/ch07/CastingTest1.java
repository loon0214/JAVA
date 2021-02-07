package ch07;

public class CastingTest1 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // car = (car)fe;
//		car.water();  // Car type의 참조변수로는 water() 호출 불가.
		fe2 = (FireEngine)car; // 자손타입 <- 부모타입 
		fe2.water();
	}
}