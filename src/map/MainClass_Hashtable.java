package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MainClass_Hashtable {

	public static void main(String[] args) {
		Trainer tr=new Trainer("ABC");
		Tech tc=new Tech("Java");
		Hashtable <Object,Object>ht = new Hashtable<Object,Object>();
		//ht.put(null,null);
		ht.put(tr,tc);
		System.out.println(ht);
		
		 for(Map.Entry em : ht.entrySet()){ 
			 Trainer trObj=(Trainer) em.getKey();
			 Tech tchObj=(Tech) em.getValue();
		  System.out.println(trObj.trainer_name+"-"+tchObj.tech_name);
		  trObj.displaytrainer(); System.out.println(trObj.getClass()); }
		 
	}

}
