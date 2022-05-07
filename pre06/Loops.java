import java.util.Scanner;

public class Loops {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 


		System.out.print("Enter a number: ");
		long number = input.nextLong();

		// Display the square root
		System.out.println(
			"The approximated square root of " + number + " is: " + sqrt(number));
	}
	
	/** Method squrt approximates the square root of n */
	public static double sqrt(long n) {
		long lastGuess = 1;	// Initial guess to positive value
		long nextGuess = (lastGuess + n / lastGuess) / 2; 

		// If the difference between nextGuess and lastGuess is less than 0.0001,
		// return nextGuess as the approximated square root of n.
		while (nextGuess - lastGuess > 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		lastGuess = nextGuess;
		return nextGuess = (lastGuess + n / lastGuess) / 2;
	}
}