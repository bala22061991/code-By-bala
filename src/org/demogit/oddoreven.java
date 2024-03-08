package org.demogit;

import java.util.Scanner;

public class oddoreven {

	public static void main(String[] args) {
		System.out.println("enter ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
//		int num=10;
		
		if(value%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}

	}

}
