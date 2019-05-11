/**
 * This program displays the entire lyric of "99 Bottles of Beer" using recursion
 * 
 */

public class RecursiveSong {

	//Main method initiates the main verse method and also executes the last print statement
	public static void main(String[] args) {
		mainverse(99);
		System.out.print("'cause there ain't no more bottles of beer on the wall!");
	}
	
	//Method for the main song lyric. Contains a recursive element
	public static void mainverse(int n){
		if (n == 0){
			No();
		} else {
			System.out.println(n + " bottles of beer on the wall,\n" + n + " bottles of beer,\n"
					+ "ya' take one down, ya' pass it around,");
			mainverse(n - 1);
		}
	}
	//Extraneous additional method to practice writing programs containing simple methods
	public static void No(){
		System.out.print("No ");
		bottles();
	}
	
	//As above
	public static void bottles(){
		System.out.print("bottles of beer on the wall,\n");
		System.out.print("no ");
		empty();
	}
	
	//As above
	public static void empty(){
		System.out.print("bottles of beer,\n");
		drunk();
	}
	
	//As above
	public static void drunk(){
		System.out.print("ya'can't take one down, ya'can't pass it around,\n");
	}
}
