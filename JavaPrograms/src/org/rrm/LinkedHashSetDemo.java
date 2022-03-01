package org.rrm;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<Object> lhs= new LinkedHashSet<>();

		lhs.add("aaj");
		lhs.add("kal");
		lhs.add("kal");
		lhs.add("parso");
		lhs.add("monday");
		lhs.add("sunday");
		lhs.add("kal");
		System.out.println(lhs);
	}

}
