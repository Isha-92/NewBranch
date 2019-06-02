package loops;

public class Ques13_ABBCCCDDDD
{

	public static void main(String[] args) 
	{
		char ch='A';
		for(int i=1;i<=5;i++,ch++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
			}
		System.out.println("");
		}
	}

}
