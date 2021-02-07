package ch07;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time(8, 31 ,28);
		System.out.println(t);
//		t.hour = 13;
		t.setHour(t.getHour()+1); // current time + 1
		System.out.println(t);
	}
}
