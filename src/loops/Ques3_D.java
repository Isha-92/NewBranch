package loops;

public class Ques3_D
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for (int sp=1;sp<=i-1;sp++)
				System.out.print(" ");
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
		System.out.println("");
		}
	}

}
