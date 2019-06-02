package loops;

public class Practice_mainclass {

	/*
	 * public static void main(String[] args) { Practice obj = new Practice();
	 * Practice.m2(obj); }
	 */
	public static void main(String[] args)
	{
	int num=381261,sum=0,q=0;
	while(num/10!=0)
	{
		q=num/10;//68//6
		int w=num%10;//9//8
		num=q;//68
		sum+=w;//9
	}
	System.out.println("Sum of digits is "+(sum+num));
	

}
}