package ch04;

import java.util.Scanner;

public class Flow02 {
	public static void main(String args[]) {
		
		System.out.println("prosze zapisac jeden numer. > ");
		Scanner sc  = new Scanner(System.in);
		String tmp = sc.nextLine();		// 화면을 통해 입력받은 내용을 tmp에 저장.
		int input = Integer.parseInt(tmp); 	// 입력받은 문자열 (tmp)을 숫자로 변환.
		
		if(input == 0)
			System.out.println("type the number is 0.");
		
		if(input != 0)
			System.out.println("type the number isn't zero");
			System.out.printf("type the number is %d.", input);
	}
}
