package loops;

public class Ques14_1121231234123451234123121
{

	public static void main(String[] args) 
	{
		int n=9;
		for(int i=1,l=0;i<=n;i++)
		{
			if(i>(n+1)/2)
				l--;
			else
				l=i;
			for(int j=1;j<=l;j++)
			{
			     	System.out.print(j);
			}
		System.out.println("");
		}
	}

}
