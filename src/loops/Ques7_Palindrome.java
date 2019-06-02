package loops;

import java.util.Scanner;

public class Ques7_Palindrome
{

	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int y=n;
		int q=n,r;
		String s = "";
		
		while(q/10!=0)
		{
			r=n%10;//1
			n=n/10;//
		
			//System.out.println("R is "+r);
			s+=r;
			//n=q;
		}
		//System.out.println("Q is "+q);
		String m =s+q;
		//int d=Integer.parseInt(m);
		String d1=Integer.toString(y);
		System.out.println("d1 "+d1);
		System.out.println("n "+m);
		System.out.println("Reverse of the number is "+d1);
		if(d1.equals(m))
			System.out.println("The number is a palindrome");
		else
			System.out.println("The number is NOT a palindrome");

	}

}
