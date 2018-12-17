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
	
	@Test
	public void test_differenz_zweiPositive_OK() {
		assertTrue(testee.differenz(4, 4) == 0);
				
	}
	
	@Test
	public void test_summe_zweiNegative_OK() {
		assertTrue(testee.summe(-3, -10) == -13);
	}
	
	@Test
	public void test_difference_zweiNegative_OK() {
		assertTrue(testee.differenz(-3, -10) == 7);
	}
	

}
