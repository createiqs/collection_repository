package com.createiq.collection;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] array = { 10, 30, 50, 20, 40 };
		int findElement = 10;

		for (int i = 0; i < array.length; i++) {
			if ((array[i] > 0) && (array[i] == findElement)) {
				System.out.println(findElement);
			}

		}
		if (findElement == 0) {
			System.out.println("element should not be zero!");

		}

	}

}
