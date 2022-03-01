package Repractice;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {

		int[] a = {44,78,92,65,11,33};

		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					a[i]= a[i]+a[j];
					a[j]= a[i]-a[j];
					a[i]= a[i]-a[j];
				}
			}
		}
		//System.out.println(Arrays.toString(a));
		for(int num:a)
		{
			System.out.print(num+" ");
		}
		System.out.println("Second largest= "+a[1]);
	}
}
