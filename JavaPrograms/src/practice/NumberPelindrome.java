package practice;

public class NumberPelindrome {

	public static void main(String[] args) {

		int num= 12321;
		int temp= num;
		int revNum=0;
		while(num>0)
		{
			int lastdigit= num%10;
			revNum= revNum*10 + lastdigit;
			num=num/10;			
		}
		if(temp==revNum)
		{
			System.out.println(temp+" is pelindrome");
		}
		else
		{
			System.out.println(temp+" is not pelindrome");
		}
	}
}
