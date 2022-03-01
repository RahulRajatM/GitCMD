package revise;

public class FibonacciSeries {

	public static void main(String[] args) {

		int a= 1;
		int b= 2;
		int c= a+b;
		System.out.print(a+" ");
		System.out.print(b+" ");
		//int limit= 500;
		while(c<=500)
		{
			System.out.print(c+" ");
			a=b;
			b=c;
			c=a+b;
		}
	}
}
