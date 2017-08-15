package BankAccount;

public class TypeCompatible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 9;
		int number2 = 8;
		change(number1, number2);
		System.out.println("number1 is :" + number1 + "number2 is " + number2);

	}

	public static void change(double a, double b) {
		double temp;
		temp = a;
		a = b;
		b = temp;
	}
}
