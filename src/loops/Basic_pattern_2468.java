package loops;

public class Basic_pattern_2468
{

	public static void main(String[] args) 
	{
		int n=5,num=0;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
				{
				System.out.print((num+=2)+" ");
				}
			System.out.println(" ");			
		}

	}
	
}
