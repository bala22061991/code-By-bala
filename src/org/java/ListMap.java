package org.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ListMap {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);

		System.out.println(arrayList);

		Set<Integer> set = new LinkedHashSet<>();
		boolean all = set.addAll(arrayList);
		System.out.println(all);
		System.out.println(set);
		System.out.println(arrayList.size() - set.size());

		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		
		Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
		linkedHashMap.put(10, "bala");
		linkedHashMap.put(20, "java");
		linkedHashMap.put(30, "selenium");
		linkedHashMap.put(40, "python");
		linkedHashMap.put(50, "API");
		
//		 String string = linkedHashMap.get("bala");
//		
//		System.out.println(string);
		Set<Entry<Integer, String>> entrySet = linkedHashMap.entrySet();
	
			System.out.println(entrySet);
			
			
			
			for (Entry<Integer, String> entry : entrySet) {
				System.out.println(entry);
			
			}
			for (Entry<Integer, String> entry : entrySet) {
				Integer key = entry.getKey();
				
				System.out.println(key);
				
			}
			for (Entry<Integer, String> entry : entrySet) {
		
			
				System.out.println(entry.getValue());
			}
			
			
		
			
			
		}
			
		}
		
		
	


