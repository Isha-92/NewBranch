package loops;

public class Ques3_A
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int sp=1;sp<=(5-i);sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++)
			{
				int l=j;
				if(j>i)
					{
					System.out.print(l-2);
					}
				else
				System.out.print(j);
			}
		System.out.println("");
		}
	}

}
