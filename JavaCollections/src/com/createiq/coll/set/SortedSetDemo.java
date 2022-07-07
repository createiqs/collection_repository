package com.createiq.coll.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet<Integer> numbers = new TreeSet<>();
		numbers.add(103);
		numbers.add(104);
		numbers.add(102);
		numbers.add(100);
		numbers.add(101);

		System.out.println(numbers);
		
		System.out.println("returns first object from the sorted set: "+ numbers.first());
		System.out.println("returns last object from the sorted set: "+ numbers.last());
		
		System.out.println("highest number after given number: "+numbers.tailSet(103));
		System.out.println(numbers.headSet(101));
		
		System.out.println(numbers.subSet(100, 104));
	}

}
