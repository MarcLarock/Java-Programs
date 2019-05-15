/**
 * Program that features a palindrome checking method.
 */

public class Palindrome {

	public static void main(String[] args) {
		//Tests methods
		isPalindrome("palindromeemordnilap");
		isPalindrome("jet");
		isPalindrome("level");
	}
	
	//Takes a string and indicates whether the word is a palindrome or not.
	//NB: this method IS case-sensitive.
	public static void isPalindrome(String s) {
		String k = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			k = k + s.charAt(i);
		}
		if (s.equals(k)) {
			System.out.println("The word " + s + " is a palindrome.");
		}
		else {
			System.out.println("The word " + s + " is not a palindorme.");
		}
	}
}
