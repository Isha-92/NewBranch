package oops;

public class B extends A
{
    int i = 20;
    void m() {
    System.out.println("Child method");}
     static void m1()
    {
        System.out.println("Static Child method");}
    public static void main(String[]args)
	{

	      A a = new B();
	 
	      System.out.println(a.i);
	      a.m();
	      a.m2();
	      a.m1();
	}
}
