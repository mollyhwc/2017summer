package Session3;

import java.util.*;

public class FindMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int min=a;
		while (a!=0){
			if(a<min){
				min=a;
			}
			a=scan.nextInt();
		}
		System.out.println("the min is"+min);
	}

}
