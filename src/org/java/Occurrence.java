package org.java;


//import java.util.*;
//public class Occurrence {
//	static void characterCount(String inputString){
//	
//		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
//		char[] strArray = inputString.toCharArray();
//		
//		for (char c : strArray) {
//			if (charCountMap.containsKey(c)) {
//				charCountMap.put(c, charCountMap.get(c) + 1);
//			}
//			else {
//				charCountMap.put(c, 1);
//			}
//		}
//
//		for (Map.Entry entry : charCountMap.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
//	}
//
//	public static void main(String[] args)
//	{
//		String str = "balakumaran";
//		characterCount(str);
//	}
//}

import java.util.HashMap;

public class Occurrence {

    public static void main(String[] args) {
        String str = "HelloWorld!";

        // Create a HashMap to store the count of each character
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Iterate over the string and update the count of each character
       
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
           
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        // Print the count of each character
        for (Character key : charCount.keySet()) {
            System.out.println(key + ": " + charCount.get(key));
        }
    }
}
