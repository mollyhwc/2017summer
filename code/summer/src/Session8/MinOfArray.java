package Session8;

public class MinOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3 };
		System.out.println("min is " + min(a));
	}

	public static int min(int[] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}

}
