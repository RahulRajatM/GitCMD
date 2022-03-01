package basic.java;

public class C extends P {

	public void m1()
	{
		System.out.println("child class method");
	}
	public static void main(String[] args) {

		P p= new C();
		p.m1();

		P p1= new P();
		p1.m1();
	}
}
