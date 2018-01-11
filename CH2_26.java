
import java.util.Scanner;

public class CH2_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter num1:");
		int num1 = input.nextInt();
		System.out.println("Enter num2:");
		int num2 = input.nextInt();

		if (num1 % num2 == 0) {
			System.out.printf("%d is multiple of %d", num1, num2);
		}
	}
}