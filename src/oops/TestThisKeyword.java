package oops;

public class TestThisKeyword 
{
		int a,b;
	    TestThisKeyword(int a, int b)
	    {
		   // this();

	     this.a=a;
	    this.b=b;
	   
	    }
	    TestThisKeyword()
	    {
		   

	     this.a=a;
	    this.b=b;
	   
	    }
	    
	    void show()
	    {
	    	System.out.println("Show() method called");
	    	
	    }
	    void print()
	    {
	    	this.show();
	    	System.out.println(a);
	    	System.out.println(b);
	    }
	public static void main(String[] args) 
	{
		TestThisKeyword obj = new TestThisKeyword(10,20);
	     obj.print();
	}


	
}
