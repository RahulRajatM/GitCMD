package practice;

import java.util.LinkedHashSet;

public class Occurance {

	public static void main(String[] args) {

		String s= new String("rahul rajat mishra");
		//StringBuffer sb= new StringBuffer(s);
		LinkedHashSet<Character> lhs= new LinkedHashSet<>();

		for(int i=0;i<s.length();i++)
		{
			lhs.add(s.charAt(i));
		}

		for(Character ch: lhs)
		{
			int count=0;
			for(int i=0; i< s.length(); i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
					//sb.deleteCharAt(i);
				}
			}
			System.out.println(ch +" is present "+count+ " times");
		}
	}
}
