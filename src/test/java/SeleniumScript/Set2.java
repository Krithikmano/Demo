package SeleniumScript;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
public class Set2 {

public static void main(String[] args)
{
    Set s = new HashSet();
    //TreeSet s = new TreeSet();
    //SortedSet s = new TreeSet();
	//NavigableSet s = new TreeSet();
	//Set s =new TreeSet();
	s.add("1@@ss");
	System.out.println(s.add("1@@ss")); 
	s.add("Manoharan");
	s.add("ss");
	s.add(null);
	System.out.println(s);
	
}
}
