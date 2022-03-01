package revise;

import java.util.LinkedHashSet;

public class VowelsInString {

	public static void main(String[] args) {

		String s= "ARITOCRACY";
		s= s.toLowerCase();
		LinkedHashSet< Character> set= new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}

		String vowel= "";
		int count=0;
		for (Character ch : set) {

			if(ch=='a' || ch=='e' || ch== 'i' || ch== 'o' || ch== 'u')
			{
				vowel= vowel+ ch;
				count++;

			}

		}
		System.out.println("No. of vowels in "+s+" = "+count);
		System.out.println("Vowels are "+ "\'"+vowel+"\'");
	}
}
