package loops;

import java.util.Scanner;

public class Ques3_SumAndAvg4
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		float sum=0;
		for(int i=1;i<=5;i++)
			{
				System.out.println("Enter "+i+"th number ");
				float a=scn.nextInt();
				sum+=a;
			}
		System.out.println("Sum is "+sum);
		float avg=sum/5;
		System.out.println("Average is "+(sum/5));
	}

}
