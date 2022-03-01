package revise;

import java.util.LinkedHashSet;

public class NonDuplicateCharInString {

	public static void main(String[] args) {

		String s= "AsoasretzhzT";
		String s1 = s.toLowerCase();

		LinkedHashSet<Character> set =  new LinkedHashSet<>();
		for(int i=0;i<s1.length();i++)
		{
			set.add(s1.charAt(i));
		}

		for (Character ch : set) {
			int count=0;
			for(int i=0; i<s1.length();i++)
			{
				if(ch==s1.charAt(i))
				{
					count++;
				}
			}
			if(count==1)
				System.out.println(ch+" is not duplicate");
		}
	}
}
