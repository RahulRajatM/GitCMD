package basic.java;

public class Super_this_keywords {

	String s= "parent";
	public static void main(String[] args) {

		Child c= new Child();
		c.m1();
	}
}

class Child extends Super_this_keywords
{
	String s= "child";

	void m1()
	{
		System.out.println(s);	//child
		System.out.println(this.s); //child
		System.out.println(super.s); //parent
	}
}
