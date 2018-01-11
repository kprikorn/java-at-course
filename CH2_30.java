
import java.util.Scanner;

public class CH2_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 5 digit number:");
		int num = input.nextInt();

		System.out.printf("Digits are: %d   %d   %d   %d   %d", 
				(num / 10000),
				(num / 1000)%10, 
				(num / 100)%10,
				(num / 10)%10, 
				(num / 1)%10
		);

	}
}