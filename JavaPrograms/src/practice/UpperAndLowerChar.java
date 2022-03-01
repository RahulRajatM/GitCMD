package practice;

public class UpperAndLowerChar {

	public static void main(String[] args) {

		String string= "Jai Shri RAMA";
		string= string.replace(" ", "");
		//char[] ch= string.toCharArray();
		int lowerCaseCount= 0;
		int upperCaseCount= 0;
		for (int i = 0; i < string.length(); i++) {
			if(Character.isUpperCase(string.charAt(i)))
			{
				upperCaseCount++;
			}
			else
			{
				lowerCaseCount++;
			}
		}
		System.out.println("UpperCase = "+upperCaseCount);
		System.out.println("lowerCase = "+lowerCaseCount);
	}
}
