package practice;

public class ReverseFirstAndLastWordOfSentence {

	public static void main(String[] args) {

		String s= "Welcome to my home";
		//StringBuffer sb= new StringBuffer(s);

		String[] words = s.split(" ");
		int len = words.length;

		//Swapping first and last word
		String temp = words[0];
		words[0]= words[len-1];
		words[len-1]= temp;

		/*for(int i=0;i<len;i++)
		{
			System.out.print(words[i]+" ");
		}*/

		for ( String string : words) {
			System.out.print(string+" ");
		}
	}
}
