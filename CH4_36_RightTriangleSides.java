import java.util.Scanner;

public class CH4_36_RightTriangleSides {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive number: ");
		int num = input.nextInt();

		while (num < 0) {
			System.out.print("Wrong number: ");
			num = input.nextInt();
		}
		// ------------------------------------------------------------------------
		System.out.println("The factorial of " + num + " is " + fact(num));
		// ------------------------------------------------------------------------
		double e = 1;

		for (int i = 1; i < num; i++) {
			e = e + (1 / fact(i));
		}
		System.out.println("The e number is " + e);
		// ------------------------------------------------------------------------
		System.out.print("Enter the x value: ");
		int x = input.nextInt();
		System.out.print("Enter the number of terms to use for calculation: ");
		int t = input.nextInt();
		double e_x = 1;
		for (int i = 1; i <= t; i++) {
			e_x = e_x + (Math.pow(x, i) / fact(i));
		}
		System.out.println("The E at X power is " + e_x);
	}

	public static double fact(int f) {
		int fact = 1;
		for (int i = f; i > 1; i--) {
			fact *= i;
		}
		return fact;
	}
}

/*
 * a) Write an application that reads a nonnegative integer and computes and
 * prints its factorial.
 * 
 * b) Write an application that estimates the value of the mathematical constant
 * e by using the following formula. Allow the user to enter the number of terms
 * to calculate.
 * 
 * c) Write an application that computes the value of ex by using the following
 * formula. Allow the user to enter the number of terms to calculate.
 * 
 * 
 * 
 */