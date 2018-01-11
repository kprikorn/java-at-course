

import java.util.Scanner;

public class CH3_15_AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a Scanner object to obtain input from the command window
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// create an Account object and assign it to myAccount
		CH3_15_Account myAccount1 = new CH3_15_Account("A2404444", 22.22);
		CH3_15_Account myAccount2 = new CH3_15_Account("A2405555", -55.55);

		// display account name and its balance by calling displayAccountmethod
		displayAccount(myAccount1);
		displayAccount(myAccount2);

		System.out.print("Enter withdraw amount for account1: "); // prompt to withdraw
		double withdrawAmount = input.nextDouble();
		System.out.printf("%nwithdrawing $%.2f from %S balance%n%n", withdrawAmount, myAccount1.getName());
		myAccount1.withdraw(withdrawAmount);// withdraw from account1

		System.out.print("Enter deposit amount for account2: "); // prompt to deposit
		double depositAmount = input.nextDouble();
		System.out.printf("%ndepositing $%.2f to %S balance%n%n", depositAmount, myAccount2.getName());
		myAccount2.deposit(depositAmount);// deposit to account2

		// display account name and its balance by calling displayAccountmethod
		displayAccount(myAccount1);
		displayAccount(myAccount2);

	}

	public static void displayAccount(CH3_15_Account accountToDisplay) {

		System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
	}
}
