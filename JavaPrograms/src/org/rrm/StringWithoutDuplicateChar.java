package org.rrm;

import java.util.HashSet;

public class StringWithoutDuplicateChar {

	public static void main(String[] args) {

		String s= "hello world";
		HashSet<Character> hs= new HashSet<Character>();
		for(int i=0;i< s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		//System.out.println(hs);
		for (Character character : hs) {
			System.out.print(character);
		}

		System.out.println();
		//Approach 2
		StringBuffer sb= new StringBuffer(s);
		for(int i=0;i<sb.length();i++)
		{
			for(int j=i+1;j<sb.length();j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
				{
					sb.deleteCharAt(j);
				}
			}
		}
		System.out.println(sb);
	}


}
