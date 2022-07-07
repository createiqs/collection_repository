package com.createiq.coll.set;

import java.util.HashSet;
import java.util.Set;

public class SetMethodsDemo {

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<Integer>(); // 16
		System.out.println(numbers.isEmpty());// false
		System.out.println(numbers.size()); // 0
		System.out.println(numbers); // empty to string
		numbers.add(100);
		numbers.add(101);
		numbers.add(102);
		numbers.add(103);
		System.out.println(numbers.isEmpty());
		System.out.println(numbers.size());
//		System.out.println(numbers);
// adding
//		if (numbers.add(103)) {
//			System.out.println(numbers);
//		} else {
//			System.out.println("the number already in the set");
//		}

		// remove
//		numbers.remove(100);
		// clear
//		numbers.clear();

// searching		
//		if (numbers.contains(100)) {
//			System.out.println("the number already in the set");
//		} else {
//			numbers.add(100);
//			System.out.println(numbers);
//		}

		Set<Integer> numbers2 = new HashSet<Integer>(); // 16
		numbers2.add(101);
		numbers2.add(102);
//		numbers2.add(104);
//		numbers2.add(105);
//		numbers.retainAll(numbers2);
//		System.out.println(numbers);

		Set<Integer> numbers3 = new HashSet<Integer>(numbers);
		numbers3.addAll(numbers2);
//
		System.out.println(numbers3);

	}

}
