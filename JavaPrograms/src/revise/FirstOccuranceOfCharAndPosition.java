package revise;

import java.util.LinkedHashSet;

public class FirstOccuranceOfCharAndPosition {

	public static void main(String[] args) {

		String s= "jai shree rama";

		LinkedHashSet<Character> set= new LinkedHashSet<>();

		for(int i=0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}

		for (Character character : set) {

			for(int i=0;i<s.length();i++)
			{
				if(character==s.charAt(i))
				{
					System.out.println(character+" is at "+ (i+1)+" position");
					break;
				}
			}
		}
	}
}
