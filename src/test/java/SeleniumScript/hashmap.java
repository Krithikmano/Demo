package SeleniumScript;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap {
public static void main (String[] arg){
	
    Map h = new HashMap();
    //Map h = new LinkedHashMap();
	//Map h = new Hashtable();
	h.put(null, "karthik");
	h.put(222, "ssss");
	h.put(211, "karthikmanoharan");
	System.out.println("Before adding new value====" +h);
	System.out.println("Replacing the Key value===="  +h.put(211, "karthik1"));
	System.out.println("Hashmap value====" +h.get(211));
	System.out.println("Hashmap output====" +h);
	Set c = h.entrySet();
	System.out.println("EntrySEt output====" +c);
	Collection c1 = h.values();
	System.out.println("Collected output====" +c1);
	Set s = h.keySet();
	System.out.println("Keyset output====" +s);
	Iterator itr = c.iterator();
	while(itr.hasNext())
	{
		Map.Entry me = (Map.Entry)itr.next();
		//System.out.println("key===" +me.getKey()+ "Value==="+me.getValue());
		System.out.println("key===" +me.getKey());
		System.out.println("keyme===" +me);
   }
	
}
}

