package practice;

public class ReverseFirstAndLastWord {

	public static void main(String[] args) {

		String s= "welcome all to india";
		String[] str = s.split(" ");

		String temp= str[0];
		str[0]= str[str.length-1];
		str[str.length-1]= temp;

		//		for(int i=str.length-1; i>=0;i--)
		//		{
		//			System.out.print(str[i]+ " ");
		//		}

		for(int i=0; i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
	}
}
