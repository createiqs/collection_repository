package com.createiq.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(30);
		arrayList.add(20);
		arrayList.add(40);
		arrayList.add(10);
		Iterator<Integer> itr = arrayList.iterator();
		while (itr.hasNext()) {
//			arrayList.add(50);
			System.out.println(itr.next());
		}
		System.out.println("------------------------------");
		CopyOnWriteArrayList<Integer> copyArrayList = new CopyOnWriteArrayList<>();
		copyArrayList.add(30);
		copyArrayList.add(20);
		copyArrayList.add(40);
		copyArrayList.add(10);
		Iterator<Integer> itr2 = copyArrayList.iterator();
		while (itr2.hasNext()) {
			copyArrayList.add(50);
			System.out.println(itr2.next());
		}

//		Collections.sort(arrayList);
//		System.out.println(arrayList);

//		LinkedList< String> linked=new LinkedList<>();
//		Collections.sort(linked);
	}

}
