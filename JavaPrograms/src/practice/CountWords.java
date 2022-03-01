package practice;

import java.util.LinkedHashSet;

public class CountWords {

	public static void main(String[] args) {

		String s= "i love u and u love me";

		String[] sArr= s.split(" ");
		LinkedHashSet< String> lhs= new LinkedHashSet<>();
		for(int i=0; i<sArr.length;i++)
		{
			lhs.add(sArr[i]);
		}

		for(String string: lhs )
		{
			int count=0;
			for(String word: sArr)
			{
				if(string.equals(word))
				{
					count++;
				}
			}
			System.out.println(string+" is present "+count+" times");
		}
	}
}