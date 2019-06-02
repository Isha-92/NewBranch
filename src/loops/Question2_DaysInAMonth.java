package loops;

import java.util.Scanner;

public class Question2_DaysInAMonth 
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a month");
		String month1 = scn.nextLine();
		String month=month1.toLowerCase();
		if (month.equals("january")||month.equals("march")||month.equals("may")||month.equals("july")||month.equals("august")||month.equals("october")||month.equals("december"))
		{
			System.out.println("Month has 31 days");
		}
		else if (month.equals("april")||month.equals("june")||month.equals("september")||month.equals("november"))
		{
			System.out.println("Month has 30 days");
		}	
		else if (month.equals("february"))
		{
			System.out.println("Month has 28/29 days");
		}
		else
		{
			System.out.println("Enter a valid Month");
		}
	}

}
