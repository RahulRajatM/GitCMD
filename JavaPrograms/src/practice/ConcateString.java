package practice;

public class ConcateString {

	public static void main(String[] args) {

		String s= "abc" + "xyz"; //s= abcxyz - at compile time only

		/*	for(int i=0;i<s.length()/2;i++)
		{
			System.out.print(s.charAt(i) +""+ s.charAt(s.length()/2+i));	
		} */

		for(int i=0;i<s.length()/2;i++)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();

		for(int i=s.length()/2;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
		}





	}
}
