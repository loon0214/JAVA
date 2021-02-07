package ch04;

import java.util.Scanner;

public class Flow06 {

	public static void main(String[] args) {
		System.out.println("type the current months.>");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("current season is spring"); break;
			case 6: case 7: case 8:
				System.out.println("current season isn't spring"); break;
 
			case 9: case 10: case 11:
				System.out.println("current season is auctumn"); break;
			default:
			case 12: case 1: case 2:
				System.out.println("current season is winter"); break;
				
		}
	}
}

