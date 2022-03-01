package practice;

public class ReverseSentenceAndItsCharacter {

	public static void main(String[] args) {

		String s= "Welcome to india";


		String[] str = s.split(" ");
		//reverse words
		for(int i=str.length-1;i>=0;i--)
		{
			String word=str[i];
			for (int j=word.length()-1;j>=0;j--)
			{
				System.out.print(word.charAt(j));
			}
			System.out.print(" ");
		}

	}
}
