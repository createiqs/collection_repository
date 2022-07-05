package com.createiq.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
//		List<String> countries=new ArrayList<String>();
//		countries.add("India");
//		countries.add("India");
//		countries.add("India");
//		countries.add("India");
//		countries.add("India");
		Set<String> countries = new HashSet<String>();
		countries.add("India");
		countries.add("Australia");
		countries.add("India");
		countries.add("China");
		countries.add("Brazil");
		countries.add("Pakistan");
		countries.add("India");
		countries.add("India");
		countries.add(null);
		countries.add(null);
		System.out.println(countries);
		
		
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("India");
		treeSet.add("Australia");
		treeSet.add("India");
		treeSet.add("China");
		treeSet.add("Brazil");
		treeSet.add("Pakistan");
		treeSet.add(null);
		 
		System.out.println();

	}

}
