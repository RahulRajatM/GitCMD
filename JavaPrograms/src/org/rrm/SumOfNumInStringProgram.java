package org.rrm;

public class SumOfNumInStringProgram {

	public static void main(String[] args) {

		String s= "12ab10c3";  // output=12+10+3=25
		int len = s.length(); // len=8
		int totalSum = 0;
		int i,j;
		for( i=0;i<len;i++)
		{
			int rev=0;
			for( j=i; j<len;j++)
			{
				char ch = s.charAt(j);

				if(ch>=48 && ch<=57) //Ascii value of 0= 48 and Ascii value of 9= 57 
				{
					int num= ch-48;
					rev= rev*10 + num;
				}
				else
				{
					break;
				}
			}
			//System.out.println(rev);
			totalSum=totalSum + rev ;
			i=j;
		}
		System.out.println(totalSum);
	}
}
