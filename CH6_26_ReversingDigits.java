import java.util.Scanner;

public class CH6_26_ReversingDigits {

	public static void main(String[] args) {

		int num = 0;
		int reversenum = 0;
		System.out.println("Input your number and press enter: ");
		// This statement will capture the user input
		Scanner input = new Scanner(System.in);
		// Captured input would be stored in number num
		num = input.nextInt();
		// While Loop: Logic to find out the reverse number
		while (num != 0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num % 10;
			num = num / 10;
		}

		System.out.println("Reverse of input number is: " + reversenum);
		input.close();
	}

}

/*
 * Write a method that takes an integer value and returns the number with its
 * digits reversed. For example, given the number 7631, the method should return
 * 1367. Incorporate the method into an application that reads a value from the
 * user and displays the result.
 */