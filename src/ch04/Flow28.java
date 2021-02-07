package ch04;

import java.util.Scanner;

public class Flow28 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1; // save 1 ~ 100
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("type the number (1 ~ 100) >\n");
			input = sc.nextInt();
			
			if(input > answer) {
				System.out.println(" try smaller number");
			}else if(input < answer) {
				System.out.println("try bigger number");
			}
		}while(input != answer);
		System.out.println("correct!!");
	}

}
