package taskForDevBridge.bonusDatesBetween;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BonusDateBetweenTest {

	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@BeforeEach
	public void tearDown() {
		System.setOut(standardOut);
	}

	@Test
	void printBonusBetweenIfExclusiveSmaller() {
		BonusDatesBetween.printBonusDatesBetween(2015, 2010);
		
		Assert.assertEquals("exclusive year is smaller than inclusive year", outputStreamCaptor.toString().trim());
}
	
	@Test
	void printBonusBetweenYear() {
		BonusDatesBetween.printBonusDatesBetween(2010, 2010);
		
		Assert.assertEquals("2010-01-02", outputStreamCaptor.toString().trim());
	}


}
