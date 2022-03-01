package revise;

public class SegregateNumAndSum {

	public static void main(String[] args) {

		String s= "q10p20r30";
		int Tsum= 0;
		int sum= 0;
		for(int i=0;i<s.length();i++)
		{
			char ch= s.charAt(i);
			if(ch>='0' && ch<='9')
			{ 
				int num = ch-48;
				sum= sum*10 + num;
			}
			else
			{
				Tsum= Tsum + sum;
				sum=0;
			}
		}
		System.out.println(Tsum+sum);
	}
}
