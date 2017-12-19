
import java.util.Scanner;

public class Ex_2_17 {

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

		System.out.printf("Sum is %d%n", (number1 + number2 + number3));// displaying sum

		System.out.printf("Average is %d%n", (number1 + number2 + number3) / 3);// displaying average

		System.out.printf("Product is %d%n", (number1 * number2 * number3));// displaying product

		int min = number1;
		int max = number1;

		if (number2 > max) {
			max = number2;
		}
		if (number3 > max) {
			max = number3;
		}
		if (number2 < min) {
			min = number2;
		}
		if (number3 < min) {
			min = number3;
		}
		
		System.out.printf("Largest is %d%n", max);// displaying largest
		
		System.out.printf("Smalest is %d%n", min);// displaying smalest
	}
}