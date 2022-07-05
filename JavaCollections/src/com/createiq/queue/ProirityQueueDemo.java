package com.createiq.queue;

import java.util.PriorityQueue;

public class ProirityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> numbers = new PriorityQueue<>();
		numbers.add(102);
		numbers.add(101);
		numbers.add(100);
		numbers.add(103);
		System.out.println(numbers);
	}

}
