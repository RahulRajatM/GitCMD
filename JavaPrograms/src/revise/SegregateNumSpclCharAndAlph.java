package revise;

public class SegregateNumSpclCharAndAlph {

	public static void main(String[] args) {

		String s= "@We10&They5%i100";
		String alph="";
		String num="";
		String spcl="";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' )
			{
				alph= alph + ch;
			}
			else if(ch>='0' && ch<='9')
			{
				num= num + ch;
			}
			else
			{
				spcl= spcl + ch;
			}
		}
		System.out.println(alph);
		System.out.println(num);
		System.out.println(spcl);

	}
}
