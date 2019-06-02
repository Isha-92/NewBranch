package loops;

public class Basic_pattern_126371048
{

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int num=0;
			for(int j=1;j<=i;j++,num++)
				{
				System.out.print(i+num+" ");
				num+=4;
				}
			System.out.println(" ");			
		}

	
	}

}
