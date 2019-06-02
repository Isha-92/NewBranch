package oops;

public class TestThisKeyword2 
{int a;
		
	    public int getA()
	    {
	    	return a;
	    }
	    
	    public void setA(int a) {
	    		        this.a = a;
	    	}
	    TestThisKeyword2 show(){
	    	    return this;
	    	}

	 
	public static void main(String[] args) 
	{
		TestThisKeyword2 obj = new TestThisKeyword2();
		 obj.setA(10);
		 System.out.println(obj.getA());
		 TestThisKeyword2 obj2= obj.show();
		 System.out.println(obj2.getA());
		 obj2.setA(20);
		 System.out.println(obj2.getA());
		 System.out.println(obj.getA());

	}


	
}
