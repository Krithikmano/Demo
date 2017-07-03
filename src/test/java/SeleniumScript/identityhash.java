package SeleniumScript;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class identityhash {

	public static void main(String[] args) {
		//HashMap i = new HashMap();
		IdentityHashMap i = new IdentityHashMap();
		String s1 = new String("Text1");
		String s2 = new String("Text1");
		i.put(s1, "karthik");
        i.put(s2, "karthik");
		//System.out.println(i.put(new Integer(10), "bb"));
        System.out.println(i);
	}

}
