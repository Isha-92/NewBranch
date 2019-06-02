package loops;

public class Ques3_E
{

	public static void main(String[] args) 
	{
		int n=5,num=0,l=0;
		for(int i=1;i<=n;i++)
		{
			if(i>(n+1)/2)
				l--;
			else
				l=i;				
			for(int j=1;j<=l;j++)
			{
				System.out.print((num+=2)+"  ");
			}
		System.out.println("");
		}
	}

}
