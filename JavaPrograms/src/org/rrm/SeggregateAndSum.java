package org.rrm;

public class SeggregateAndSum {


	public static void main(String[] args) {

		String s= "a1b2c3";			
		int  num= 0;
		int sum=0;
		//char[] ch=s.toCharArray();

		/*for(int i=0;i<s.length();i++)
		{
			char ch= s.charAt(i);

			if(ch>='0' && ch<='9')  //ascii value of '0' = 48 & '9' = 57
			{
				num= ch-48;
				sum=sum+num;

			}

		}
		System.out.println(sum); */

		//Approach-2


		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);	

			if(ch>='0' && ch<='9')  //ascii value of '0' = 48 & '9' = 57
			{
				String str="" + ch;

				int n = Integer.parseInt(str);

				sum=sum+n;

			}
		}
		System.out.println(sum);


	}

}


