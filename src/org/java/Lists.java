package org.java;

import java.util.ArrayList;
import java.util.List;

public class Lists {

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
		List<Integer> arrayList1 = new ArrayList<>();
		arrayList1.add(10);
		arrayList1.add(20);
		arrayList1.add(50);
		arrayList1.add(60);		
		System.out.println(arrayList1);
		
//		arrayList.add(3, 100);
//		System.out.println(arrayList);
//		
//		arrayList1.set(3, 100);
//		System.out.println(arrayList1);
		
//		boolean retainAll = arrayList1.retainAll(arrayList);
//		System.out.println(arrayList1);
//		System.out.println(retainAll);
		boolean removeAll = arrayList1.removeAll(arrayList);
		System.out.println(arrayList1);
		System.out.println(removeAll);
		

	}}