package Repractice;

public class AdditionOfTwoArray {

	public static void main(String[] args) {

		int[] arr1= {10,40,50,200};
		int[] arr2= {110,140,150};

		for (int i = 0; i < arr1.length; i++) {

			for (int j = i; j==i; j++) {
				try
				{
					System.out.print(arr1[i]+arr2[j]+" ");
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println(arr1[i]);
				}
			}

		}

	}
}
