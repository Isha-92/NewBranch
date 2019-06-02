package loops;

import java.util.Scanner;

public class Ques2_FirstN_NumbersandSum
{

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = scn.nextInt();
		int sum=0,i;
		for(i=1;i<=n;i++)
			{
				System.out.println(i+"  ");
				sum+=i;
			}
		System.out.println("Sum of " +n+ " Natural Numbers is "+sum);
	}

}
