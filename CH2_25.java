
import java.util.Scanner;

public class CH2_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number:");
		int num = input.nextInt();

		if (num % 2 == 0) {
			System.out.printf("%d is even", num);
		} else
			System.out.printf("%d is odd", num);
	}
}