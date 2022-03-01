package basic.java;

public class MaxElementInNumber {

	public static void main(String[] args) {

		int num= 789;
		int max=0;
		for(int i=num; i!=0; i=i/10)
		{
			int d= i%10;
			if(max<d)
			{
				max=d;
			}
		}
		System.out.println(max);
	}
}
