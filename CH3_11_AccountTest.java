

import java.util.Scanner;

public class CH3_11_AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a Scanner object to obtain input from the command window
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// create an Account object and assign it to myAccount
		CH3_11_Account myAccount1 = new CH3_11_Account("Daria", 22.22);
		CH3_11_Account myAccount2 = new CH3_11_Account("Stela", -55.55);

		// display account name and its balance
		System.out.printf("%s balance: $%.2f%n", myAccount1.getName(), myAccount1.getBalance());
		System.out.printf("%s balance: $%.2f%n", myAccount2.getName(), myAccount2.getBalance());

//		System.out.print("Enter deposit amount for account1: "); // prompt to deposit
//		double depositAmount = input.nextDouble();
//		System.out.printf("%nadding $%.2f to account1 balance%n%n", depositAmount);
//		myAccount1.deposit(depositAmount);//add to account1 balance
//		
//		System.out.print("Enter deposit amount for account2: "); // prompt to deposit
//		depositAmount = input.nextDouble();
//		System.out.printf("%nadding $%.2f to account2 balance%n%n", depositAmount);
//		myAccount2.deposit(depositAmount);//add to account2 balance
		
		System.out.print("Enter withdraw amount for account1: "); // prompt to withdraw
		double withdrawAmount = input.nextDouble();
		System.out.printf("%nwithdrawing $%.2f from account1 balance%n%n", withdrawAmount);
		myAccount1.withdraw(withdrawAmount);//withdraw from account1 balance
		
		System.out.print("Enter deposit amount for account2: "); // prompt to withdraw
		withdrawAmount = input.nextDouble();
		System.out.printf("%nwithdrawing $%.2f from account2 balance%n%n", withdrawAmount);
		myAccount2.withdraw(withdrawAmount);//withdraw from account2 balance
		
		
		// display account name and its balance
		System.out.printf("%s balance: $%.2f%n", myAccount1.getName(), myAccount1.getBalance());
		System.out.printf("%s balance: $%.2f%n", myAccount2.getName(), myAccount2.getBalance());

//		// prompt for and read name
//		System.out.println("Please enter the name:");
//		String theName = input.nextLine(); // read a line of text
//		myAccount1.setName(theName);
//		System.out.println();// blank line
//		// display current name value
//		System.out.printf("Current name is: %s%n%n", myAccount1.getName());
	}

}
