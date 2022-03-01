package practice;

import java.util.StringTokenizer;

public class ReverseWord {

	public static void main(String[] args) {

		String s= "rahul rajat mishra";
		String[] str = s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}


	}
}
