package ch06;

public class Factorial1 {

		static int factorial(int n) {
			if(n == 1)return 1;
			return n * factorial(n-1);
		}
	}
