package bbw.ch.consoleCalculatorWithMaven;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {

	private Calculator testee;
	
	@Before
	public void setUp() {
		testee = new Calculator();
	}
	
	@Test
	public void test_summe_zweiPositive_OK() {
		assertTrue(testee.summe(4, 10) == 14);
		
	}
	
	

}
