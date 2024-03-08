package org.java;

public class StringType {

	public static void main(String[] args) {
		
		
		String s = "bala";
		String s1 = "bala";
		System.err.println(System.identityHashCode(s));
		System.err.println(System.identityHashCode(s1));
		
		String concat = s.concat(s1);
		System.err.println(concat);
		System.out.println(System.identityHashCode(concat));
		
		
		StringBuilder s2 = new StringBuilder("bala");
		StringBuffer s3 = new StringBuffer("bala");
		
		System.err.println(System.identityHashCode(s2));
		System.err.println(System.identityHashCode(s3));;
		StringBuilder append = s2.append(s3);
	System.out.println(append);
		System.out.println(System.identityHashCode(append));
	}
}
