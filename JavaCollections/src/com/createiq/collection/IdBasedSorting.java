package com.createiq.collection;

import java.util.Comparator;

public class IdBasedSorting implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getId() - o2.getId();
	}

}
