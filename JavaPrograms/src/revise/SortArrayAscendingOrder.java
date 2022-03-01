package revise;

import java.util.Arrays;
import java.util.Iterator;

public class SortArrayAscendingOrder {

	public static void main(String[] args) {

		int[] n= {100,20,300,60};


		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]>n[j])
				{
					n[i]= n[i]+n[j];
					n[j]=n[i]-n[j];
					n[i]=n[i]-n[j];
				}
			}
		}
		//		for (int i : n) {
		//			System.out.print(i+" ");
		//		}

		System.out.println(Arrays.toString(n));
	}
}
