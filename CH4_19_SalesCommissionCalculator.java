

import java.util.Scanner;

public class CH4_19_SalesCommissionCalculator {
	static double SALARY = 200.00;
	static double RATE = 0.09;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Sales Commission Calculator");
		int response = 0;
		int item = 1;
		double earnings = SALARY;
		do {
			System.out.printf("Enter value for item %d:%n", item);
			double itemsValue = input.nextDouble();
			System.out.printf("Item %d commission is $%.2f%n", item, calculateSalesCommission(itemsValue));
			earnings+=calculateSalesCommission(itemsValue);
			System.out.println("Want to enter one more item (1 for Yes/0 for No):");
			response = input.nextInt();
			item++;
		} while (response == 1);
		System.out.printf("Total earnings: $%.2f", earnings);
	}

	public static double calculateSalesCommission(Double itemsValue) {
		Double amount = itemsValue * RATE;
		return amount;
	}

}
/*
 * (Sales Commission Calculator) A large company pays its salespeople on a
 * commission basis. The salespeople receive $200 per week plus 9% of their
 * gross sales for that week. For example, a salesperson who sells $5,000 worth
 * of merchandise in a week receives $200 plus 9% of $5000, or a total of $650.
 * You’ve been supplied with a list of the items sold by each salesperson. The
 * values of these items are as follows: Item Value 1 239.99 2 129.75 3 99.95 4
 * 350.89 Develop a Java application that inputs one salesperson’s items sold
 * for last week and calculates and displays that salesperson’s earnings.
 * There’s no limit to the number of items that can be sold.
 */