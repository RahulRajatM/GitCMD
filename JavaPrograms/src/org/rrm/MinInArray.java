package org.rrm;

import java.util.Scanner;

public class MinInArray {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of 1D Array ");
		int length= sc.nextInt();
		int[] arr= new int[length];
		System.out.println("Add elements in array");
		for(int i=0; i<length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Minimun value = "+ MinInArray.minimum(arr, length));

	}

	public static int minimum(int[] arr, int length) {

		int i, min=0;
		for(i=0;i<arr.length;i++)
		{
			min=arr[i];
			for(int j=0;j<arr.length;j++) //[10,20,30]
			{
				if(min>arr[j])
				{
					min=arr[j];
				}
			}
		}
		return min;
	}
}
