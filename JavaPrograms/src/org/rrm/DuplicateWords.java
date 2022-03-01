package org.rrm;

import java.util.HashSet;

public class DuplicateWords {

	public static void main(String[] args) {
		String s= "my name is rama your name is shyam";

		String[] words = s.split(" ");
		HashSet< String> hs= new HashSet<>();

		for (String string : words) {
			hs.add(string);
		}

		for (String string : hs) {
			int count=0;
			for(String word:words)
			{
				if(word.equals(string))
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(string +" : "+  count+" times");

			}
		}
	}
}
