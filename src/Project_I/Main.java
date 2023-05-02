package Project_I;

import java.util.Scanner;

//Project I: Guess the Right Number
public class Main {

	public static void main(String[] args) {
		int max = 100;
		int min = 0;
		int secret_number = (int) (Math.random() * (max - min + 1));
		int userGuessNumber = 0;
		// whileGame(secret_number,userGuessNumber);
		forGame(secret_number, userGuessNumber);

	}

	public static void whileGame(int secret_number, int userGuessNumber) {
		System.out.println("\nYou are playing the game: Guess the Number. "
				+ "\nYou have unlimited attempts to guess the correct number. \n");
		while (true) {
			userGuessNumber = takeInput(userGuessNumber);
			if (userGuessNumber < secret_number) {
				System.out.println("Your guessed number is smaller.");
			} else if (userGuessNumber > secret_number) {
				System.out.println("Your guessed number is greater.");
			} else {
				System.out.println("Yayy, you won!");
				return;
			}
		}

	}

	public static void forGame(int secret_number, int userGuessNumber) {

		System.out.println("\nYou are playing the game: Guess the Number."
				+ " \nYou have maximum 5 attempts to guess the correct number. \n");
		for (int attempt = 0; attempt < 5; attempt++) {
			if (attempt == 4) {
				System.out.println("\nWatch out, it's your last turn.");
			}
			userGuessNumber = takeInput(userGuessNumber);
			if (userGuessNumber < secret_number) {
				System.out.println("Your guessed number is smaller.");
			} else if (userGuessNumber > secret_number) {
				System.out.println("Your guessed number is greater.");
			} else {
				System.out.println("Yay, you won!");
				return;
			}

		}
	}

	public static int takeInput(int guess) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number between 0 to 100\n");
		if (userInput.hasNextInt()) {
			guess = userInput.nextInt();
		} else {
			System.out.println("Enter a valid integer number between 0 and 100");
		}
		return guess;

	}
}
