package taskForDevBridge.dateReverser;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import taskForDevBridge.dateCustom.DateCustom;

class DateReversetTest {

	private DateCustom dateCustom = new DateCustom();

	@Test
	void isValidTest() {
		
		dateCustom.setDate("2019-02-28");
		assertTrue(dateCustom.isValid());
		
		dateCustom.setDate("2019-02-30");
		assertFalse(dateCustom.isValid());
		
	}

}
