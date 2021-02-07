package ch04;

import java.util.Scanner;

public class Flow07 {
	public static void main(String args[]) {
		System.out.print("가위(1), 바위(2), 보(3) >");
		
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		int bot = (int)(Math.random()*3) +1;
		
		System.out.println("you are " + user);
		System.out.println("bot is  " + bot);
		
		switch(user-bot) {
		case 2: case -1:
			System.out.println("you lose"); break;
		case 1: case -2:
			System.out.println("you won"); break;
		case 0:
			System.out.println("draw");
		}
	}

}
