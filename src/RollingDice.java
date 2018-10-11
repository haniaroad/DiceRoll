import java.util.*;

public class RollingDice {

	public static void main(String[] args) {

		int userval;
		String playAgain = "";

		do {

			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter the number of sides you'd like your dice to have (Acceptable #'s are: 4, 6, 8, or 10)");

			userval = scanner.nextInt(); // Determining number of dice sides

			if (userval != 4 && userval != 6 && userval != 8 && userval != 10) { // Validating that number of dice is
																					// acceptable.

				System.out.println("Please enter a valid number of dice!");

			} else {

				System.out.println("Your first dice result is: " + diceRoll(userval));
				System.out.println("Your second dice result is: " + diceRoll(userval));
				System.out.println("Roll again? Y/N");
				playAgain = scanner.next();
			}

		} while (playAgain.equalsIgnoreCase("Y"));
	}

	public static int diceRoll(int userval) {

		if (userval == 4) { // Condition for Testing 4 Sided Dice Roll
			userval = (int) (Math.random() * 4 + 1);

		} else if (userval == 6) { // Condition for Testing 6 Sided Dice Roll
			userval = (int) (Math.random() * 6 + 1);

		}

		else if (userval == 8) { // Condition for Testing 8 Sided Dice Roll
			userval = (int) (Math.random() * 8 + 1);
		}

		else if (userval == 10) { // Condition for Testing 10 Sided Dice Roll
			userval = (int) (Math.random() * 10 + 1);
		}

		return userval;

	}

}
