/**
 * Program the takes an integer, n, and prints out a table of * equal to the value of n.
 * 
 */

public class WhileVersion {

	public static void main(String[] args) {
		asterisk(6);
	}
	
	public static void asterisk(int n) {
		int k = 0;
		int i = 1;
		while (i <= n) {
			k = 0;
			while (k < i) {
				k = k + 1;
				System.out.print("*");
			}
			i = i + 1;
			System.out.println();
		}
	}

}
