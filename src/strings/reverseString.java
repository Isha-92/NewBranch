package strings;

import java.util.Arrays;
import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		String []arr =str.split(" ");
		
		/*
		 * char[] arr0 = arr[0].toCharArray(); char[] arr1 = arr[1].toCharArray();
		 * 
		 * System.out.println("Reverse is ");
		 * 
		 * for(int i=(arr0.length)-1;i>=0;i--) System.out.print(arr0[i]);
		 * System.out.print(" "); for(int i=(arr1.length)-1;i>=0;i--)
		 * System.out.print(arr1[i]);
		 */
//[hello, java]
		for (String s : arr)
		{
			//arr[0]=hello
			//arr[1]=java;
			//System.out.println(s[i]);//hello
			int len = s.length();//5
			for(int j=len-1;j>=0;j--) {
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}
			
		}

}
