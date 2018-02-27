import java.util.Scanner;

public class CH5_16_BarChartPrinter {
	public static void main(String[] args) {
		// create Scanner to obtain input from command window
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of values:");
		int n = input.nextInt();
		int i = 1;
		int min = 99999;
		while (i <= n) {
			System.out.printf("Enter number %d of %d: ", i, n);
			int val = input.nextInt();
			if (val < min) {
				min = val;
			}
			i++;
		}
		System.out.println("smallest number is: " + min);

	}
}

/*
 * 5.11 (Find the Smallest Value) Write an application that finds the smallest
 * of several integers. Assume that the first value read specifies the number of
 * values to input from the user.
 */