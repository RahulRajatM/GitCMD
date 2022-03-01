package practice;

public class FindSumOfLastHalfElementOfArray {

	public static void main(String[] args) {

		int[] arr= {10,50,90, 60, 70}; // sum= 90+60+70= 220

		int sum=0;

		for(int i=2;i<arr.length;i++)
		{
			sum= sum+ arr[i];	
		}
		System.out.println(sum);
	}

}
