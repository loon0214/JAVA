package ch04;

import java.util.Scanner;

public class Flow10 {

	public static void main(String[] args) {
		int score = 0;
		String grade = "";
		
		System.out.println("type your score. (1~100).<\n");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		score = Integer.parseInt(tmp); //입력받은 문자열 (tmp)를 숫자로 변환 
		
		switch(score/10) {
		case 10: case 9:	grade = "+A"; break;
		case 8:				grade = "+B"; break;
		case 7:				grade = "+C"; break;
		default:			grade = "FF";
		}
		System.out.println("your grade is " + grade);
	}

}
