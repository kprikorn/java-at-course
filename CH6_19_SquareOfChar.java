import java.util.Scanner;

public class CH6_19_SquareOfChar {

	public static void main(String[] args) {
		int SIZE = 5;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the char to print with");
		char fill = input.next().charAt(0);

		for (int i = 1; i <= SIZE; i++) {
			for (int j = 1; j <= SIZE; j++) {
				System.out.print(fill+" ");

			}

			System.out.println();
		}

		input.close();
	}

}

/*
 * Modify the method created in Exercise 6.18 to receive a second parameter of
 * type char called fillCharacter. Form the square using the char provided as an
 * argument. Thus, if side is 5 and fillCharacter is #, the method should
 * display ##### ##### ##### ##### ##### Use the following statement (in which
 * input is a Scanner object) to read a character from the user at the keyboard:
 * char fill = input.next().charAt(0);
 * 
 */