package day4.tut;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeEx {

	public static void main(String[] args) {
		
		// Today date
		
		LocalDate myDate = LocalDate.now();
		
		System.out.println("Today date " + myDate);
		
		// some day
		
		LocalDate someday = LocalDate.of(2025, 05, 30);
		
		System.out.println("Some date :"+ someday);
		
		//previous month same day
		
		LocalDate previousmonthSameDay = myDate.minusMonths(1);
		
		System.out.println(previousmonthSameDay);
		
		//Non-  gregorian calendar
		
		JapaneseDate jmyDate = JapaneseDate.now();
		
		System.out.println(jmyDate);
		
		System.out.println(LocalDate.parse("2020-09-26").getDayOfWeek());
		
		System.out.println(myDate.format(DateTimeFormatter.ISO_DATE));
		
		System.out.println(myDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));

		LocalDateTime myDateTime = LocalDateTime.now();
		System.out.println(myDateTime);
		
	}

}
