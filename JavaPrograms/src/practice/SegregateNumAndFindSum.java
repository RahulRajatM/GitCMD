package practice;

public class SegregateNumAndFindSum {

	public static void main(String[] args) {

		String s= "23jk09kl34p2"; //23+09+34=66
		int len = s.length();
		int sum=0;
		int i,j;

		for( i=0;i<len;i++)
		{
			int rev=0;
			for( j=i;j<len;j++)
			{
				char ch = s.charAt(j);
				if(ch>='0' && ch<='9')
				{
					int num=ch-48;
					rev=rev*10+num;	
				}
				else
				{
					break;
				}
			}
			sum=sum+rev;
			i=j;
		}
		System.out.println(sum);

	}
}
