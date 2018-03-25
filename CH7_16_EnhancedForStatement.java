public class CH7_16_EnhancedForStatement {

	public static void main(String[] args) {

		// check if at least two command-line argument passed
		if (args.length >= 2) {

			Double sum = 0.00;

			for (String element : args) {
				sum = sum + Double.parseDouble(element);

			}
			System.out.println("Sum is: " + sum);

		} else {
			System.out.println("Please pass at least two command-line arguments");
		}

	}

}
/*
 ** Write an application that uses an enhanced for statement to sum the double
 * values passed by the command-line arguments. [Hint: Use the static method
 * parseDouble of class Double to convert a String to a double value.]
 */