package taskForDevBridge.dateCustom;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateCustom implements DateCustomInterface {

	private String date = "";
	DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	public boolean isValid() {

		sdf.setLenient(false);
		try {
			sdf.parse(date);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}

	public void setDate(String date) {
		this.date = date;
		
	}

	public String getDate() {
		return date;
	}
}
