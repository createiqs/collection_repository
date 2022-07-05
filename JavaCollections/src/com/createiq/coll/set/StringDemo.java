package com.createiq.coll.set;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "createiq";
		String s2 = "createiq";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String s3 = "Ea";
		String s4 = "FB";
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		
	}

}
