package practice;

public class ReverseString_MultipleWays {

	public static void main(String[] args) {
		String s= "Jai Hanumana";
		char[] ch=  s.toCharArray();

		//Approach-1- without using length() method
		for(int i=ch.length-1; i>=0 ;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println();

		//approach-2-without using length() method and length variable 
		int count=0;
		for(Character c: ch)
		{
			count++;
		}
		for(int i=count-1; i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		//approach-3-by using length() and charAt()
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		//Approach-4-By using third variable
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse= reverse+ s.charAt(i);
		}
		System.out.println(reverse);

		//Approach-5- bY using compareTo()

		String name="";
		int length = s.compareTo(name);
		System.out.println(length);
		for(int i=length-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}


	}
}
