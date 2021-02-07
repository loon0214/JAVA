package ch04;

import java.util.Scanner;

public class Flow34 {

	public static void main(String[] args) {
		int menu = 0, num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		outer:
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
				for(;;) {
				System.out.println("type the the number for calculate. (0.EXIT, Entire Exit:99) >\n");
				tmp = sc.nextLine();
				num = Integer.parseInt(tmp);
				
				if(num==0) break; 			// Exit calculate. Exit for
				if(num==99) break outer;	// Exit Entire. Exit for and while.
				switch(menu) {
				case 1: System.out.println("result= " +num*num); break;
				case 2: System.out.println("result= " + Math.sqrt(num)); break;
				case 3: System.out.println("result= " + Math.log(num)); break;
				}
			} // for(;;)
		} // while
	} // main
}