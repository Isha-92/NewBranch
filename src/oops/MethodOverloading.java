package oops;

public class MethodOverloading extends practice
{

	public void m1()
	{
		super.m1();
		System.out.println("m1");
	}
	public void m1(int a)
	{
		System.out.println("m2 "+a);
	}
	public static void main(String[] args) 
	{
		MethodOverloading mo=new MethodOverloading();
		mo.m1();
		mo.m1(10);
		
		int num=6601,sum=0,q=0;
		while(num/10!=0)
		{
			q=num/10;//68//6
			int w=num%10;//9//8
			num=q;//68
			sum+=w;//9
		}
		System.out.println("Sum of digits is "+(sum+num));
	}

}
