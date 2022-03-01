package org.rrm;

import java.util.Scanner;

public class LadderIfElse {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		if(num%5==0&& num%3==0)
		{
			System.out.println(num+" is divisible by 5 and 3");	
		}
		else if(num%5==0)
		{
			System.out.println(num+" is divisible by 5");
		}
		else if (num%3==0)
		{
			System.out.println(num+" is divisible by 3");
		}
		else
			System.out.println(num+" is not divisible by 5 and 3");
	}
}
