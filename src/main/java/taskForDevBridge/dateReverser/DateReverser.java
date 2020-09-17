package taskForDevBridge.dateReverser;

public class DateReverser implements DateReverserInterface {

	@Override
	public String reverseDay(int year) {
		
		StringBuilder sb = new StringBuilder(Integer.toString(year));
		
		sb.reverse();

		String day = sb.substring(2);
		
		String month = sb.substring(0,2);

		String dateString = String.format(Integer.toString(year) + "-" + month + "-" + day);
		
		return dateString;
	}


}
