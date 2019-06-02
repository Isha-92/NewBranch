package strings;

import java.util.Arrays;
import java.util.Scanner;

public class splitString {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		char[] arr=str.toCharArray();
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Reverse is ");

		for(int i=(arr.length)-1;i>=0;i--)
		System.out.print(arr[i]);
			
	}

}
