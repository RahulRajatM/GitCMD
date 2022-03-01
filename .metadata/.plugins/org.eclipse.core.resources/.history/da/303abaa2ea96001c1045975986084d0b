
public class AnagramString {

	public static void main(String[] args) {

		String s1= "Listen";
		String s2= "Silent";
		s1= s1.toLowerCase();
		s2= s2.toLowerCase();

		char[] ch1 = s1.toCharArray();
		char[] ch2= s2.toCharArray();

		int count=0;

		for(int i=0; i<ch1.length; i++)
		{

			for(int j=0; j<ch2.length; j++)
			{

				if(ch1[i]==ch2[j])
				{
					count++;
				}
			}
		}
		if(count==ch1.length)
		{
			System.out.println("Given Strings are anagram");	
		}
		else
		{
			System.out.println("Given strings are not anagram");
		}
	}
}
