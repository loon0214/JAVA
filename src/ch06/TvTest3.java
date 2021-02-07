package ch06;

public class TvTest3 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1's channel is " + t1.channel);
		System.out.println("t2's channel is " + t2.channel);
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t1's channel has changed as 7");
		
		System.out.println("t1's channel is " + t1.channel);
		System.out.println("t2's channel is " + t2.channel);		
	}
}
