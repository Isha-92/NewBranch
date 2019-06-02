package loops;

public class ConstChaining 
{
		/*Const chaining - call one const within another const.
		 * To call the const. within const. use this()
		 * this() statement should be first statement in const.
		 * we can't use this() twice in const.
		 */
		
		public ConstChaining(int x,String y)
		{	
			this(10);//sum
			System.out.println("two parameter");
		}

		public ConstChaining(int x)
		{
			 this();
			System.out.println("one parameter");
		}
		public ConstChaining()
		{
			System.out.println("default");
		}
		
		public static void main(String []args)
		{
			ConstChaining cc = new ConstChaining(10);
		}
	}

