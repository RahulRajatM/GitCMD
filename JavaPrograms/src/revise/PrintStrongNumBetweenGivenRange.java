package revise;

import java.util.Scanner;

public class PrintStrongNumBetweenGivenRange {

	public static void main(String[] args) {

		System.out.println("Enter lower range");
		Scanner sc= new Scanner(System.in);
		int ll= sc.nextInt();  //100
		System.out.println("enter higher limit");
		int hl= sc.nextInt();  //500

		while(ll<=hl)
		{
			int sum=0;
			//int temp=ll;
			for(int j=ll;j>0;j=j/10)
			{

				int fact=1;
				int ld= j%10;
				for(int k=ld;k>0;k--)
				{
					fact= fact*k;
				}
				sum=sum+fact;
			}
			
			if(ll==sum)
			{
				System.out.println(ll+" is strong number");
			}
			
			ll++;
		}
	}
}
