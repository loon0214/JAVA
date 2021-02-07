package ch04;

import java.util.Scanner;

public class Flow11 {

	public static void main(String[] args) {
		System.out.print("type your register Number. > \n");
		
		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();
		char gender = regNo.charAt(7);
		
		switch(gender){
			case '1': case '3':
				switch(gender) {
				case '1':
					System.out.println("you are a boy who borned before 2000 year"); break;
				case '3':
					System.out.println("you are a boy who borned after  2000 year");
				}
				break;
			case '2': case '4':
				switch(gender) {
					case '2':
						System.out.println("you are a girl who borned before 2000 year"); break;
					case '4':
						System.out.println("you are a gril who borned after  2000 year"); break;
				}
				break;
			default:
				System.out.println("it's not valid number.");
		}
	}
}
