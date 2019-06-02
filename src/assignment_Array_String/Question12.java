package assignment_Array_String;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.next();
		CountVowelsConsonants cvc = new CountVowelsConsonants();
		cvc.m1(str);
	}

}
