package loops;

import java.util.Scanner;

public class Ques5_ReverseOfNum
{

	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int q=n,r;
		String s = "";
		while(q/10!=0)
		{
			q=n/10;//12
			r=n%10;//5
			System.out.println("R is "+r);
			s+=r;
			n=q;
		}
		System.out.println("Q is "+q);
		System.out.println("Reverse of the number is "+s+q);
	}

}
