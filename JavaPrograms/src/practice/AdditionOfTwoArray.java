package practice;

public class AdditionOfTwoArray {

	public static void main(String[] args) {

		int[] a= {1,2,3,4};
		int[] b= {4,5,6};
		//op=5,7,9

		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j==i;j++)
			{
				try 
				{
					System.out.println(a[i]+b[j]);
				}
				catch (ArrayIndexOutOfBoundsException e) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
