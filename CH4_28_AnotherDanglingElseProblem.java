

public class CH4_28_AnotherDanglingElseProblem {

	public static void main(String[] args) {
		int x = 5;
		int y = 8;

		System.out.println("a) Assuming that x = 5 and y = 8, the following output is produced:@@@@@ $$$$$ &&&&&");
		if (y == 8) 
		if (x == 5) 
		System.out.println("@@@@@"); 
		else 
		System.out.println("#####"); 
		System.out.println("$$$$$"); 
		System.out.println("&&&&&");
		

		System.out.println("b) Assuming that x = 5 and y = 8, the following output is produced:@@@@@");
		if (y == 8) 
		if (x == 5) 
		System.out.println("@@@@@"); 
		else {
		System.out.println("#####"); 
		System.out.println("$$$$$"); 
		System.out.println("&&&&&");
		}
		
		x = 5;
		y = 7;
		
		System.out.println("c) Assuming that x = 5 and y = 7, the following output is produced: @@@@@");
		if (y == 8) {} 
		if (x == 5) 
		System.out.println("@@@@@"); 
		else {
		System.out.println("#####"); 
		System.out.println("$$$$$"); 
		System.out.println("&&&&&");
		}
		
		System.out.println("d) Assuming that x = 5 and y = 7, the following output is produced: ##### $$$$$ &&&&&");
		if (y == 8)
		if (x == 5) 
		System.out.println("@@@@@"); 
		else {}
		System.out.println("#####"); 
		System.out.println("$$$$$"); 
		System.out.println("&&&&&");
		
	}

}
/*
 * (Another Dangling-else Problem) Modify the given code to produce the output
 * shown in each part of the problem. Use proper indentation techniques. Make no
 * changes other than inserting braces and changing the indentation of the code.
 * The compiler ignores indentation in a Java program. We’ve eliminated the
 * indentation from the given code to make the problem more challenging. [Note:
 * It’s possible that no modification is necessary for some of the parts.]
 */