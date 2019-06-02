package loops;

import java.util.Scanner;

public class Question5_CountNoOfNotes
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount = scn.nextInt();
		int fivehund=amount/500;
		int hund=amount/100;
		int fifty=amount/50;
		int twenty=amount/20;
		int ten=amount/10;
		System.out.println("There are '" +fivehund+"' 500 notes ");
		System.out.println("There are '" +hund+"' 100 notes ");
		System.out.println("There are '" +fifty+"' 50 notes ");
		System.out.println("There are '" +twenty+"' 20 notes ");
		System.out.println("There are '" +ten+"' 10 notes ");



	}

}
