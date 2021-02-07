package ch02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("type the 2-digit integer");
		String input = sc.nextLine();
		int num =Integer.parseInt(input); // typed String -> number
		
		System.out.println("typed content: " + input);
		System.out.printf("num = %d%n", num);
	}
}