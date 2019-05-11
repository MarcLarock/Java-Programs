/**
 * Factorial calculator 
 */

public class FactorialCalculator {

	public static void main(String[] args) {
		System.out.println("3 factorial is " + factorial(3));
		System.out.println("6 factorial is " + factorial(6));
		System.out.println("9 factorial is " + factorial(9));
	}
	
	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int factorial = 1;
		while (n > 0) {
			factorial = factorial * n;
			n = n-1;
		}
		return factorial;
	}
}
