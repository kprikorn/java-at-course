
import java.util.Scanner;

public class Ex_2_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number1:");
		int number1 = input.nextInt();
		System.out.println("Enter number2:");
		int number2 = input.nextInt();
		System.out.println("Enter number3:");
		int number3 = input.nextInt();
		System.out.println("Enter number4:");
		int number4 = input.nextInt();
		System.out.println("Enter number5:");
		int number5 = input.nextInt();

		int max = number1;// init min variable

		if (number2 > max) {
			max = number2;
		}
		if (number3 > max) {
			max = number3;
		}
		if (number4 > max) {
			max = number4;
		}
		if (number5 > max) {
			max = number5;
		}
		System.out.printf("Largest is %d%n", max);// displaying largest

		int min = number1;// init min variable

		if (number2 < min) {
			min = number2;
		}
		if (number3 < min) {
			min = number3;
		}
		if (number4 < min) {
			min = number4;
		}
		if (number5 < min) {
			min = number5;
		}

		System.out.printf("Smalest is %d%n", min);// displaying smalest
	}
}