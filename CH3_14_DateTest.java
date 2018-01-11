

import java.util.Scanner;

public class CH3_14_DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		CH3_14_Date date = new CH3_14_Date(11, 25, 2017);

		date.displayDate();
		System.out.println();
		// setting new date

		System.out.println("Enter month:");
		int month = input.nextInt();
		date.setMonth(month);
		System.out.println("Enter day:");
		int day = input.nextInt();
		date.setDay(day);
		System.out.println("Enter year:");
		int year = input.nextInt();
		date.setYear(year);
		
		// calling displayed method
		date.displayDate();

	}

}
