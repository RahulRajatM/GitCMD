package practice;

public class SegregateCharAndNum {

	public static void main(String[] args) {

		String s= "2GH5@7%M*";
		String alph="";
		String num="";
		String spcl="";
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);

			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			{
				alph=alph+ch;
			}
			else if(ch>='0' && ch<='9')
			{
				num= num+ch;
			}
			else
			{
				spcl=spcl+ ch;
			}
		}
		System.out.println(alph);
		System.out.println(num);
		System.out.println(spcl);
	}
}
