package practice;

import java.util.LinkedHashSet;

public class OccuranceOfCharInString {

	public static void main(String[] args) {

		String s= "Tester";
		s= s.toLowerCase();
		LinkedHashSet<Character> lhs= new LinkedHashSet<>();

		for(int i=0;i<s.length();i++)
		{
			lhs.add(s.charAt(i));
		}

		for (Character ch : lhs) {
			int count = 0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			System.out.println(ch+" is present "+count+" times");
		}
	}
}
