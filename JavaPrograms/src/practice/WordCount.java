package practice;

public class WordCount {

	public static void main(String[] args) {

		String s= "i love u and u love me";

		String[] sarr= s.split(" ");
		for(int i=0; i<sarr.length; i++)
		{
			int count=1;
			for(int j=i+1;j<sarr.length;j++)
			{
				if(sarr[i].equals(sarr[j]))
				{
					count++;
					sarr[j]="0";
				}
			}
			if(sarr[i]!="0")
				System.out.println("\""+sarr[i]+"\"" +" is present "+count+" times" );
		}
	}
}
