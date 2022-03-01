package revise;

public class SegregationOfString {

	public static void main(String[] args) {

		String s= "23@Dr7*7t2";

		String num=" ";
		String alpha=" ";
		String spclch=" ";

		for (int i = 0; i < s.length(); i++) {

			char ch =  s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				int n= ch-48;
				num= num+n;
			}
			else if(ch>=65 && ch<=90 || ch>=97 && ch<=122)
			{
				alpha= alpha+ ch;	
			}
			else
			{
				spclch= spclch+ch;
			}
		}
		System.out.println(num);
		System.out.println(alpha);
		System.out.println(spclch);
	}
}
