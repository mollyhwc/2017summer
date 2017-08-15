package Session3;
import java.util.*;
public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		while (true) { //seemingly an infinite loop
			System.out.print("Enter a positive integer:");
			int n = scan.nextInt();
			if (n < 0)
			break; // exit loop if n is negative
			System.out.print("squareroot of " + n);
			System.out.println(" = " + Math.sqrt(n));
			}
			// break jumps here
	}

}
