package loops;

public class Ques3_F
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			int l=0;
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+l+" ");
				l+=4;
			}
		System.out.println("");
		}
	}

}
