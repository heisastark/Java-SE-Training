package day5.tut;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class mapEx {

	public static void main(String[] args) {
	// keys unique; values can be duplicated - unordered

		Hashtable<Integer,String> ht = new Hashtable<>();
		
		ht.put(1,"hello");
		ht.put(2,"hai");
		ht.put(3,"Good");
		
		System.out.println(ht);
		
		for(Integer i : ht.keySet())
			System.out.println(i + " " +ht.get(i));
		
		ht.forEach((k,v)->System.out.println(k + ":" + v));
		
		//before jdk8
		int key=1;String value=null;
		if(ht.contains(key))
			value = ht.get(key);
		else
			 value = "Default value";
		
		ht.computeIfAbsent(key, x-> "DefaultValue");
		
		ht.getOrDefault(key, "default value")	;
		
	//	ht.put(null, null);
	//	System.out.println(ht);
		
		Hashtable<Integer,List<String>> ht1 = new Hashtable<>();
		
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(null,null); // single key as null; more values as null
		System.out.println(hm);

	}

}
