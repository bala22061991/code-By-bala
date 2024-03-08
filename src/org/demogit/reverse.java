package org.demogit;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		System.out.println("enter ");
		Scanner scanner = new Scanner(System.in);
		String value = scanner.nextLine();

String s =value;
String r="";
char c;

//System.out.println("enter word:" + s);

for (int i = 0; i < s.length(); i++) {
	
	c=s.charAt(i);
	r=c+r;
}
System.out.println(r);

if(r.equals(s)) {
	System.out.println("palindrome");
}else {
	System.out.println("not palindrome");
}
	
	}
	
}

	
