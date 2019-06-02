package loops;

public class Ques12_Diamond 
{

	public static void main(String[] args) 
	{
		int n=9;
		for(int i=1,l=0,k=0;i<=n;i++)
		{
			if(i>(n+1)/2)
			{
				l--;
				k++;
			}
			else
			{
				l=i;
				k=((n+1)/2)-i;
			}
			for (int sp=1;sp<=k;sp++)
				System.out.print(" ");
			for(int str=1;str<=2*l-1;str++)
				System.out.print("*");
			System.out.println(" ");
		}
	}

}
