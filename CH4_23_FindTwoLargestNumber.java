

import java.util.Scanner;

public class CH4_23_FindTwoLargestNumber {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("This will determine 2 largest numbers from 10 introduced by user");
		int l1 = 0;
		int l2 = 0;
		int counter = 1;
		while (counter <= 10) {
			System.out.printf("Enter number %d:", counter);
			int n = input.nextInt();
			if ((l1 == l2) && (n > l1)) {
				l1 = n;
			}
			if ((l1 > l2) && (n < l1) && (n > l2)) {
				l2 = n;
			}
			if ((l1 > l2) && (n > l1)) {
				l2 = n;
			}
			if ((l1 < l2) && (n < l2) && (n > l1)) {
				l1 = n;
			}
			if ((l1 < l2) && (n > l2)) {
				l1 = n;
			}
			System.out.printf("Largest numbers are:%d and %d\n", l1, l2);
			counter++;
		}
		System.out.printf("Largest numbers are:%d and %d", l1, l2);

	}

}

/*
 * (Find the Two Largest Numbers) Using an approach similar to that for Exercise
 * 4.21, find the two largest values of the 10 values entered. [Note: You may
 * input each number only once.]
 */