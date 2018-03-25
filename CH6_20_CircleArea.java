import java.util.Scanner;

public class CH6_20_CircleArea {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter circle radius");
		double radius = input.nextInt();


		System.out.printf("Circle area is: %.2f", circle_area(radius));
		input.close();
	}

	public static double circle_area(double radius) {

		double circle_area = 0;
		circle_area = Math.PI * Math.pow(radius, 2);
		return circle_area;

	}
}

/*
 * Write an application that prompts the user for the radius of a circle and
 * uses a method called circleArea to calculate the area of the circle.
 * 
 */