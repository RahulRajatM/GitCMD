package revise;

public class MaxNumInArray {

	public static void main(String[] args) {

		int[] num= {100,20,600,300};

		int min= num[0];

		for (int i = 0; i < num.length; i++) {

			if(min>num[i])
			{
				min= num[i];
			}
		}
		System.out.println(min);
	}
}
