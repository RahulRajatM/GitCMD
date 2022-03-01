package org.rrm;

public class MaxInArray {


	public static void main(String[] args) {
		int[] arr= {10,20,30};
		int l = arr.length;
		System.out.println(MaxInArray.maximum(arr, l));
	}
	public static int maximum(int[] arr , int l)
	{
		int i, max= 0;
		for(i=0;i<l;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		} 
		return max;
	}
}
