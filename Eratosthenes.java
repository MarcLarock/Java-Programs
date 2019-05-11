/**
 * Program that features a method that takes an integer, n, and returns all prime
 * numbers up to, but not including, n.
 * 
 */
public class Eratosthenes {

	public static void main(String[] args) {
		sieve(31);
	}
	
	public static void sieve(int n) {
		System.out.println("Generating all prime number between 2 to " + n);
		for (int i = 2; i < n; i++) {
			boolean isPrime = true;
 
			//Checks to see if a number is prime.
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			//Prints the prime numbers
			if (isPrime)
				System.out.print(i + " ");
		}
	}
}
