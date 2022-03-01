package practice;

public class ArrayProgramZeroAtLast {

	public static void main(String[] args) {
		int[] arr1= {1,2,0,0,4,0,9};

		int[] arr2= new int[arr1.length];

		int n= 0;
		int m= arr2.length-1;

		for(int i=0; i<arr1.length;i++)
		{
			if(arr1[i]==0)
			{
				arr2[m]=arr1[i];
				m--;
			}
			else
			{
				arr2[n]=arr1[i];
				n++;
			}

		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}
}
