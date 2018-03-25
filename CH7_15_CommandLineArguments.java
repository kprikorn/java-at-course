public class CH7_15_CommandLineArguments {

	public static void main(String[] args) {

		// check if single command-line argument passed
		if (args.length == 1) {
			System.out.println("one command-line argument found");
			// get array size from first command-line argument
			int arrayLength = Integer.parseInt(args[0]);
			int[] array = new int[arrayLength];
			printArray(array);

		} else {
			// declare variable array and initialize it with an array object
			int[] array = new int[10]; // create the array object
			System.out.printf("%s%8s%n", "Index", "Value"); // column headings
			printArray(array);
		}

	}

	public static void printArray(int[] array) {

		// output each array element's value
		for (int counter = 0; counter < array.length; counter++) {
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}

	}
}
/*
 ** Rewrite Fig. 7.2 so that the size of the array is specified by the first
 * command-line argument. If no command-line argument is supplied, use 10 as the
 * default size of the array.
 */