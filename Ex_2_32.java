
import java.util.Scanner;

public class Ex_2_32 {

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

		int pos = 0;
		int neg = 0;
		int zro = 0;

		if (number1 >= 0) {

			if (number1 == 0) {
				zro = zro+1;
			} else pos = pos+1;
		} else neg=neg+1;

		if (number2 >= 0) {

			if (number2 == 0) {
				zro = zro+1;
			} else pos = pos+1;
		} else neg=neg+1;
		
		if (number3 >= 0) {

			if (number3 == 0) {
				zro = zro+1;
			} else pos = pos+1;
		} else neg=neg+1;
		
		if (number4 >= 0) {

			if (number4 == 0) {
				zro = zro+1;
			} else pos = pos+1;
		} else neg=neg+1;
		
		if (number5 >= 0) {

			if (number5 == 0) {
				zro = zro+1;
			} else pos = pos+1;
		} else neg=neg+1;
		
		System.out.printf("%d negative inputs%n", neg);
		System.out.printf("%d positive inputs%n", pos);
		System.out.printf("%d zero inputs%n", zro);

	}
}