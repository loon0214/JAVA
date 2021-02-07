package ch09;

import java.util.*;

public class CalendarEx1 {
	public static void mian(String[] args) {
		//기본적으로 현재 날짜와 시간으로 설정된다.
		Calendar today = Calendar.getInstance();
		System.out.println("this year: " + today.get(Calendar.YEAR));
		System.out.println("Hello, World!!");
		System.out.println("month(0~11. 0:1 month): " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("this year's which week?: " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("this month's which week?: " + today.get(Calendar.WEEK_OF_MONTH));
		
		//DATE and DAY_OF_MONT is same.
	}
}
