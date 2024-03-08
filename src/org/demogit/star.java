package org.demogit;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		System.out.println("enter ");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();

		for (int i = 0; i < value; i++) {
			for (int j = 0; j<=i; j++) {

				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		
		
	}
}

	
