package revise;

import java.util.Arrays;

public class SumOfMax3ElementInArray {

	public static void main(String[] args) {

		int[] arr= {10,30,50,60,90};  //op= 50+60+90=200
		int sum=0;
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					//					arr[i]=arr[i]^arr[j];
					//					arr[j]= arr[i]^arr[j];
					//					arr[i]=arr[i]^arr[j];
					arr[i]= arr[i]+arr[j];
					arr[j]= arr[i]- arr[j];
					arr[i]= arr[i]-arr[j];
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		//		for (int i : arr) {
		//			sum= sum+i;
		//		}
		//		System.out.println(sum);

		for(int i=0; i<3;i++)
		{
			sum= sum+arr[i];
		}
		System.out.println(sum);
	}
}
