package practice;

import java.util.Arrays;
import java.util.Collections;

public class ReverseAnArray {

	public static void main(String[] args) {

		int[] arr= { 20, 50,80,90};
		
		//reverse
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}

		//Sorting
		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		/*for (int i : arr) {
			System.out.print(i+" ");
		}*/

	}
}
