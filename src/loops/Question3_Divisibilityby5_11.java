package loops;

import java.util.Scanner;

public class Question3_Divisibilityby5_11 
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scn.nextInt();
		if (num%5==0 && num%11==0)
			System.out.println("Number is divisible by 5 and 11");
		else
			System.out.println("Number is not divisible by 5 and 11");              	
	}
}
