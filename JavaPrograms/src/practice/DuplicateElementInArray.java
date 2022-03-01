package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicateElementInArray {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,2,1};

		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();

		for(int i=0; i<arr.length;i++)
		{
			set.add(arr[i]);
		}

		for (Integer integer : set) {

			int count=0;
			for(int i=0;i<arr.length;i++)
			{
				if(integer==arr[i])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.print(integer+" ");
			}
		}
	}
}
