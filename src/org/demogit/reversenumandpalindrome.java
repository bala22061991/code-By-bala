package org.demogit;

import java.util.Scanner;

public class reversenumandpalindrome{

	public static void main(String[] args) {
//		System.out.println("enter ");
//		Scanner scanner = new Scanner(System.in);
//		String value = scanner.nextLine();

int num=123321;
int temp=num;
int r=0;

while (num>0) {
	int n=num%10;
	r=(r*10)+n;
	num/=10;
	
}

System.out.println(r);

if(r==temp) {
	System.out.println("palindrome");
}else {
	System.out.println("not palindrome");
}
	
	}
	
}

	
