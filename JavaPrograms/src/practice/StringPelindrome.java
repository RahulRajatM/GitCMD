package practice;

public class StringPelindrome {

	public static void main(String[] args) {

		String string= "ACATTCA";
		String revString="";

		for(int i=string.length()-1;i>=0;i--)
		{
			revString=revString+string.charAt(i);
		}
		//System.out.println(revString);
		if(string.equals(revString))
		{
			System.out.println("String is pelindrome");
		}
		else
		{
			System.out.println("String is not pelindrome");

		}

	}
}
