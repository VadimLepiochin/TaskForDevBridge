package taskForDevBridge.dateCustom;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import taskForDevBridge.dateReverser.DateReverser;

class DateCustomTest {

	private DateReverser dateReverser = new DateReverser();
	private String date;

	@Test
	void isValidTest() {
		
		date = dateReverser.reverseDay(2011);
		assertTrue(date.equals("2011-11-02"));
		
		date = dateReverser.reverseDay(9999);
		assertTrue(date.equals("9999-99-99"));
		
		date = dateReverser.reverseDay(2011);
		assertFalse(date.equals("2011-02-11"));
		
		date = dateReverser.reverseDay(2011);
		assertFalse(date.equals("2011-20-11"));
		
		date = dateReverser.reverseDay(2011);
		assertFalse(date.equals("2011-11-20"));
		
		
	}

}
