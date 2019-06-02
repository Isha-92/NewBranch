package inheritance;

public class ChildClass extends ParentClass
{
	private int a=100;
	protected int b=200;
	int c=300;
	public int d=400;
	
	public static void main(String[] args)
	{
		ChildClass cc=new ChildClass();
		System.out.println(cc.a);
		System.out.println(cc.b);
		System.out.println(cc.c);
		System.out.println(cc.d);
	}
}
