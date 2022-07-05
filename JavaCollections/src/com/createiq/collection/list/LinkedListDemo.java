package com.createiq.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> coutries = new LinkedList<>();
		coutries.add(10);
		coutries.add(20);
		coutries.add(30);
		coutries.add(40);

		Iterator<Integer> iterator = coutries.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// sum of intergers
		// find even numbers
		// odd numbers
	}

}
