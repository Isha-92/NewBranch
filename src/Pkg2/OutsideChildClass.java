package Pkg2;

import Pkg1.Class1;

public class OutsideChildClass extends Class1
{

	public static void main(String[] args) 
	{
		OutsideChildClass c=new OutsideChildClass();
//		System.out.println(c.a);//private
		System.out.println(c.b);//protected
//		System.out.println(c.c);//default
		System.out.println(c.d);//public
	}

}
