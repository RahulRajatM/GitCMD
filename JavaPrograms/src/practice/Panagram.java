package practice;

import java.util.Arrays;

public class Panagram {

	public static void main(String[] args) {

		String string= "The quick brown fox jumps over a lazy dog @";
		string= string.replace(" ", "");
		string= string.toUpperCase();
		char[] ch= string.toCharArray();
		//Arrays.sort(ch);
		int[] arr= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<ch.length;i++)
		{
			int index= string.charAt(i)-65;
			if(index>=0)
				arr[index]=1;

		}
		int count=0;
		for (int i=0; i<arr.length;i++) {

			if(arr[i]==1)
			{
				++count;
			}
		}
		if(count==26)
		{
			System.out.println("Given string is panagram");
		}
		else {
			System.out.println("Given string is not panagram");
		}
		System.out.println(Arrays.toString(arr));
	}
}
