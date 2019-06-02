package oops;

public  class practice2 {
	static class A
	{
		public static void m1()
	    {
	        System.out.println(1);
	    }
		
		public   void m2()
	    {
	        System.out.println(1);
	    }
	}
	 
	class B extends A
	{
	    {
	        System.out.println(2);
	    }
	}
	 
	class C extends B
	{
	    {
	        System.out.println(3);
	    }
	}
	 
	
	    public static void main(String[] args)
	    {
	    	practice2 c = new practice2();
	    	practice2.A.m1();
	    	
	    }
	}
	 



