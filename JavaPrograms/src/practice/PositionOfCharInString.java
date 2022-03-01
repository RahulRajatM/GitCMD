package practice;

public class PositionOfCharInString {

	public static void main(String[] args) {

		String s= "Tester";
		String s1 = s.toLowerCase();
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			for(int j=0;j<s.length();j++)
				
			System.out.println(ch+" ===> "+s1.lastIndexOf(ch));

		}
	}
}
