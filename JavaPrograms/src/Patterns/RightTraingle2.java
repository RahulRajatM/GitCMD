package Patterns;

public class RightTraingle2 {

	public static void main(String[] args) {

		//op: ****
		//    ***
		//    **
		//    *
		for(int i=0; i<4; i++)
		{

			for(int j=3; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
