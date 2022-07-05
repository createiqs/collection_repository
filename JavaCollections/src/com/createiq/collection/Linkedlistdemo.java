package com.createiq.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlistdemo {
	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("England");
		countries.add("China");
		countries.add("Usa");
//		System.out.println(countries);

		Iterator<String> itr = countries.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		ListIterator<String> listIterator = countries.listIterator();
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

//		System.out.println(countries.contains("France"));
//		String input = "France";
//		if (countries.contains(input)) {
//			System.out.println(countries);
//		} else {
//		
//		}
//		System.out.println(countries);
//		if(countries.contains(input)) {
		System.out.println(countries);
//		}else {
////			countries.set(1, input);
//		}
//		System.out.println(countries);
	}

}
