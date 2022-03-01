package practice;

public class ArrayPragramKey {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5};

		int key=2;  //op= 2,3,4,5,1

		for(int i=0;i<key;i++)
		{
			if(i>=key)
			{
				for(int j=key; j<arr.length;j++)
				{
					System.out.print(arr[j]+" ");
					//break;
				}
			}
			System.out.println(arr[i]+" ");  

		}
	}
}
