package org.rrm;

public class StringP1 {

	public static void main(String[] args) {
		String s= "india";
		String output="";

		//Approach-1
		/*	for(int i=0;i<s.length();i++)
		{
			output=output+ s.charAt(i);
			System.out.println(output);
		}*/

		//Approach-2
		for(int i=0;i<s.length();i++)
		{
			for(int j=i; j==i;j++)
			{
				System.out.println(s.substring(0, i+1));
			}
		}

	}
}

