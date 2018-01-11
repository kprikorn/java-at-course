
import java.util.Scanner;

public class CH2_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number1:");
		int number1 = input.nextInt();
		System.out.println("Enter number2:");
		int number2 = input.nextInt();
		
		
		System.out.printf("Sum is %d%n", (number1 + number2));//displaying sum
		
		System.out.printf("Diff is %d%n", (number1 - number2));//displaying difference
		
		System.out.printf("Product is %d%n", (number1 * number2));//displaying product
		
		System.out.printf("Division is %d%n", (number1 / number2));//displaying division
		
	}
}
