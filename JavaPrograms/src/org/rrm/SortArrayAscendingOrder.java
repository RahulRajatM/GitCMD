package org.rrm;

import java.util.Arrays;

public class SortArrayAscendingOrder {


	public static void main(String[] args) {
		int[] arr= {2,1,4,3,7,5};
		int sum=0;
		int l = arr.length;
		//System.out.println(l);
		for(int i=0; i<l; i++)
		{
			for(int j=i+1; j<l; j++)
			{
				if(arr[i]>arr[j])
				{
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}

			}
		}
		for(int i=0;i<l;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//System.out.println(Arrays.toString(arr));
		//System.out.println(arr[l-1]);

		for(int i=l-1; i>=l-3;i--)
		{
			sum= sum+arr[i];	
		}
		System.out.println(sum);
	}
}
