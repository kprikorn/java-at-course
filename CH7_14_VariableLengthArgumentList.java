public class CH7_14_VariableLengthArgumentList {

	public static void main(String args[]) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;

		System.out.printf("Product of %d and %d is: %.2f %n", num1, num2, product(num1, num2));

		System.out.printf("Product of %d, %d and %d is: %.2f %n", num1, num2, num3, product(num1, num2, num3));

		System.out.printf("Product of %d, %d, %d and %d is: %.2f %n", num1, num2, num3, num4,
				product(num1, num2, num3, num4));

	}

	public static double product(int... numbers) {
		double product = 1;

		for (int num : numbers)
			product = product * num;

		return product;
	}
}

/*
 ** Write an application that calculates the product of a series of integers that
 * are passed to method product using a variable-length argument list. Test your
 * method with several calls, each with a different number of arguments.
 */