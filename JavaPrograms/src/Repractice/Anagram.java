package Repractice;

public class Anagram {

	public static void main(String[] args) {

		String s1= "silent";
		String s2= "listen";
		int count=0;
		for(int i=0; i<s1.length();i++)
		{

			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					count++;
				}
			}
		}
		if(count==s1.length())
		{
			System.out.println("given string is anagram");
		}
		else
		{
			System.out.println("given string is not anagram");
		}
	}
}
