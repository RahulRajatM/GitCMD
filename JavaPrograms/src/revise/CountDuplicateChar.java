package revise;

import java.util.LinkedHashSet;

public class CountDuplicateChar {

	public static void main(String[] args) {

		String s= "harshini bs";

		LinkedHashSet<Character> lhs = new LinkedHashSet<>();

		for(int i=0; i<s.length();i++)
		{
			lhs.add(s.charAt(i));
		}

		for(Character ch:lhs)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count>1)
				System.out.println(ch +" : "+count+" times");
		}
	}

}
