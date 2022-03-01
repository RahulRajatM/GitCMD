package revise;

public class StrongNumber {

	public static void main(String[] args) {

		int num= 145; //1!+4!+5!= 1+24+120=145 is strong number

		int temp= num;
		int sum=0;

		for(int i= temp; i>0;i=i/10)
		{
			int fact=1;
			int ld= i%10;

			for(int j=ld;j>0;j--)
			{
				fact= fact*j;
			}
			sum= sum+fact;
		}
		if(sum==num)
		{
			System.out.println(num+" is a strong number");
		}
		else
		{
			System.out.println(num+" not a strong number");
		}
	}
}
