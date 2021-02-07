package ch04;

import java.util.Scanner;

public class Flow32 {

	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("select the menu(1~3).(0.EXIT) >\n");
			
			String tmp = sc.nextLine(); //화면에서 입력받은 내용을 tmp에 저장.
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("Exit the program");
				break;
			}else if(!(1 <= menu && menu <=3)) {
				System.out.println("you chosen wrong menu.(0.EXIT)");
				continue;
			}
			System.out.println("you chosen menu is "+menu);
		}
	}
}
