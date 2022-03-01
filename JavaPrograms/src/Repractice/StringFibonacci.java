package Repractice;

public class StringFibonacci {
	public static void main(String[] args) {
		String[] str= {"a", "try", "india", "aabb"};
		int a=0;
		int b=1;
		for(int i=0; i<str.length; i++)
		{
			int n= str[i].length();
			boolean flag= false;
			for (int j = 0; j <=n; j++) {

				int c= a+b;
				if(c==n)
				{
					System.out.println("yes"+" "+str[i]); 
					flag= true;
					break;
				}
				else
				{
					a=b;
					b=c;
				}	 
			}
			if(flag==false)
			{
				System.out.println("No"+" "+str[i]);
			}
		}
	}
}
