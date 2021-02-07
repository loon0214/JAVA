package ch09;

import java.util.Calendar;

public class CalendarEx2 {
	public static void mian(String[] args) {
		//요일은 1부터 시작하기 때문에, DAY_OF_WEEK[0]은 비어두었다.
		final String[] DAY_OF_WEEK = {"","sun","mon","tue","wed","thu","fri","sat"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		//month일 경우 0부터 시작하기 때문에 8월인 경우, 7로 지정해야한다.
		//date1.set(2015, Calendar.AUGUST, 15 와 같이 할 수도 있다.
		date1.set(2015, 7, 15); // set as 15 aug, 2015
		System.out.println("date1은 " 
		+ DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+ "요일이,");
	}

}
