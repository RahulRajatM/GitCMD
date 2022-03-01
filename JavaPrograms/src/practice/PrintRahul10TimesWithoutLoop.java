package practice;

public class PrintRahul10TimesWithoutLoop {

	public static void main(String[] args) {

		String s= "i";
		s= s.replaceAll("i", "iiiiiiiiii");
		s= s.replaceAll("i", "Rahul"+ "\n");
		System.out.println(s);
	}
}
