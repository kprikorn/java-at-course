

import java.util.Scanner;

public class CH4_17_GasMileageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of trips recorded");
		int totalTrips = input.nextInt();
		// 1. for each trip read mileage and gallons while entering stopped
		int trip = 1;
		int overallMiles = 0;
		int overallGallons = 0;
		while (trip <= totalTrips) {
			System.out.printf("Enter miles for a trip %d %n", trip);
			int tripMiles = input.nextInt();
			System.out.printf("Enter gallons for a trip %d %n", trip);
			int tripGallons = input.nextInt();

			System.out.printf("for trip %d, miles/gallon is: %.2f %n", trip, (double) tripMiles / tripGallons);
			overallMiles = overallMiles + tripMiles;
			overallGallons = overallGallons + tripGallons;
			System.out.println();
			System.out.printf("for all %d trips miles/gallon is: %.2f %n", trip, (double) overallMiles / overallGallons);
			trip++;
			System.out.println();
		}

	}

}

/*
 * 4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles
 * get. One driver has kept track of several trips by recording the miles driven
 * and gallons used for each tankful. Develop a Java application that will input
 * the miles driven and gallons used (both as integers) for each trip. The
 * program should calculate and display the miles per gallon obtained for each
 * trip and print the combined miles per gallon obtained for all trips up to
 * this point. All averaging calculations should produce floating-point results.
 * Use class Scanner and sentinel-controlled repetition to obtain the data from
 * the user.
 * 
 */