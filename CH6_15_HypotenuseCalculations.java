import java.util.Scanner;

public class CH6_15_HypotenuseCalculations {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter triangle's side 1");
		double side1 = input.nextInt();
		System.out.println("Enter triangle's side 2");
		double side2 = input.nextInt();

		System.out.printf("Hypotenuse length is: %f", hypotenuse(side1, side2));
		input.close();
	}

	public static double hypotenuse(double side1, double side2) {

		double hypotenuse = 0;
		hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
		return hypotenuse;

	}
}

/*
 * Define a method hypotenuse that calculates the hypotenuse of a right triangle
 * when the lengths of the other two sides are given. The method should take two
 * arguments of type double and return the hypotenuse as a double. Incorporate
 * this method into an application that reads values for side1 and side2 and
 * performs the calculation with the hypotenuse method. Use Math methods pow and
 * sqrt to determine the length of the hypotenuse for each of the triangles
 * [Note: Class Math also provides method hypot to perform this calculation.]
 * 
 */