package com.createiq.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee(100, "raju", 15000.00);
		Employee e2 = new Employee(100, "raju", 18000.00);
		Employee e3 = new Employee(102, "aravind", 12000.00);
		Employee e4 = new Employee(103, "uday", 15000.00);
		Employee e5 = new Employee(104, "rani", 16000.00);
		Employee e6 = new Employee(101, "laxmi", 10000.00); // 6 index

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
//		employees.add(123456);

//		Collections.sort( (List<T>) new Comparable() {
//
//			@Override
//			public int compareTo(Object o) {
//				return 0;
//			}
//			
//		});

//		IdBasedSortingOrder idBasedSortingOrder = new IdBasedSortingOrder();
//		Collections.sort(employees, idBasedSortingOrder);

		Collections.sort(employees);
		Iterator<Employee> iterator = employees.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// sort the id , name, salary based sorting

		// whose name starts with a , c, k only

		// find whose salary is between 10000 to 150000
	}

}
