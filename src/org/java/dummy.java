package org.java;
import java.util.*;
import java.util.Map.Entry;
import java.util.Set;

public class dummy {
	
	
	    public static void main(String[] args){
	        String str="bala";
	        Map<Character,Integer> map= new HashMap<>();
	        for(int i=0;i<str.length();i++){
	            if(map.containsKey(str.charAt(i))){
	               Integer integer= map.get(str.charAt(i));
	               map.put(str.charAt(i),++integer);
	            }
	            else{
	                map.put(str.charAt(i),1);
	            }
	        }
	    //   System.out.println(map);
	 Set<Entry<Character, Integer>> entrySet = map.entrySet();
			for (Entry<Character, Integer> entry : entrySet) {
				Integer value = entry.getValue();
//				System.out.println(value);
				if(value==1) {
					
					System.out.println(entry);
				}
	      }
	    }
	}


