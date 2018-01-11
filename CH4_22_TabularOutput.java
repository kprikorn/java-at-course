

public class CH4_22_TabularOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("N\t10*N\t100*N\t1000*N\n");
		int counter = 1;
		while (counter <= 5) {
			System.out.printf("%d\t%d\t%d\t%d\n", counter, 10 * counter, 100 * counter, 1000 * counter);
			counter++;
		}
	}

}

/*
 * 4.22 (Tabular Output) Write a Java application that uses looping to print the
 * following table of values:
 */