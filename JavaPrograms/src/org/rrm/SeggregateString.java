package org.rrm;

public class SeggregateString {

	public static void main(String[] args) {

		String s= "ab12@x3";
		String alph="";
		String spl="";
		String num="";
		//char[] ch=s.toCharArray();

		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') //AsciiValue of 'a'=97, 'z'=122, 'A'=65, 'Z'=90
			{
				alph = alph+s.charAt(i);
			}
			else if(ch>='0' && ch<='9')
			{
				num= num+s.charAt(i);
			}
			else
			{
				spl=spl+s.charAt(i);
			}

		}
		System.out.println(alph);
		System.out.println(spl);
		System.out.println(num);
	}

}
