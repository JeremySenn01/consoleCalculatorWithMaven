package bbw.ch.consoleCalculatorWithMaven;

public class Calculator {

	public int summe(int summand1, int summand2) {
		
		long result = (long) summand1 + (long) summand2;
		
		if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
			throw new ArithmeticException();
		}
		return summand1 + summand2;
	}

	public int differenz(int minuend, int subtrahend) {
		
		long result = (long) minuend - (long) subtrahend;
		
		if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
			throw new ArithmeticException();
		}
		
		return minuend - subtrahend;
	}

	public int multiply(int faktor1, int faktor2) {
		return faktor1 * faktor2;
	}

	public int divide(int dividend, int divisor) {
		
		long result = (long) dividend / (long) divisor;
		
		
		if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
			System.out.println("invalid result");
			throw new ArithmeticException();
		}
		
		if (divisor == 0) {
			throw new ArithmeticException();
		}
		return dividend / divisor;
	}

}
