package Repractice;

public class AllZeroAtLast {

	public static void main(String[] args) {

		int[] arr= {1,0,3,0,5,2,0}; //op- 1235000

		int[] array= new int[arr.length];

		int n=0;
		int m= array.length-1;
		for (int i = 0; i < array.length; i++) {

			if(arr[i]==0)
			{
				array[m] = arr[i];
				m--;
			}
			else
			{
				array[n]= arr[i];
				n++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");

		}
	}
}
