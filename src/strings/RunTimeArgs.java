package strings;

public class RunTimeArgs {

	public static void main(String[] args) {
		// System.out.println(args[0]+args[1]+args[3]);
		 int sum=0;
		 int i=0;
		 for(String str :args) {
			 sum +=Integer.parseInt(args[i]);
			 i++;
		 }
		 System.out.println(sum);
		 //int x = Integer.parseInt(args[0]);
		 

	}

}
