import java.util.Scanner;

public class CH6_08_ParkingCharges {
	static Double INIT_TIME = 3.00;
	static Double DAY_TIME = 24.00;

	static Double INIT_CHARGE = 2.00;
	static Double HOUR_CHARGE = 0.50;
	static Double DAY_CHARGE = 10.00;

	public static void main(String[] args) {

		Scanner scanner_input = new Scanner(System.in);

		System.out.println("How many customers were yesterday?");

		int parking_places = scanner_input.nextInt();
		double running_total = 0;
		for (int i = 1; i <= parking_places; i++) {

			System.out.printf("Enter hours spent for customer %d:", i);
			System.out.println();
			double cust_charges = calculateCharges(scanner_input.nextInt());
			System.out.printf("Customer %d was charged with $ %.2f", i, cust_charges);
			System.out.println();
			running_total = running_total + cust_charges;

		}
		System.out.println("-------------------------------------------");
		System.out.printf("Running total for yesterday is $ %.2f", running_total);
		scanner_input.close();

	}

	public static double calculateCharges(double time) {
		double amount_charged = 0;

		if ((time > 0) && (time <= INIT_TIME)) {
			amount_charged = INIT_CHARGE;
		}
		if ((time > INIT_TIME) && (time < DAY_TIME)) {
			amount_charged = (time - INIT_TIME) * HOUR_CHARGE + INIT_CHARGE;
		}
		if (time >= DAY_TIME) {
			amount_charged = DAY_CHARGE;
		}

		return amount_charged;
	}

}

/*
 * (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up
 * to three hours. The garage charges an additional $0.50 per hour for each hour
 * or part thereof in excess of three hours. The maximum charge for any given
 * 24-hour period is $10.00. Assume that no car parks for longer than 24 hours
 * at a time. Write an application that calculates and displays the parking
 * charges for each customer who parked in the garage yesterday. You should
 * enter the hours parked for each customer. The program should display the
 * charge for the current customer and should calculate and display the running
 * total of yesterday’s receipts. It should use the method calculateCharges to
 * determine the charge for each customer.
 */