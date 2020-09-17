package taskForDevBridge.bonusDatesBetween;

import taskForDevBridge.dateCustom.DateCustom;
import taskForDevBridge.dateReverser.DateReverser;

public class BonusDatesBetween {

	public static void printBonusDatesBetween(int fromYear, int toYear) {

	DateReverser dateReverser = new DateReverser();
	DateCustom dateCustom = new DateCustom();
	String date;

	if(fromYear<999)fromYear=1000;
	if(toYear>9999)toYear=9999;

	if(toYear<fromYear)
	{
		System.out.println("exclusive year is smaller than inclusive year");
		
	} else {
			do { 
				date = dateReverser.reverseDay(fromYear);
				dateCustom.setDate(date);
				if (dateCustom.isValid()) {
					System.out.println(date);
				}
				fromYear++;
				
			} while (fromYear < toYear);
					
				 
				

			} 
		}

}
