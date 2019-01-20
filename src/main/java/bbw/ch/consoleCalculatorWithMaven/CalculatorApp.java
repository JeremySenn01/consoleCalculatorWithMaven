package bbw.ch.consoleCalculatorWithMaven;

public class CalculatorApp {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		int valueA = 0;
		int valueB = 0;
		
		System.out.println("Console Calculator");
		System.out.println("******************");
	
		valueA = 10;
		valueB = 20;
		
		System.out.println("Summe " + valueA + " + " +  valueB + " = " + calc.summe(valueA, valueB));
		System.out.println("Differenz " + valueA + " - " +  valueB + " = " + calc.differenz(valueA, valueB));
		System.out.println("Division " + 40 + " / " + valueB + " = " + + calc.divide(40, valueB));

	}
}
