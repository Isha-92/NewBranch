package loops;

import java.util.Scanner;

public class Ques4_Factorial
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= scn.nextInt();
		int i,m=1;
		for(i=0;i<n-1;i++)
		{
			m =m*(n-i);
		}
		System.out.println("Factorial of "+n+" is "+m);
	}

}
