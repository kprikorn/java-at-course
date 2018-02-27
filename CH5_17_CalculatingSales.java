import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CH5_17_CalculatingSales {
	public static void main(String[] args) {
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		// initializing2-dim array
		double[][] products = { { 1, 2.98 }, { 2, 4.50 }, { 3, 9.98 }, { 4, 4.49 }, { 5, 6.87 } };
		System.out.println("Enter the pairs of product id and quantity sold, (space separated):");
		System.out.printf("NOTE: enter product id outside range 1..5 to quit ");

		String pattern = "(^\\d+)(\\s)(\\d+)"; // defining a pattern

		// Create a Pattern object
		Pattern p = Pattern.compile(pattern);

		int prod_id = 1;
		while (prod_id >= 1 && prod_id <= 5) {

			String line = input.nextLine();
			// Now create matcher object.
			Matcher m = p.matcher(line);
			if (m.find()) {
				prod_id = Integer.parseInt(m.group(1));// getting product
				int prod_qty = Integer.parseInt(m.group(3));// getting quantity
				switch (prod_id) {
				case 1:
					System.out.println(products[0][1] * prod_qty);
					break;
				case 2:
					System.out.println(products[1][1] * prod_qty);
					break;
				case 3:
					System.out.println(products[2][1] * prod_qty);
					break;
				case 4:
					System.out.println(products[3][1] * prod_qty);
					break;
				case 5:
					System.out.println(products[4][1] * prod_qty);
					break;
				}
			} else {
				System.out.println("NO MATCH");
			}

		}
		{
			System.out.println("SENTINEL:TERMINATED");
		}

		input.close();
	}
}

/*
 * 5.17 (Calculating Sales) An online retailer sells five products whose retail
 * prices are as follows: Product 1, $2.98; product 2, $4.50; product 3, $9.98;
 * product 4, $4.49 and product 5, $6.87. Write an application that reads a
 * series of pairs of numbers as follows: a) product number b) quantity sold
 * Your program should use a switch statement to determine the retail price for
 * each product. It should calculate and display the total retail value of all
 * products sold. Use a sentinel-controlled loop to determine when the program
 * should stop looping and display the final results.
 */