package Repractice;

public class PelindromeInArray {

	public static void main(String[] args) {

		int[] a={44,78,92,65,11,33};

		for(int num: a)
		{
			int temp=num;
			int rev=0;
			for(int i=num; i!=0;i=i/10)
			{
				int d= num%10;
				rev=rev*10+d;
			}
			if(temp==rev)
			{
				System.out.println(num+" is pelindrome");
			}
		}
	}
}
