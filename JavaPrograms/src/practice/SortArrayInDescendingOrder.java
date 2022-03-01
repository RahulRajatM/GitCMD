package practice;

import java.util.Arrays;

public class SortArrayInDescendingOrder {

	public static void main(String[] args) {
		int[] arr= {30,100,40,90};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					//swap
					arr[i]=arr[i]^arr[j];
					arr[j]=arr[i]^arr[j];
					arr[i]=arr[i]^arr[j];
				}
			}
		}
		//System.out.println(Arrays.toString(arr));
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
