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

	// ---------------------------------------
	// Summen testen
	// ---------------------------------------

	@Test
	public void test_summe_zweiPositive_OK() {
		assertTrue(testee.summe(4, 10) == 14);

	}

	@Test
	public void test_summe_zweiNegative_OK() {
		assertTrue(testee.summe(-3, -10) == -13);
	}

	@Test
	public void test_summe_einPositivEinNegativ_OK() {
		assertTrue(testee.summe(-3, 10) == 7);
	}

	@Test
	public void test_summe_null_OK() {
		assertTrue(testee.summe(0, 0) == 0);
	}

	@Test
	public void test_summe_maxValue_OK() {
		assertTrue(testee.summe(Integer.MAX_VALUE, 0) == Integer.MAX_VALUE);
	}

	@Test(expected = ArithmeticException.class)
	public void test_summe_maxValue_NOK() {
		testee.summe(Integer.MAX_VALUE, 1);
	}

	@Test
	public void test_summe_minValue_OK() {
		assertTrue(testee.summe(Integer.MIN_VALUE, 0) == Integer.MIN_VALUE);
	}

	@Test(expected = ArithmeticException.class)
	public void test_summe_minValue_NOK() {
		testee.summe(Integer.MIN_VALUE, -1);
	}

	// ---------------------------------------
	// Differenz testen
	// ---------------------------------------

	@Test
	public void test_differenz_zweiPositive_OK() {
		assertTrue(testee.differenz(4, 4) == 0);

	}

	@Test
	public void test_difference_zweiNegative_OK() {
		assertTrue(testee.differenz(-3, -10) == 7);
	}

	@Test
	public void test_difference_einPositivEinNegativ_OK() {
		assertTrue(testee.differenz(-3, 10) == -13);
	}

	@Test
	public void test_difference_null_OK() {
		assertTrue(testee.differenz(0, 0) == 0);
	}

	@Test
	public void test_difference_maxValue_OK() {
		assertTrue(testee.differenz(Integer.MAX_VALUE, 0) == Integer.MAX_VALUE);
	}

	@Test(expected = ArithmeticException.class)
	public void test_difference_maxValue_NOK() {
		testee.differenz(Integer.MAX_VALUE, -1);
	}

	@Test
	public void test_difference_minValue_OK() {
		assertTrue(testee.differenz(Integer.MIN_VALUE, 0) == Integer.MIN_VALUE);
	}

	@Test(expected = ArithmeticException.class)
	public void test_difference_minValue_NOK() {
		testee.differenz(Integer.MIN_VALUE, 1);
	}

	// ---------------------------------------
	// Division testen
	// ---------------------------------------

	@Test
	public void test_divide_zweiPositive_OK() {
		assertTrue(testee.divide(10, 2) == 5);
	}

	@Test
	public void test_divide_zweiNegative_OK() {
		assertTrue(testee.divide(-10, -2) == 5);
	}

	@Test
	public void test_divide_einPositivEinNegativ_OK() {
		assertTrue(testee.divide(10, -2) == -5);
	}

	@Test
	public void test_divide_maxValue_OK() {
		assertTrue(testee.divide(Integer.MAX_VALUE, 1) == Integer.MAX_VALUE);
	}

	@Test
	public void test_divide_maxValue_NOK() {
		assertTrue(testee.divide(Integer.MAX_VALUE+1, 1) == Integer.MAX_VALUE+1);
	}
	
	@Test
	public void test_divide_minValue_OK() {
		assertTrue(testee.divide(Integer.MIN_VALUE, 1) == Integer.MIN_VALUE);
	}

	@Test
	public void test_divide_minValue_NOK() {
		assertTrue(testee.divide(Integer.MIN_VALUE-1, 1) == Integer.MIN_VALUE-1);
	}
	
	@Test(expected = ArithmeticException.class)
	public void test_divide_divisorIsZero_NOK() {
		testee.divide(10, 0);
	}
}
