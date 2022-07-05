package com.createiq.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList(150); // default capacity =10
		System.out.println(arrayList.size());
		System.out.println(arrayList.isEmpty());
		arrayList.add(123);//0
		arrayList.add(453.02);
		arrayList.add("anil");
		arrayList.add('c');
		arrayList.add(365.2f);
		arrayList.add(12345689L);
		arrayList.add(32000);
		arrayList.add(127);// n
		System.out.println(arrayList.get(1));
//		System.out.println(arrayList.size());
//		arrayList.add(null);
//		System.out.println(arrayList);
		System.out.println(arrayList.get(5));
		arrayList.set(4, 'b');
		arrayList.add(null);
		arrayList.add(123);
//		System.out.println(arrayList);
//		System.out.println(arrayList.indexOf(123));
//		if (arrayList.contains("nil")) {
//			System.out.println(arrayList);
//		} else {
//			System.out.println("element not present in the given list");
//		}
//		System.out.println(arrayList.get(7));
		Collections.sort(arrayList);
		System.out.println("---------------------------");
		Iterator itr = arrayList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------------------");
		
		for(Object obj:arrayList) {
			System.out.println(obj);
		}
		System.out.println("---------------------------");
		arrayList.forEach(c -> System.out.println(c));

	}

}
