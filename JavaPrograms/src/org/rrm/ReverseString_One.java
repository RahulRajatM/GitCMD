package org.rrm;

public class ReverseString_One {

	public static void main(String[] args) {

		String name= "RAHUL RAJAT MISHRA";

		//Approach 1- By using length variable instead of length()
		char[] ch= name.toCharArray();
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println();

		//Approach 2= without using length and length()
		int count=0;
		for (char c : ch) {
			count++;
		}
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println();

		//Approach 3- By using charAt() method
		for(int i=name.length()-1; i>=0; i--)
		{
			System.out.print(name.charAt(i));
		}
		System.out.println();

		//Approach 4- By using third variable
		String reverse="";

		for(int i=name.length()-1; i>=0; i--)
		{
			reverse= reverse + name.charAt(i);
		}
		System.out.println(reverse);

		//Approach 5-using compareTo() method
		String s= "";
		int length = name.compareTo(s);
		//System.out.println(length);
		for(int i=length-1; i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
	}

}
