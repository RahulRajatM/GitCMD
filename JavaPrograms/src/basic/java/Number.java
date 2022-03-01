package basic.java;

public class Number {

	public static void main(String[] a)
	{
		String[] s={"vijay","vivek","jawahar"};

		for(int i=0; i<s.length; i++)
		{
			int count=0;
			String word= s[i];
			for(int j=0;j<word.length();j++)
			{
				char ch= word.charAt(i);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					count++;
				}
			}
			System.out.println(word+" "+count);
		}
	}
}
