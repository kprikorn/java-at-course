
import java.util.Scanner;

public class CH2_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter radius:");
		int radius = input.nextInt();

		System.out.printf("Diameter is %d%n", (2 * radius));
		System.out.printf("Circumferince is %f%n", (2 * Math.PI * radius));
		System.out.printf("Area is %f%n", (Math.PI * radius * radius));

	}
}