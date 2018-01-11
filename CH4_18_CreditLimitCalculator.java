

import java.util.Scanner;

public class CH4_18_CreditLimitCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Credit Limit Calculator");
		int response = 0;
		do {
			System.out.println("Enter Account number:");
			int account = input.nextInt();
			System.out.println("Enter Account balance:");
			Double balance = input.nextDouble();
			System.out.println("Enter Account total charges:");
			Double charge = input.nextDouble();
			System.out.println("Enter Account total credit:");
			Double credit = input.nextDouble();
			System.out.println("Enter allowed credit limit:");
			Double limit = input.nextDouble();
			calculateActualBalance(account, balance, charge, credit, limit);
			System.out.println("Want to analize one more customer account (1 for Yes/0 for No):");
			response = input.nextInt();
		} while (response == 1);

	}

	public static void calculateActualBalance(int account, Double balance, Double charge, Double credit, Double limit) {
		Double actualBalance = balance - charge + credit;
		if (actualBalance >= limit) {
			System.out.printf("Actual %d account balance is: $%.2f%n", account, actualBalance);
		} else {
			System.out.printf("Actual %d account balance is: $%.2f and Credit Limit Exceeded %n", account,
					actualBalance);
		}
	}

}

/*
 * (Credit Limit Calculator) Develop a Java application that determines whether
 * any of several department-store customers has exceeded the credit limit on a
 * charge account. For each customer, the following facts are available: a)
 * account number b) balance at the beginning of the month c) total of all items
 * charged by the customer this month d) total of all credits applied to the
 * customer’s account this month e) allowed credit limit. The program should
 * input all these facts as integers, calculate the new balance (= beginning
 * balance + charges – credits), display the new balance and determine whether
 * the new balance exceeds the customer’s credit limit. For those customers
 * whose credit limit is exceeded, the program should display the message
 * "Credit limit exceeded".
 * 
 */