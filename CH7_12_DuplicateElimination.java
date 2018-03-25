
import java.util.Scanner;

public class CH7_12_DuplicateElimination {
	static int[] a = new int[5];

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		for (int c = 0; c < a.length; c++) {
			System.out.printf("Enter number %d of 5:", c + 1);
			int temp = input.nextInt();
			a[c] = temp;
		}
		input.close();

		for (int i = 0; i < a.length; i++) {
			// if current number is different from all previous then print it
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (a[j] == a[i]) {
					isDuplicate = true;
				}

			}
			if (!isDuplicate) {
				System.out.println(a[i]);
			}
		}

	}

}

/*
 ** Use a one-dimensional array to solve the following problem: Write an
 * application that inputs five numbers, each between 10 and 100, inclusive. As
 * each number is read, display it only if it’s not a duplicate of a number
 * already read. Provide for the “worst case,” in which all five numbers are
 * different. Use the smallest possible array to solve this problem. Display the
 * complete set of unique values input after the user enters each new value.
 */