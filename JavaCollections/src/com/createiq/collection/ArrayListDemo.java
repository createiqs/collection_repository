package com.createiq.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(30);
		numbers.add(50);
		numbers.add(10);
		numbers.add(20);
		numbers.add(40);
//		System.out.println(" before sorting...........");
		Iterator<Integer> itr = numbers.iterator();
		while (itr.hasNext()) {
			numbers.add(1000);
			int i = itr.next();
			System.out.println(i);
		}
//		Collections.sort(numbers);
//		Collections.reverse(numbers);
//		System.out.println(" After sorting...........");
//		int sum = 0;
//		Iterator<Integer> itr2 = numbers.iterator();
//		while (itr2.hasNext()) {
////			int i = itr2.next();
////			sum = sum + i;
//			System.out.println(itr2.next());
//		}
////		System.out.println(sum);
//
//		// 1. creat a group of names
//		
//		// 2. traversing or iterating
//		
//		//2.1 name.equal("k"){
//		//
	}

}
