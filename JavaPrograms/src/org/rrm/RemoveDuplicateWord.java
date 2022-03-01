package org.rrm;

import java.util.LinkedHashSet;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		String s= "hello welcome hello world welcome to ty";

		String[] words = s.split(" ");
		LinkedHashSet< String> hs= new LinkedHashSet<>();

		for (String string : words) {
			hs.add(string);
		}

		for (String string : hs) {
			System.out.print(string+" ");

		}
	}
}
