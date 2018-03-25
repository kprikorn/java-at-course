import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CH6_22_TemperatureConversions {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature in celsius like 24C or fahrengeit 56F");

		String pattern = "(^\\d*)([FC])"; // defining a REGEX pattern
		Pattern p = Pattern.compile(pattern); // creating a pattern object

		String line = input.nextLine();
		Matcher m = p.matcher(line); // creating a matcher object.
		if (m.find()) {

			int temperature = Integer.parseInt(m.group(1));// getting temperature value
			String type = m.group(2); // getting type

			if (type.equals("C")) {
				System.out.printf("Converting to Fahrengeit : %.2fF", toFahrengeit(temperature));
			}

			if (type.equals("F")) {
				System.out.printf("Converting to Celsius : %.2fC", toCelsius(temperature));
			}

		} else {
			System.out.println("Wrong input. Cannot convert");
		}

		input.close();
	}

	public static double toCelsius(int fahrengeit_grades) {

		double celsius_grades = 0;
		celsius_grades = 5.0 / 9.0 * (fahrengeit_grades - 32);
		return celsius_grades;

	}

	public static double toFahrengeit(int celsius_grades) {

		double fahrengeit_grades = 0;
		fahrengeit_grades = 9.0 / 5.0 * celsius_grades + 32;
		return fahrengeit_grades;

	}
}

/*
 * write an application that enables the user either to enter a Fahrenheit
 * temperature and display the Celsius equivalent or to enter a Celsius
 * temperature and display the Fahrenheit equivalent.
 */