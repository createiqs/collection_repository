package com.createiq.collection.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class StudentTest {
	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		students.add(new Student(100, "anil"));
		students.add(new Student(100, "anil"));
		students.add(new Student(100, "anil"));
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student);
		}
//		System.out.println(students);
	}

}
