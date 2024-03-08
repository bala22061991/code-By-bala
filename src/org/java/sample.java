package org.java;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class sample {
	
	public static void main(String[] args) {
		String s="pneumonoultramicroscopicsilicovolcanoconiosis";
		
		HashMap<Character,Integer> hashMap = new HashMap<>();
	
	
		for (int i = 0; i < s.length(); i++) {
			
			
		
			
			if (hashMap.containsKey(s.charAt(i))) {
				
				Integer count = hashMap.get(s.charAt(i));
				 
				hashMap.put(s.charAt(i),++count);
			} else {
				hashMap.put(s.charAt(i), 1);
			}
			
		}
		System.out.println(hashMap);
		
		Set<Entry<Character, Integer>> entrySet = hashMap.entrySet();
		
		System.out.println("value above 1 :");
		
		for (Entry<Character, Integer> entry : entrySet) {
			Integer value = entry.getValue();
			
//			if (value>1) {
//				System.out.println(entry.getKey());
			
			System.out.println(entry);
//			}
			
		}
	}}


