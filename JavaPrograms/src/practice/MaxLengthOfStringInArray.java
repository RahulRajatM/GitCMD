package practice;

public class MaxLengthOfStringInArray {

	public static void main(String[] args) {

		String[] str= {"a", "ab", "abc","abcd","pqrs", "Rahul"};

		String maxLen= str[0];
		for(int i=1;i<str.length;i++)
		{
			if(maxLen.length()< str[i].length())
			{
				maxLen= str[i];
			}
		}

		for(int i=0;i<str.length;i++)
		{
			if(maxLen.length()== str[i].length())
			{
				System.out.println(str[i]);
			}
		}
		//sort on basis of length of string
		//		for(int i=0;i<str.length;i++)
		//		{
		//			for(int j=i+1;j<str.length;j++)
		//			{
		//				if(str[i].length()>str[j].length())
		//				{
		//					String temp=str[i];
		//					str[i]=str[j];
		//					str[j]=temp;
		//				}
		//			}
		//		}
		//		System.out.println(str[str.length-1]);
	}
}
