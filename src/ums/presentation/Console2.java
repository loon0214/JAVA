package ums.presentation;

import java.util.Scanner;

public interface Console2 {
	Scanner sc = new Scanner(System.in);
	
	public static int inNum() {
		System.out.println("> ");
		boolean isRepeat = true;
		String str = "";
		int num = 0;
		
		while(isRepeat == true) {
			str = sc.nextLine();
			try {
				num = Integer.parseInt(str);
				isRepeat = false;
			}catch(Exception e) {
				System.out.println("type the number not String \n>" );
				}
			}
			return num;
		}
		public static int inNum2(String msg) {
			System.out.println(msg + "\n> ");
			boolean isRepeat = true;
			String str = "";
			int num = 0;
			
			while(isRepeat == true) {
				str = sc.nextLine();
				try {
					num = Integer.parseInt(str);
					isRepeat = false;
				}catch(Exception e) {
					System.out.println("type the number not Stirng \n> ");
				}
			}
			return num;
		}
		public static String inStr(String msg) {
			System.out.println(msg + "\n> ");
			String str = sc.nextLine().trim();
			return str;
		}
		public static void info(String msg) {
			System.out.println(msg);
		}
		public static void info(Object obj) {
			System.out.println(obj);
		}
	}

