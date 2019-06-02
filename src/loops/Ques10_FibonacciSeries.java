package loops;

import java.util.Scanner;

public class Ques10_FibonacciSeries 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter value of n for Fibonacci Series");
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		for(int i=0;i<=n;i++)
		{
			if(i>1)
			{
				System.out.print(2*i-3);
			}
			else
			System.out.print(i+" ");
		
		}
	}

}
