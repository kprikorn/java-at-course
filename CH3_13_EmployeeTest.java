

import java.util.Scanner;

public class CH3_13_EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		CH3_13_Employee empl1 = new CH3_13_Employee("Adam", "Smith", 1000.00);
		CH3_13_Employee empl2 = new CH3_13_Employee("Mark", "Tsuker", 12340.99);

		System.out.printf("%s %s's yearly salary is $%.2f %n", empl1.getFirstName(), empl1.getLastName(),
				empl1.getMonthlySalary() * 12);
		System.out.printf("%s %s's yearly salary is $%.2f %n", empl2.getFirstName(), empl2.getLastName(),
				empl2.getMonthlySalary() * 12);

		// giving raise

		System.out.println("Enter overall salary raise in percents:");
		double raise = input.nextInt();
		empl1.setMonthlySalary(empl1.getMonthlySalary() * (1 + raise / 100));
		empl2.setMonthlySalary(empl2.getMonthlySalary() * (1 + raise / 100));

		// displaying early salary after raise
		System.out.printf("%s %s's yearly salary is $%.2f %n", empl1.getFirstName(), empl1.getLastName(),
				empl1.getMonthlySalary() * 12);
		System.out.printf("%s %s's yearly salary is $%.2f %n", empl2.getFirstName(), empl2.getLastName(),
				empl2.getMonthlySalary() * 12);
	}

}
