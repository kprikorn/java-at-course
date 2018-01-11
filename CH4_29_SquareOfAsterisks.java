import java.util.Scanner;

public class CH4_29_SquareOfAsterisks {
	public static void main(String[] args) {
		// create Scanner to obtain input from command window
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter square's side size(between 1 and 20):");
		int size = input.nextInt();

		System.out.println();

		while (size < 1 || size > 20) {
			System.out.println("Error!");
			System.out.print("Enter square side between 1 and 20: ");
			size = input.nextInt();
		}

		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				System.out.print("* ");

			}

			System.out.println();
		}

	}
}

/*
 * Write an application that prompts the user to enter the size of the side of a
 * square, then displays a hollow square of that size made of asterisks. Your
 * program should work for squares of all side lengths between 1 and 20.
 */