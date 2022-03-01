package practice;

import java.util.Arrays;

public class SortingNumberAsc {

	public static void main(String[] args) {

		int[] arr= {10,30,5,60};
		//op= 5, 10,30,60
		for(int i=0; i<arr.length;i++)
		{

			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					arr[i]= arr[i]^arr[j];
					arr[j]= arr[i]^arr[j];
					arr[i]= arr[i]^arr[j];
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
