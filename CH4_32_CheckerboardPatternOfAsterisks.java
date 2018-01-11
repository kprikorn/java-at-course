
public class CH4_32_CheckerboardPatternOfAsterisks {
	public static void main(String[] args) {

		System.out.println("Note: Default checkerboard size is 8x8!");
		int size =8;

		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if (i % 2 != 0) {
					System.out.print("* ");
				} else System.out.print(" *");
			}
			System.out.println();
		}

	}
}
/*
 * 4.32 (Checkerboard Pattern of Asterisks) Write an application that uses only
 * the output statements 
 * System.out.print("* "); 
 * System.out.print(" ");
 * System.out.println(); 
 * to display the checkerboard pattern that follows. A
 * System.out.println method call with no arguments causes the program to output
 * a single newline character. [Hint: Repetition statements are required.]
 */