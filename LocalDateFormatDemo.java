
//Create a method to accept date and print the duration in days,months and years with 
//regards to current system date.

package Assignments;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateFormatDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();

		  System.out.println(date);

		  long yearsBetween = ChronoUnit.YEARS.between(LocalDate.parse("1990-01-01")
				  ,LocalDate.parse("2022-11-14"));
		  System.out.println("Years : "+yearsBetween);
		  
		  long monthsBetween = ChronoUnit.MONTHS.between(LocalDate.parse("1990-01-01")
				  ,LocalDate.parse("2022-11-14"));
		  System.out.println("Months : "+monthsBetween);
		  
		  long daysBetween = ChronoUnit.DAYS.between(LocalDate.parse("1990-01-01")
				  ,LocalDate.parse("2022-11-14"));
		  System.out.println("Days : "+daysBetween);
		  	  
		 }
}
