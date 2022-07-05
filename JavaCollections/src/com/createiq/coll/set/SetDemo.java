package com.createiq.coll.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> weekDays = new HashSet<>();
		weekDays.add("Mon day");
		weekDays.add("Thues day");
		weekDays.add("Wedness day");
		weekDays.add("Thurs day");
		weekDays.add("Fri day");
		weekDays.add("Satur day");
		weekDays.add("Sun day");
		weekDays.add("Thues day");
		weekDays.add(null);
		weekDays.add("Thues day");
		weekDays.add(null);
		System.out.println(weekDays);
		System.out.println(weekDays.hashCode());

		Iterator<String> itr = weekDays.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		for (String weekDay : weekDays) {
			System.out.println(weekDay);
		}

//		for (int i = 0; i < weekDays.size(); i++) {
//			System.out.println(weekDays.toArray(i));
//		}

		weekDays.forEach(w -> System.out.println(w));

		Set<Integer> numbers = new HashSet<>();
		numbers.add(100);
		numbers.add(101);
		numbers.add(103);
		numbers.add(100);
		numbers.add(102);

		System.out.println(numbers);

	}

}
