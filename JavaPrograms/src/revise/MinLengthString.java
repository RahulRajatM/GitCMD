package revise;

public class MinLengthString {

	public static void main(String[] args) {

		String[] s= {"ab", "cde", "a","z", "cde"};

		String minLen= s[0];

		for(int i=0; i<s.length;i++)
		{
			if(minLen.length()>s[i].length())
			{
				minLen= s[i];
			}
		}

		for (String string : s) {

			if(string.length()==minLen.length())
			{
				System.out.println(string);
			}
		}

	}
}
