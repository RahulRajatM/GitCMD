package org.rrm;

public class MinLengthOfStringInArray {

	public static void main(String[] args) {
				
		String[] str= {"ram", "mohan", "sita","soni","jit", "Rahul"};

		String minLen= str[0];
		for(int i=1;i<str.length;i++)
		{
			if(minLen.length() > str[i].length())
			{
				minLen= str[i];
			}
		}

		for(int i=0;i<str.length;i++)
		{
			if(minLen.length()== str[i].length())
			{
				System.out.println(str[i]);
			}
		}
	}
}
