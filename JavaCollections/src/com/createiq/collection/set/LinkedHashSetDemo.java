package com.createiq.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedSet=new LinkedHashSet<Integer>();
		linkedSet.add(30);
		linkedSet.add(10);
		linkedSet.add(20);
		linkedSet.add(40);
		System.out.println(linkedSet);
	}

}
