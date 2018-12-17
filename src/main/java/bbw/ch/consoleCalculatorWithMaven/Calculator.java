package bbw.ch.consoleCalculatorWithMaven;

public class Calculator {

	public int summe(int summand1, int summand2) {
		return summand1 + summand2;
	}

	public int differenz(int minuend, int subtrahend) {
		return minuend - subtrahend;
	}

	public int multiply(int faktor1, int faktor2) {
		return faktor1 * faktor2;
	}

	public int divide(int dividend, int divisor) {
		if (divisor == 0) {
			throw new ArithmeticException();
		}
		return dividend / divisor;
	}

}
