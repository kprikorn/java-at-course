import java.util.Scanner;

public class CH5_11_FindTheSmallestNumber {
	public static void main(String[] args) {
		// create Scanner to obtain input from command window
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int[] a = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.printf("Enter value %d of 5: ", i + 1);
			a[i] = input.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			for (int c = 1; c <= a[i]; c++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

/*
 * 5.16 (Bar Chart Printing Program) One interesting application of computers is
 * to display graphs and bar charts. Write an application that reads five
 * numbers between 1 and 30. For each number that’s read, your program should
 * display the same number of adjacent asterisks. For example, if your program
 * reads the number 7, it should display *******. Display the bars of asterisks
 * after you read all five numbers.
 */