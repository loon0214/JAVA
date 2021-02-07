package ch04;

public class Flow13 {
	public static void main(String args[]) {
		int sum = 0;
		
		for(int i=1; i <= 10; i++) {
			sum += i;
			System.out.printf("1~ %d's sum: %2d%n",i,sum);
		}
	}
}