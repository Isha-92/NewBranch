package loops;

public class Basic_pattern_withspaces_or_halfupperdiamond
{

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int sp=1;sp<=(n-i);sp++)
				{
				System.out.print("-");
				}
			for(int str=1;str<=i;str++)
			{
			System.out.print("*");//System.out.print("* ");use a space after star for half diamond
			}
			System.out.println(" ");			
		}

	
	}

}
