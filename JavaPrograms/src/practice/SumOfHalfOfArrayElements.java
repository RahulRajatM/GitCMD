package practice;

public class SumOfHalfOfArrayElements {

	public static void main(String[] args) {

		int [] arr= {20, 60, 80, 100, 400,20};

		int sum=0;
		for(int i=0;i<arr.length/2;i++)
		{
			sum= sum+arr[i];
		}
		System.out.println(sum);
	}
}
