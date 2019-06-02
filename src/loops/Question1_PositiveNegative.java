package loops;

import java.util.Scanner;

public class Question1_PositiveNegative 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		if (num<0)
		{
			System.out.println("Number is Negative");
		}
		else if (num>0)
		{
			System.out.println("Number is Positive");
		}	
		else if(num==0)
		{
			System.out.println("Number is Zero");
		}
		else
		{
			System.out.println("Enter a valid number");
		}	
	}

}
