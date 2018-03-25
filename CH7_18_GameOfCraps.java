import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class CH7_18_GameOfCraps {

	// create secure random number generator for use in method rollDice
	private static final SecureRandom randomNumbers = new SecureRandom();

	// enum type with constants that represent the game status
	private enum Status {
		CONTINUE, WON, LOST
	};

	// constants that represent common rolls of the dice
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	static int numberOfRollsPerGame = 0;

	private static final int GAMES2PLAY = 1000000;

	// play multiple games and see statistics
	public static void main(String[] args) {
		// Create a hash map
		HashMap<Integer, Integer> won_hm = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> lost_hm = new HashMap<Integer, Integer>();

		for (int i = 1; i <= GAMES2PLAY; i++) {
			Status status = playCraps();
			// System.out.println(status + " with " + numberOfRollsPerGame + " roll(s)");

			// storing statistics
			if ("WON" == status.toString()) {
				if (won_hm.containsKey(numberOfRollsPerGame)) {
					int won_count = won_hm.get(numberOfRollsPerGame);
					won_hm.put(numberOfRollsPerGame, won_count + 1);
				} else
					won_hm.put(numberOfRollsPerGame, 1);
			}
			if ("LOST" == status.toString()) {
				if (lost_hm.containsKey(numberOfRollsPerGame)) {
					int lost_count = lost_hm.get(numberOfRollsPerGame);
					lost_hm.put(numberOfRollsPerGame, lost_count + 1);
				} else
					lost_hm.put(numberOfRollsPerGame, 1);
			}

		}

		// display statistics
		System.out.println("GAMES WON");
		Map<Integer, Integer> won_map = won_hm;
		int win_counter = 0;
		int total_win_rolls = 0;
		for (Map.Entry<Integer, Integer> entry : won_map.entrySet()) {
			System.out.println(entry.getValue() + " games won on " + entry.getKey() + " roll(s)");
			win_counter = win_counter + entry.getValue();
			total_win_rolls = total_win_rolls + (entry.getValue()*entry.getKey());

		}
		System.out.println("LOST");
		Map<Integer, Integer> lost_map = lost_hm;
		int lose_counter = 0;
		int total_lose_rolls = 0;
		for (Map.Entry<Integer, Integer> entry : lost_map.entrySet()) {
			System.out.println(entry.getValue() + " games lost on " + entry.getKey() + " roll(s)");
			lose_counter = lose_counter + entry.getValue();
			total_lose_rolls = total_lose_rolls + (entry.getValue()*entry.getKey());
		}

		// providing answers
//		System.out.println(win_counter + " wins");
//		System.out.println(lose_counter + " loses");
		System.out.println("The chance to win at craps is: " + win_counter + ":" + lose_counter);

		System.out.println("Total rolls: " + (total_win_rolls + total_lose_rolls));
		System.out.println("Total games: " + GAMES2PLAY);
		System.out.println("average length of a game is: "
				+ ((double) (total_win_rolls + total_lose_rolls) / (double) GAMES2PLAY) + "rolls");

	}

	// plays one game of craps
	public static Status playCraps() {
		int myPoint = 0; // point if no win or loss on first roll
		Status gameStatus; // can contain CONTINUE WON or LOST

		int sumOfDice = rollDice(); // first roll of the dice
		numberOfRollsPerGame = 1;
		// determine game status and point based on first roll

		switch (sumOfDice) {

		case SEVEN: // win with 7 on first roll
		case YO_LEVEN: // win with 11 on first roll
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES: // lose with 2 on first roll
		case TREY: // lose with 3 on first roll
		case BOX_CARS: // lose with 12 on first roll
			gameStatus = Status.LOST;
		default: // did not win or lose, so remember point
			gameStatus = Status.CONTINUE; // game is not over
			myPoint = sumOfDice; // remember the point
			// System.out.printf("Point is %d%n", myPoint);
			break;
		}

		// while game is not complete
		while (gameStatus == Status.CONTINUE) // not WON or LOST
		{
			sumOfDice = rollDice(); // roll dice again
			numberOfRollsPerGame++; // increasing counter
			// determine game status
			if (sumOfDice == myPoint) // win by making point
				gameStatus = Status.WON;
			else if (sumOfDice == SEVEN) // lose by rolling 7 before point
				gameStatus = Status.LOST;
		}
		// display won or lost message
		// if (gameStatus == Status.WON)
		// System.out.println("Player wins");
		// else
		// System.out.println("Player loses");
		return gameStatus;
	}

	// roll dice, calculate sum and display results
	public static int rollDice() {
		// pick random die values
		int die1 = 1 + randomNumbers.nextInt(6); // first die roll
		int die2 = 1 + randomNumbers.nextInt(6); // second die roll

		int sum = die1 + die2; // sum of die values

		// display results of this roll
		// System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

		return sum;
	}
}
/*
 ** Write an application that runs 1,000,000 games of craps (Fig. 6.8) and
 * answers the following questions:
 * 
 * a) How many games are won on the first roll, second roll, …, twentieth roll
 * and after the twentieth roll? b) How many games are lost on the first roll,
 * second roll, …, twentieth roll and after the twentieth roll? c) What are the
 * chances of winning at craps? * [Note: You should discover that craps is one
 * of the fairest casino games. What do you suppose this means?] d) What is the
 * average length of a game of craps? e) Do the chances of winning improve with
 * the length of the game?
 * 
 */