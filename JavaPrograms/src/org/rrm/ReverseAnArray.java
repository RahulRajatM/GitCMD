package org.rrm;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,60};
		int count=arr.length;
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<count;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				//swapping technique-1

				/*arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];*/

				//swapping technique-2

				/*int temp=arr[i];
				arr[i]= arr[j];
				arr[j]=temp;*/

				//swapping technique-3

				/*arr[i]= arr[i]*arr[j];
				arr[j]=arr[i]/arr[j];
				arr[i]=arr[i]/arr[j];*/

				//swapping technique-4- using bitwise operator

				arr[i]=arr[i]^arr[j];
				arr[j]=arr[i]^arr[j];
				arr[i]=arr[i]^arr[j];

			}	
		}
		System.out.print("After reversing = "+Arrays.toString(arr));
	}

}
