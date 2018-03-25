import java.security.SecureRandom;
import java.util.Random;

public class CH7_17_DiceRolling {

	public static void main(String[] args) {

		int[] array = new int[13];

		for (int i = 1; i < 36000000; i++) {

			int sum = rollDiceWithRandom() + rollDiceWithRandom();

			array[sum]++;

		}

		for (int i = 2; i < 12; i++) {
			System.out.printf("sum of %d occured:\t%d times", i, array[i]);
			System.out.println();

		}

	}

	public static int rollDiceWithRandom() {
		Random rand = new Random();

		int dice = rand.nextInt(6) + 1;

		return dice;
	}

	public static int rollDiceWithSecureRandom() {
		SecureRandom rand = new SecureRandom();

		int dice = rand.nextInt(6) + 1;

		return dice;
	}
}
/*
 ** Write an application to simulate the rolling of two dice. The application
 * should use an object of class Random once to roll the first die and again to
 * roll the second die. The sum of the two values should then be calculated.
 * Each die can show an integer value from 1 to 6, so the sum of the values will
 * vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the least
 * frequent. Figure 7.28 shows the 36 possible combinations of the two dice.
 * Your application should roll the dice 36,000,000 times. Use a one-dimensional
 * array to tally the number of times each possible sum appears. Display the
 * results in tabular format.
 * 
 */