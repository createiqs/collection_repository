package com.createiq.collection.list;

import java.util.Arrays;

public class SortDemo {

	public static void main(String[] args) {
		String[] fruits = { "mango", "banana", "apple" };
		System.out.println(fruits);
		Arrays.sort(fruits);
		System.out.println(Arrays.toString(fruits));
		Employee e1 = new Employee(100, "raju", 15000.00);
		Employee e2 = new Employee(100, "raju", 18000.00);
		Employee e3 = new Employee(102, "aravind", 12000.00);
		Employee e4 = new Employee(103, "uday", 15000.00);
		Employee [] employees= {e1, e2, e3, e3};
		Arrays.sort(employees);
		System.out.println(Arrays.toString(employees));
	}
}
