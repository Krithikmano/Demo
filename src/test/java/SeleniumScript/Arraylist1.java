package SeleniumScript;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

import org.apache.bcel.generic.LLOAD;

public class Arraylist1 {
public static void main(String[] args){
	List l= new ArrayList();
	l.add("Sugant");
	l.add(null);
	l.add("karthik");
	l.add(5); 
	l.get(0);
	System.out.println(l);
	System.out.println(l.get(0));
	Collections.
	/*l.set(1, 1);
	l.set(0, 5);
	l.hashCode();
	System.out.println(l.hashCode());
	l.remove(3);
	l.remove("null");	*/
	//System.out.println(l);
	
	LinkedList ll= new LinkedList();
	ll.add("null");
	ll.add("null");
	ll.add("karthik");
	ll.add(5);
	//System.out.println(ll);
	ll.set(1, 1);
	ll.set(0, 5);
	//System.out.println(ll);
	ll.remove(3);
	ll.remove("null");	
	//System.out.println(ll);
	ll.getFirst();
	//System.out.println(ll.getFirst());
	//System.out.println(ll.getLast());
		
}
}
