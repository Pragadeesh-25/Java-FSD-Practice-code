package practice;

import java.util.*;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class Prob2 {
public static void main(String args[])
{
	HashSet<String> s= new HashSet<String>();
	s.add("Ab");
	s.add("cde");
	s.add("fgh");
	s.add("ijk");
	String res=null;
	Iterator<String> iterator= s.iterator();
	res=iterator.next();
	while(iterator.hasNext())
	{
		
	res+=iterator.next();
		
	}
	System.out.print("Result: "+res);
	
	
	
}
}
