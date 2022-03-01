package org.rrm;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Object> al= new ArrayList<>();
		al.add(10);
		al.add(50);
		al.add("Sandy");
		al.add("rahul");
		al.add(null);
		System.out.println(al);
		al.remove("Sandy");
		System.out.println(al);
		al.set(0, "mishra");
		al.add("mishra");
		System.out.println(al);


	}
}
