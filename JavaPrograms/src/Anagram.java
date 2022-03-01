import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String string1= "listen";
		String string2= "silent";

		char[] ch1 = string1.toCharArray();
		char[] ch2= string2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		boolean result= Arrays.equals(ch1, ch2);

		if(result==true)
		{
			System.out.println("Given strings are anagram");
		}
		else
		{
			System.out.println("Given strings are not anagram");
		}
	}
}
