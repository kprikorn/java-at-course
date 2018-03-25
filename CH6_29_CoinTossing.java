import java.security.SecureRandom;
import java.util.Scanner;

public class CH6_29_CoinTossing {
	private enum Coin {
		HEADS, TAILS
	};

	static int heads = 0;
	static int tails = 0;
	// static int face;
	static Coin coinStatus;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of tosses:");
		int nrOfTosses = sc.nextInt();

		while (nrOfTosses <= 0) {
			System.out.println("Enter number of tosses:");
			nrOfTosses = sc.nextInt();
		}

		for (int toss = 1; toss <= nrOfTosses; toss++) {

			flip();
		}

		System.out.println("Face\tFrequency");
		System.out.printf("Heads\t%d%nTails\t%d%n", heads, tails);
		sc.close();
	}

	public static void flip() {
		SecureRandom rand = new SecureRandom();

		int face = rand.nextInt(2);
		switch (face) {
		case 0:
			coinStatus = Coin.HEADS;
			// System.out.print(coinStatus);
			++heads;
			break;
		case 1:
			coinStatus = Coin.TAILS;
			// System.out.print(coinStatus);
			++tails;
			break;
		}
	}

}

/*
 ** Write an application that simulates coin tossing. Let the program toss a coin
 * each time the user chooses the “TossCoin” menu option. Count the number of
 * times each side of the coin appears. Display the results. The program should
 * call a separate method flip that takes no arguments and returns a value from
 * a Coin enum (HEADS and TAILS). [Note: If the program realistically simulates
 * coin tossing, each side of the coin should appear approximately half the
 * time.]
 */