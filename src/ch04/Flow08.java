package ch04;

import java.util.Scanner;

public class Flow08 {
	public static void main(String args[]) {
		System.out.println("type the your Register number >");
		
		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();
		
		char gender = regNo.charAt(7); // 입력받은 번호의 8번째 문자를 gender에 저장.
		
		switch(gender) {
		case '1': case '3':
			System.out.println("Jestes mezyczyna"); break;
		case '2': case '4':
			System.out.println("Jestes Kobieta"); break;
		default:
			System.out.println("it's not valid number.");
		}
	}

}
