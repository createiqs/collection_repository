package com.createiq.collection;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// last in first out (lifo)
		Stack tokens = new Stack();
		System.out.println(tokens.capacity());
		System.out.println(tokens.size());
		tokens.push(104);
		tokens.push(103);
		tokens.push(102);
		tokens.push(101);
		tokens.push(100);
//		System.out.println(tokens.size());
//		System.out.println(tokens);
//		System.out.println("position of 104: "+tokens.search(104));
		// call token number first position
//		System.out.println("retrive the first element of the stack: "+tokens.peek());
//		System.out.println(tokens);
//		System.out.println("used to remove the stack: "+tokens.pop());
//		System.out.println(tokens);
//		System.out.println(tokens.peek());
//		System.out.println(tokens.pop());
//		System.out.println(tokens);
//		System.out.println(tokens.peek());
//		System.out.println(tokens.pop());
//		System.out.println(tokens);

		Enumeration elements = tokens.elements();
		while (elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}

	}

}
