package org.rrm;

public class SwapFirstAndLastWord {


	public static void main(String[] args) {

		String s= "welcome to india";

		String[] str = s.split(" ");
		int l = str.length;
		String temp=  str[0];
		str[0]= str[l-1];
		str[l-1] = temp;
		//swapping

		for(int i=0; i<l;i++)
		{
			System.out.print(str[i]+" ");
		}
		// swapping  approach - 2
		//str[0]= str[0]+str[l-1];

	}

}
