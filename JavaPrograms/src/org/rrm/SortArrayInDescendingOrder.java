package org.rrm;

import java.util.Arrays;

public class SortArrayInDescendingOrder {

	public static void main(String[] args) {
		int[] arr= {2,1,4,3,7,5};

		int l = arr.length;
		System.out.println(l);
		for(int i=0; i<l; i++)
		{
			for(int j=i+1; j<l; j++)
			{
				if(arr[i]<arr[j])
				{
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}

			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
