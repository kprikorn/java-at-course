

public class CH3_14_Date {

	// declaring instance variables

	private int month;
	private int day;
	private int year;

	// constructor
	public CH3_14_Date(int month, int day, int year) {

		if (month > 0 && month < 13) {
			this.month = month;
		} else {
			this.month = 1;
		}
		if (day > 0 && day < 32) {
			this.day = day;
		} else {
			this.day = 1;
		}
		if (year > 1930 && year < 2222) {
			this.year = year;
		} else {
			this.year = 1970;
		}
	}

	public void setMonth(int month) {
		if (month > 0 && month < 13) {
			this.month = month;
		} else {
			System.out.println("wrong month, defaulting to 1");
			this.month = 1;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setDay(int day) {
		if (day > 0 && day < 32) {
			this.day = day;
		} else {
			System.out.println("wrong day, defaulting to 1");
			this.day = 1;
		}
	}

	public int getDay() {
		return day;
	}

	public void setYear(int year) {
		if (year > 1930 && year < 2222) {
			this.year = year;
		} else {
			System.out.println("wrong year, defaulting to 1970");
			this.year = 1970;
		}
	}

	public int getYear() {
		return year;
	}

	public void displayDate() {
		System.out.printf("Date is: %d/%d/%d", getMonth(), getDay(), getYear());
	}
}

/*
 * 3.14 (Date Class) Create a class called Date that includes three instance
 * variables—a month (type int), a day (type int) and a year (type int). Provide
 * a constructor that initializes the three instance variables and assumes that
 * the values provided are correct. Provide a set and a get method for each
 * instance variable. Provide a method displayDate that displays the month, day
 * and year separated by forward slashes (/). Write a test app named DateTest
 * that demonstrates class Date’s capabilities.
 * 
 */