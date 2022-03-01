package Repractice;

public class StringFibbonacci {

	public static void main(String[] args) {

		String[] s= {"a", "aa", "abc", "india", "Gita", "Krishna"};

		int a=0; int b=1;

		for (int i = 0; i < s.length; i++) {
			int n= s[i].length();

			for (int j = 0; j <=n; j++) {

				int c= a + b;
				if(c==n)
				{
					System.out.println(s[i]+" "+" is fibo");
					break;
				}
				else
				{
					a=b;
					b=c;
				}
				if(j==n)
				{
					System.out.println(s[i]+" "+" is not fibo");
				}

			}

		}
	}
}
