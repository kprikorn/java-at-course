

import java.util.Scanner;

public class CH4_20_SalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Sales Commission Calculator");
		int response = 0;
		do {
			System.out.printf("Enter Employee name:");
			String name = input.next();
			System.out.printf("Enter hours worked by %s last week: %n", name);
			double hoursWorked = input.nextDouble();
			System.out.printf("Enter hourly rate for %s:%n", name);
			double hourlyRate = input.nextDouble();
			System.out.printf("%s\'s salary is $%.2f%n", name, calculateSalary(hoursWorked, hourlyRate));
			System.out.println("Want to enter one more item (1 for Yes/0 for No):");
			response = input.nextInt();
		} while (response == 1);
	}

	public static double calculateSalary(Double hoursWorked, Double hourlyRate) {
		Double salary = 0.00;
		if (hoursWorked <= 40.00) {
			salary = hoursWorked * hourlyRate;
		}
		if (hoursWorked > 40.00) {
			salary = ((40 * hourlyRate) + ((hoursWorked - 40) * 1.5) * hourlyRate);
		}
		return salary;
	}

}
/*
 * 4.20 (Salary Calculator) Develop a Java application that determines the gross
 * pay for each of three employees. The company pays straight time for the first
 * 40 hours worked by each employee and time and a half for all hours worked in
 * excess of 40. You’re given a list of the employees, their number of hours
 * worked last week and their hourly rates. Your program should input this
 * information for each employee, then determine and display the employee’s
 * gross pay. Use class Scanner to input the data.
 */