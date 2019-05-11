import java.util.Random;
import java.util.Scanner;
/**
 * Variant on the "Guess My Number" game, but with a recursive method built-in.
 * 
 */

public class GuessMyNumberRecursionStyle {

	public static void main(String[] args) {
		
		//Random number generator
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		
		//User prompts
		System.out.println("I'm thinking of a random number between 1 and 100, inclusive.");
		System.out.print("Guess what it is: ");
		
		//Calls the recursive method
		recursive(number);
		
		//Follows 'return' in flow of execution and notifies user of a correct answer
		System.out.println("Congratulations! You guessed " + number + ". That was my number!"
				+ " You win!");
	}
	
	//Recursive method with the random number as the base case, so the game will continue until
	//the base, i.e., the random number, is chosen by the user
	public static void recursive(int number){
		int guess;
		Scanner input = new Scanner(System.in);
		guess = input.nextInt();
		
		if (guess > number){
			System.out.print("Sorry, too high. Guess again: ");
			recursive(number);
		} else if (guess < number) {
			System.out.print("Sorry, too low. Guess again: ");
			recursive(number);
		} else {
			//terminates the recursive method and returns the flow of execution to main
			//where the user will be notified of the end of game play 
			return;
		}
	}
}
