package org.rrm;

public class NestedIfElse {

	public static void main(String[] args) {
		int pwd= 1234;
		long acNo= 33457891245l;
		int amount= 10000;
		int otp= 334567;
		if(pwd==1234)
		{
			System.out.println("welcome to phonepe");
			if(acNo==33457891245l)
			{
				System.out.println("Bank selected");

				if(amount<=10000)
				{

					System.out.println("amount entered");
					if(otp==334567)
					{
						System.out.println("transaction successful");
					}
				}
			}
		}
	}
}
