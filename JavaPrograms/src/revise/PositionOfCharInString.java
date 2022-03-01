package revise;

import java.util.LinkedHashSet;

public class PositionOfCharInString {

	public static void main(String[] args) {

		String s= "JAIHANUMANA";

		LinkedHashSet<Character> set= new LinkedHashSet<>();
		for(int i=0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}

		for (Character ch : set) {

			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+" first position is "+(i+1));
					break;
				}
			}
		}
	}

}
