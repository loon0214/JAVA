package ch04;

import java.util.Scanner;

public class Flow03 {
	public static void main(String args[]) {
		System.out.println("prosze wpisac jeden numer. >");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input == 0) {
			System.out.println("typed number is 0");
		} else { // input != 0 
			System.out.println("typed number isn't zero");
		}
		
	}

}
