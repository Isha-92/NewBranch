package loops;

import java.util.Scanner;

public class Question6_leapYear
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = scn.nextInt();
		if (year%4==0)
		{
			if (year%100==0)
			{
				if (year%400==0)
					System.out.println("Leap Year");
				else
					System.out.println("Not a Leap Year");
			}
			else
				System.out.println("Leap Year");
		}
		else
			System.out.println("Not a Leap Year");
	
		
		//Days of Month
		System.out.println("Enter the month");
		String month1=scn.next();
		String month=month1.toLowerCase();
		switch(month)
		{
		case "january":
			System.out.println("Month has 31 Days");
			break;
		case "february":
			System.out.println("Month has 28/29 Days");
			break;
		case "march":
			System.out.println("Month has 31 Days");
			break;
		case "april":
			System.out.println("Month has 30 Days");
			break;
		case "may":
			System.out.println("Month has 31 Days");
			break;
		case "june":
			System.out.println("Month has 30 Days");
			break;
		case "july":
			System.out.println("Month has 31 Days");
			break;
		case "august":
			System.out.println("Month has 31 Days");
			break;
		case "september":
			System.out.println("Month has 30 Days");
			break;
		case "october":
			System.out.println("Month has 31 Days");
			break;
		case "november":
			System.out.println("Month has 30 Days");
			break;
		case "december":
			System.out.println("Month has 31 Days");
			break;
		default:
			System.out.println("Enter a valid Month");
		}
	}
}
