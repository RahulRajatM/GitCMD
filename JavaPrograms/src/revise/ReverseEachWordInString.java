package revise;

public class ReverseEachWordInString {

	public static void main(String[] args) {

		String s= "jai shree rama";
		//op= iaj eerhs amar
		String[] sArr = s.split(" ");
		for(int i=0;  i< sArr.length; i++)
		{
			String word= sArr[i];
			for(int j=word.length()-1;j>=0;j--)
			{
				System.out.print(word.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
