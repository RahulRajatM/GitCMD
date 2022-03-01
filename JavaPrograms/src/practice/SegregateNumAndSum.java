package practice;

public class SegregateNumAndSum {

	public static void main(String[] args) {

		String s= "a12b13c40";
		int sum=0;
		int Tsum=0;

		for(int i=0;i<s.length();i++)
		{
			char ch= s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				int n= ch-48;
				sum=sum*10 + n;
			}
			else
			{
				Tsum= Tsum+sum;
				sum=0;
			}
		}
		System.out.println(Tsum+sum);
	}
}
