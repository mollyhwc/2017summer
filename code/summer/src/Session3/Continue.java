package Session3;

import java.util.*;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BreakContinue.java - example of break and continue

		int n;
		Scanner scan = new Scanner(System.in);
		while (true) { // seemingly an infinite loop
			System.out.print("Enter a positive integer ");
			System.out.print("or 0 to exit:");
			n = scan.nextInt();
			if (n == 0)
				break; // exit loop if n is 0
			if (n < 0)
				continue; // wrong value
			System.out.print("squareroot of " + n);
			System.out.println(" = " + Math.sqrt(n));
			// continue lands here at end of current iteration
		}
		// break lands here
		System.out.println("a zero was entered");

	}

}
