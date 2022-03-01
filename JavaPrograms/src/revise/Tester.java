package revise;

import java.util.LinkedHashSet;

public class Tester {

	//require op= Tester=> t=2 , e= 2, r= 1, s=1,
	public static void main(String[] args) {

		String s= "Tester";
		s= s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for(int i=0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}

		for (Character ch : set) {
			int count=0;
			for(int i=0; i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			System.out.print(" "+ch+"= "+count +",");
		}
	}
}
