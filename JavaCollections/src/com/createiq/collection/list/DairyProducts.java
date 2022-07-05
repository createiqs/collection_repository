package com.createiq.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DairyProducts {
	public static void main(String[] args) {
		ArrayList<String> amulDairyProducts = new ArrayList<>();
		amulDairyProducts.add("Amul Milk");
		amulDairyProducts.add("Amul Curd");
		amulDairyProducts.add("Amul Butter");
		amulDairyProducts.add("Amul Cheese");
		amulDairyProducts.add("Amul Panner");
//		amulDairyProducts.add(123456);
		amulDairyProducts.set(1, "yogurt");
		amulDairyProducts.add(1, null);
		System.out.println(amulDairyProducts);

//		if (amulDairyProducts.contains("input")) {
//			System.out.println(amulDairyProducts);
//		} else {
//			System.out.println(" no data present");
//		}

//		Collections.sort(amulDairyProducts);

//		ArrayList<String> heritageDairyProducts = new ArrayList<>();
//		heritageDairyProducts.add("Heritage Milk");
//		heritageDairyProducts.add("Heritage Curd");
//		heritageDairyProducts.add("Heritage Butter");
//		heritageDairyProducts.add("Heritage Cheese");
//		heritageDairyProducts.add("Heritage Panner");
//
//		ArrayList<String> dairyProducts = new ArrayList<>(amulDairyProducts);
//		dairyProducts.addAll(heritageDairyProducts);
//
//		Iterator<String> itr = dairyProducts.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		for (String dairyProduct : amulDairyProducts) {
//			System.out.println(dairyProduct);
//		}
//
//		System.out.println("-----------------------");

		for (int i = 0; i < amulDairyProducts.size(); i++) {
			System.out.println(amulDairyProducts.get(i));
		}
//
//		System.out.println("-----------------------");
//
//		Iterator<String> itr = amulDairyProducts.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//
//		System.out.println("-----------------------");
//
//		amulDairyProducts.forEach(System.out::println);
//
//		System.out.println("-----------------------");
//
//		amulDairyProducts.forEach(t -> System.out.println(t));
//
//		System.out.println("-----------------------");
//
//		for (Iterator<String> itr2 = amulDairyProducts.iterator(); itr.hasNext();) {
//			System.out.println(itr2.next());
//		}
//		
//		System.out.println("-----------------------");
//		System.out.println(amulDairyProducts);

	}

}
