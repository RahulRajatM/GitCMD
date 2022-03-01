import java.util.LinkedHashSet;

public class OccuranceOfChar {

	public static void main(String[] args) {

		String s= "jai shree rama";

		LinkedHashSet<Character> set= new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}

		for (Character character : set) {

			int count=0;

			for(int i=0; i<s.length();i++)
			{
				if(character==s.charAt(i))
				{
					count++;
				}
			}

			if(count>1)
			{
				System.out.println(character+" is duplicate"+" , present "+count+" times");
			}
		}
	}
}
