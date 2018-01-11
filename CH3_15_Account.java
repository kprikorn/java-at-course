// Account class that contains a name instance variable and methods to set and get its value


public class CH3_15_Account {
	private String name; // instance variable
	private double balance;

	// constructor initializes name with parameter name
	public CH3_15_Account(String name, double balance) {// constructor name is class name
		this.name = name;

		// validate that the balance is greater than 0.0; if it's not, 16
		// instance variable balance keeps its default initial value of 0.0 17
		if (balance > 0.0) {// balance is valid check
			this.balance = balance; // assigning to instance variable balance
		}
	}

	// method that deposits (adds) only a valid amount to the balance
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) // if depositAmount is valid
			balance = balance + depositAmount; // add it to the balance
	}

	// method that witdraws (takes) from the balance
	public void withdraw(double withdrawAmount) {
		if (withdrawAmount < balance) { // if depositAmount is valid
			balance = balance - withdrawAmount; // add it to the balance

		} else
			System.out.println("Withdrawal amount exceeded account balance.");
	}

	// method returns the account balance
	public double getBalance() {
		return balance;
	}

	// method to set the name in the object
	public void setName(String name) {
		this.name = name;// stores the name
	}

	// method to retrieve the name from the object
	public String getName() {
		return name;

	}

}// end class Account
