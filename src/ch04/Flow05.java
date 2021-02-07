package ch04;

import java.util.Scanner;

public class Flow05 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.println("type the score.>");
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		System.out.printf("your score is %d.%n", score);
		
		if(score >= 90) { 
			grade ='A';
			if(score >= 98) {
				opt = '+';
			} else if (score <94) {
				opt = '-';
			}
	} else if(score >= 80) {
		grade = 'B';
		if(score >= 88) {
			opt = '+';
		} else if(score < 84) {
			opt = '-';
		}
	}else {
		grade = 'C';
	}
	System.out.printf("your score is %c%c ", grade, opt);				
	}
}
