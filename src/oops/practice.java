package oops;

public class practice 
{
	int a;//instance variable
	public void m1()
	{
		practice pc=new practice();
		int r=this.a;
		System.out.println("parent");
	}
	public void m2()
	{
		
	}
	public practice()
	{
		this(10,20);
	}
	public practice(int a, int b)
	{
		//this();
	}
	public static void main(String[] args)
	{
		practice obj =new practice();
	
	    
	
	}

}
