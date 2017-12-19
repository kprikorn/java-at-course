
import java.util.Scanner;

public class Ex_2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number1:");
		int number1 = input.nextInt();
		System.out.println("Enter number2:");
		int number2 = input.nextInt();
		
		if (number1 < number2) {
		System.out.printf("%d is larger",number2);//displaying largest
		}
		if (number1 > number2) {
		System.out.printf("%d is larger",number1);//displaying largest
		}
		if (number1 == number2) {
		System.out.printf("These numbers are equal");
		}
		
	}
}