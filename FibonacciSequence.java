/**
 * Program that generates the Fibonacci numbers up to an integer, n, through the use of 
 * a while loop.
 * 
 */

public class FibonacciSequence {

	public static void main(String[] args) {
		System.out.println(fibonacci(6));
		
	}
	
	public static int fibonacci(int n) {
		if (n==1 || n==2) {
			return 1;
		}
		int i = 3;
		int fib1 = 1, fib2 = 1, fibonacci =1;
		while (i <= n) {
			i = i + 1;
			fibonacci = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibonacci;
		}
		return fibonacci;
	}
}
