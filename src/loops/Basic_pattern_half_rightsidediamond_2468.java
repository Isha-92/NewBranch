package loops;

public class Basic_pattern_half_rightsidediamond_2468
{

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1,l=1,num=2;i<=n;i++)
		{
			if(i<=(n+1)/2)
				l=i;
			else
				l=(n-i)+1;
				//l--;//not applicable in case of even rows
			for(int j=1;j<=l;j++,num+=2)
			{
			System.out.print(num+" ");
			}
			System.out.println(" ");			
		}

	
	}

}
