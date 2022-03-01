package revise;

import java.util.LinkedHashSet;

public class DuplicateNumInArray {

	public static void main(String[] args) {

		int[] num= {10,3,5,7,10,3};

		LinkedHashSet<Integer> set= new LinkedHashSet<>();

		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
		}

		for (Integer integer : set) {

			int count=0;
			for (Integer n : num) {
				if(integer==n)
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(integer+" is duplicate");
			}
		}
	}
}
