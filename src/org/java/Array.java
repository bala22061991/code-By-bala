package org.java;

import java.util.Arrays;
import java.util.List;

public class Array {
	public static void main(String[] args) {

		int a[] = new int[5];

		a[0] = 1011;
		a[1] = 1022;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		int b[] = new int[5];

		b[0] = 60;
		b[1] = 70;
		b[2] = 80;
		b[3] = 90;
		b[4] = 100;

		for (int i = 0; i < b.length; i++) {
			System.out.println(a[i]);
			System.out.println(b[i]);
		}

		String[] array = { "bala", "kumar", "balakumaran" };

		for (String string : array) {
			System.out.println(string);

		}

		List<String> asList = Arrays.asList(array);
		System.out.println(asList);
	}
}
