package revise;

public class MaxLengthString {

	public static void main(String[] args) {

		String[] s= {"ab", "abc", "bcd","pqrs","cdef" };

		String maxLen= s[0];

		for(int i=0;i<s.length;i++)
		{
			if(maxLen.length()<s[i].length())
			{
				maxLen= s[i];
			}
		}

		for(int i=0;i<s.length;i++)
		{
			if(maxLen.length()==s[i].length())
			{
				System.out.println(s[i]);
			}
		}
	}
}
