import java.util.Scanner;

public class CH4_30_Palindromes {
	public static void main(String[] args) {
		// create Scanner to obtain input from command window
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 5 digit integer number:");
		long num = input.nextInt();
		// converting to string to be able to use length() method
		int length = String.valueOf(num).length();
		//checking if 5 digit
		while (length < 5 || length > 5) {
			System.out.println("Error!");
			System.out.print("Enter a 5 digit integer number:");
			num = input.nextInt();
			length = String.valueOf(num).length();

		}
		
		//checking if palindrome
		//checking 1st == 5th digit and 2nd == 4th digit
		if (((num / 10000)==(num % 10))&&((num / 1000 % 10)==(num / 10 % 10))) {
			System.out.printf("Number %d is palindrome",num);
		} else System.out.printf("Number %d is not palindrome",num);

	}
}
/*
 * 4.30 (Palindromes) A palindrome is a sequence of characters that reads the
 * same backward as forward. For example, each of the following five-digit
 * integers is a palindrome: 12321, 55555, 45554 and 11611. Write an application
 * that reads in a five-digit integer and determines whether it’s a palindrome.
 * If the number is not five digits long, display an error message and allow the
 * user to enter a new value.
 */