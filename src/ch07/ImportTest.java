package ch07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {

	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("dd MMM, yyyy");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("today's Date is " +date.format(today));
		System.out.println("Current Time is " +time.format(today));
		
	}

}
