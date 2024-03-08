package org.java;
import java.util.Scanner;
public class middle {

	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        System.out.print("Enter a string: ");
//	        String input = scanner.nextLine();
//
//	        String middle = findMiddleCharacter(input);
//
//	        System.out.println("Middle character(s): " + middle);
//	    }
//
//	    public static String findMiddleCharacter(String str) {
//	      
//	    	int length = str.length();
//	        if (length == 0) {
//	           
//	        	return "String is empty";
//	        } 
//	        else if (length % 2 == 0) {
//	            int mid = length / 2;
//	           
//	            return str.substring(mid - 1, mid + 1);
//	        } 
//	        else {
//	            int mid = length / 2;
//	           
//	            return str.substring(mid, mid + 1);
//	        }
//	    }
//	}

	    	 Scanner scanner = new Scanner(System.in);

	         System.out.print("Enter a string: ");
	         String str = scanner.nextLine();

	         int length = str.length();
	         String middle;
	         int mid = length / 2;

	         if (length % 2 == 0) {
	        	
	             middle = str.substring(mid- 2, mid+ 2);
	         } else {
	        	
	             middle = str.substring(mid);
	         }

	         System.out.println("Middle character(s): " + middle);
	     }
	 }
