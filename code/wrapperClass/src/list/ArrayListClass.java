package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class ArrayListClass {
	public static void main(String[] args) throws IOException {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++) {
			list.add(i * i);
		}
		Integer intObj = list.get(1);
		int n = list.get(1);
		System.out.println(intObj instanceof Integer);
		System.out.println(n);
		System.out.println(list.get(1).intValue());

		System.out.println("------");

		ArrayList a = new ArrayList();
		System.out.println(a.add(1));
		System.out.println(a.add("dd"));
		//int n=a.get(0);
		System.out.println(a.get(0));
		System.out.println(a.remove(1));

		System.out.println("---");

		List<String> list2 = new ArrayList<String>();
		list2.add("111");
		list2.add("222");
		Iterator<String> ite = list2.iterator();
		// list2.remove(1);
		while (ite.hasNext()) {
			if (ite.next().matches("222")) {
				ite.remove();
			}
		}
		System.out.println(list2);
		Scanner s=new Scanner(System.in);
		
		int rows = s.nextInt();
		System.out.println("---");
		int[] a1 = new int[rows];
		for (int i = 0; i < rows; i++) {
			System.out.println("--");
			a1[i] = s.nextInt();
		}
		System.out.println(a1[0]);

	}
}
