package practice;

import java.util.Arrays;

public class SortArrayAscendingOrder {

	public static void main(String[] args) {

		int[]  arr= {90,130,400,567,210};

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]>arr[j])
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
