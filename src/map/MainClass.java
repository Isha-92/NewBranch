package map;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
//Is faster than hashtable as it is non-synchronised.
	public static void main(String[] args) {
		Trainer tr=new Trainer("ABC");
		Tech tc=new Tech("Java");
		HashMap hm = new HashMap();
		hm.put(null,tc);
		//hm.put("hj",9);
		System.out.println(hm);
		/*
		 * for(Map.Entry<Trainer, Tech> em : hm.entrySet()){ Trainer trObj=em.getKey();
		 * Tech tchObj=em.getValue();
		 * System.out.println(trObj.trainer_name+"-"+tchObj.tech_name);
		 * trObj.displaytrainer(); System.out.println(trObj.getClass()); }
		 */
		
	}

}
