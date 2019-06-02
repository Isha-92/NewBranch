package strings;

import java.util.Scanner;

public class Ques15_Palindrome {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner scn=new Scanner (System.in);
		String str=scn.next();
		palindrome(str);
	}

	public static boolean palindrome(String str) 
	{
		char[]arr=str.toCharArray();//[1,2,2,1]
		for(int i=0;i<arr.length;i++)
		{
			if(arr[0]==arr[arr.length-1])
				return true;
		}
		return false;
	}

}
