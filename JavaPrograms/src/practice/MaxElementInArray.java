package practice;

public class MaxElementInArray {

	public static void main(String[] args) {

		int[] arr= {10,60,80,100};

		int max = arr[0];

		for(int i=0; i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max= arr[i];
			}
		}
		System.out.println(max);
	}
}
