package org.rrm;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<Integer,String> tm= new TreeMap<>();

		//tm.put(null, null);
		tm.put(101, "rahul");
		tm.put(102, "rajat");
		tm.put(103, "mishra");
		tm.put(114, "rajat");
		tm.put(105, "pradeep");
		tm.put(111, "diksha");

		tm.put(106, "khushboo");
		tm.put(107, null);
		tm.put(108, null);

		System.out.println(tm);
	}
}
