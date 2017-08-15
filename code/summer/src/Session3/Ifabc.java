package Session3;

import java.util.Scanner;

public class Ifabc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c, t;
		Scanner scan = new Scanner(System.in);
		System.out.println("type three integers:");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		if (b > c) {
			t = b;
			b = c;
			c = t;
		}
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		System.out.print("The sorted order is : ");
		System.out.println(a + ", " + b + ", " + c);
	}
}