package org.rrm;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PositionOfCharacter {

	public static void main(String[] args) {

		String str="Tester";
		String s = str.toLowerCase();


		LinkedHashSet<Character> hs= new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{
			hs.add(s.charAt(i));

		}
		for (Character character : hs) {

			//int count=0;

			for(int i=0; i<s.length(); i++)
			{
				if(character == s.charAt(i))
				{
					int position = i+1;
					System.out.println("position of "+ character+" = "+ position);
					break;
				}
			}

		}
	}

}
