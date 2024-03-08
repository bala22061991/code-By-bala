package org.demogit;

import java.util.Scanner;

public class demo {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	String value = scanner.nextLine();
	String s =value;
	String r="";
	char c;
	
	for (int i = 0; i < s.length(); i++) {
		c = s.charAt(i);
		r=c+r;
		
	}
	System.out.println(r);
	
}}
	
	

