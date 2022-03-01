package practice;

public class Tester {

	public static void main(String[] arg)
	{
		int[] input= {2,3,4,5,6,7};

		int count =0;

		for(int i=0; i<input.length;i++)
		{
			int num= input[i];
			//System.out.println(num);
			for(int j=1; j<=num;j++)
			{
				int r= num%j;
				if(r==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(num+" , " );
			}
			count=0;
		}

	}
}
