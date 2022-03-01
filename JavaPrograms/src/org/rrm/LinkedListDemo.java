package org.rrm;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList< Object> ll= new LinkedList<>();
		ll.add("A");
		ll.add("D");
		ll.add("Z");
		ll.add(100);
		ll.add(250);
		System.out.println(ll);
	}
}
