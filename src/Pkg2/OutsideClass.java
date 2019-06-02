package Pkg2;

import Pkg1.Class1;

public class OutsideClass 
{

	public static void main(String[] args) 
	{
		Class1 c=new Class1();
//		System.out.println(c.a);//private
//		System.out.println(c.b);
//		System.out.println(c.c);
		System.out.println(c.d);
	}

}
