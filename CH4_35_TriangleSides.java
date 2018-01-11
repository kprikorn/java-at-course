import java.util.Scanner;

public class CH4_35_TriangleSides {
	public static void main(String[] args) {
		// create Scanner to obtain input from command window
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter triangle A side:");
		int a = input.nextInt();
		System.out.println("Enter triangle B side:");
		int b = input.nextInt();
		System.out.println("Enter triangle C side:");
		int c = input.nextInt();

		// checking if non-zero
		while (a == 0 || b == 0 || c == 0) {
			System.out.print("triangle side cannot be zero-length:");
			System.out.println();
			System.out.println("Enter triangle A side:");
			a = input.nextInt();
			System.out.println("Enter triangle B side:");
			b = input.nextInt();
			System.out.println("Enter triangle C side:");
			c = input.nextInt();

		}

		// checking if inequality rule is TRUE
		if ((a > (c - b)) && (a < (c + b))) {
			System.out.println("They can represent a triangle");
		} else
			System.out.println("They can not represent a triangle");

	}
}

/*
 * 4.35 (Sides of a Triangle) Write an application that reads three nonzero
 * values entered by the user and determines and prints whether they could
 * represent the sides of a triangle.
 * 
 * A important property of triangles is the triangle inequality rule, which
 * states: the length of a side of a triangle is less than the sum of the
 * lengths of the other two sides and greater than the difference of the lengths
 * of the other two sides. c – b < a < c + b.
 */