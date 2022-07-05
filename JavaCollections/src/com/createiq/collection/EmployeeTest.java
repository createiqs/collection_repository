package com.createiq.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(100, "anil", 15000.00);
		Employee e2 = new Employee(104, "raju", 15000.00);
		Employee e3 = new Employee(102, "balu", 15000.00);
		Employee e4 = new Employee(101, "laxmi", 15000.00);
		Employee e5 = new Employee(103, "surya", 15000.00);

		List<Employee> employees = new ArrayList<>();
		// frequently when you performing retrivle operations
//		System.out.println(employees.capacity());
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);

		System.out.println(employees);
//		Collections.sort(employees, new IdBasedSorting());
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getId() - o2.getId();
			}
		});
		Iterator<Employee> itr = employees.iterator();
		while (itr.hasNext()) {
			Employee employee = itr.next();
//			if (employee.getName().startsWith("a")) {
				System.out.println(employee);
//			}
		}

		// 1. sort asc and desc
		// 2. print whose name starts with a, b,c etc
		// 3. find sum salaries
		// 4. whose salary starts with 15000 to 25000
		// 5. arraylist interview questions
		// 6. how to create arraylist
		// 7. underlinig data structure of arraylist
		// 8.seminar-->topics
		// 9. what is stack and when to go stack
		// 10. what is vector and when to go vector
		// 11. diff bw arrays and collection, arrays and arraylist, vector and
		// arraylist, stack and vector linked vs arrayust
	}

}
