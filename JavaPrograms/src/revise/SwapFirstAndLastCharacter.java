package revise;

public class SwapFirstAndLastCharacter {

	public static void main(String[] args) {

		String s= "hanumana"; //op= aanumanh

		//		String s1= s.replace('r', 'a');
		//
		//		System.out.println(s1);

		char[] ch= s.toCharArray();

		char ch1=ch[0];
		char chl= ch[ch.length-1];

		for(int i=0; i<ch.length;i++)
		{
			if(i==0)
			{
				ch[i]=  chl;
			}
			else if(i==ch.length-1)
			{
				ch[ch.length-1]= ch1;
			}
		}
		for (char c : ch) {

			System.out.print(c);
		}
	}
}
