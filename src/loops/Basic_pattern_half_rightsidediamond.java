package loops;

public class Basic_pattern_half_rightsidediamond
{

	public static void main(String[] args) 
	{
		int n=6;
		for(int i=1,l=1;i<=n;i++)
		{
			if(i<=(n+1)/2)
				l=i;
			else
				l=(n-i)+1;
				//l--;//not applicable in case of even rows
			for(int j=1;j<=l;j++)
			{
			System.out.print("*");
			}
			System.out.println(" ");			
		}

	
	}

}
