package loops;

public class Practice {

	public Practice m1()
	{
		System.out.println("ns");
		return this;
	}
	
	public static void m2(Practice ob)
	
	{
		System.out.println("static ");
		ob.m1();
	}
	
public static void m3(Practice ob)
	
	{
		System.out.println("static ");
		ob.m1();
	}
	

}
