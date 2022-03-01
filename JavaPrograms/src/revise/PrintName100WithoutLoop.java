package revise;

public class PrintName100WithoutLoop {

	public static void main(String[] args) {

		String str= "Rahul";

		String s= "i";

		s= s.replaceAll("i", "iiiiiiiiii");
		s= s.replaceAll("i", "iiiiiiiiii");
		s= s.replaceAll("i", str+ "\n");

		System.out.println(s);
	}
}
