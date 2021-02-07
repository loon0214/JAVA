package ch04;

import java.util.Scanner;

public class Flow04 {
	public static void main(String args[]) {
		int score = 0;		//점수를 저장 
		char grade = ' ';	//학점을 저장. 공백으로 초기화. 
		
		System.out.print("type the score. >");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt(); // 화면을 통해 입력받은 숫자를 score에 저장.
		
		if		  (score >= 90) {
			grade ='A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade ='D';
		}
		System.out.println("your grade is +" + grade);
	}

}
