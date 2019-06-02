package loops;

import java.util.Scanner;

public class Ques9_DoWhile
{

	public static void main(String[] args) 
	{
		String s;
		do
		{
			System.out.println("Enter 2 numbers");
			Scanner scn= new Scanner(System.in);
			int a=scn.nextInt();
			int b=scn.nextInt();
			System.out.println("Sum is "+(a+b));
			System.out.println("Type yes, if you wish to continue");
			 s=scn.next();
		} while(s.equals("yes"));
		System.out.println("Thank You :) ");
	}

}
