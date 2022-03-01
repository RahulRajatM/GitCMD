package revise;

import java.util.Arrays;

public class ReverseFirstAndLastWordInString {

	public static void main(String[] args) {

		String s= "welcome to india";

		//StringBuffer sb= new StringBuffer(s);
		String[] sArr= s.split(" ");

		String temp= sArr[0];
		sArr[0]= sArr[sArr.length-1];
		sArr[sArr.length-1]= temp;
		//System.out.println(Arrays.toString(sArr));
		for (String string : sArr) {
			System.out.print(string+" ");
		}

	}
}
