package practice;

import java.util.*;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class Prob1 {
public static void main(String args[])
{
	HashSet<String> s= new HashSet<String>();
	s.add("Abc");
	s.add("cde");
	s.add("efg");
	s.add("hij");
	Iterator<String> iterator= s.iterator();
	while(iterator.hasNext())
	{
		System.out.print(iterator.next()+" ");
	}
	
	
	
}
}
