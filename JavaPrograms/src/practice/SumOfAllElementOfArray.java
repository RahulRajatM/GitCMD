package practice;

public class SumOfAllElementOfArray {

	public static void main(String[] args) {

		int[] arr= {20, 80,100,500};

		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum= sum+ arr[i];
		}
		System.out.println(sum);
	}
}
