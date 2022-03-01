package practice;

import java.util.Arrays;
import java.util.Iterator;

public class SortingString {

	public static void main(String[] args) {

		String s= "rahul"; //op= ahlru =alphabetical order
		char[] ch= s.toCharArray();
		//Arrays.sort(ch);
		//System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(ch[j]>ch[i])
				{
					ch[i]=(char) (ch[i]+ch[j]);
					ch[j]= (char) (ch[i]-ch[j]);
					ch[i]=(char) (ch[i]-ch[j]);
				}

			}
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
	}
}
