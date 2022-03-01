package practice;

public class OccuranceOfChar {

	public static void main(String[] args) {

		String s= "Tester";
		s= s.toLowerCase();
		StringBuffer sb= new StringBuffer(s);
		for(int i=0;i<sb.length(); i++)
		{
			int count=1;

			for(int j=i+1; j<sb.length(); j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
				{
					count++;
					sb.deleteCharAt(j);
				}

			}
			System.out.println(sb.charAt(i)+ " is present " +count+" times");
		}

	}
}
