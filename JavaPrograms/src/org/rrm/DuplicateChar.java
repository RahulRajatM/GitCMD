package org.rrm;

import java.util.HashSet;

public class DuplicateChar {

	public static void main(String[] args) {

		String s= "hello world";
		HashSet<Character> hs= new HashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{
			hs.add(s.charAt(i));

		}
		for (Character character : hs) {
			int count=0;
			for(int i=0; i<s.length(); i++)
			{
				if(character==s.charAt(i))
				{
					count++;
				}
			}

			if(count>1)
			{
				System.out.println(character+" is duplicate...present "+count+ " times");

			}
		}

	}
}
