package practice;

import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
public class Prob3 {
public static void main(String args[])
{
	HashSet<Float> s= new HashSet<Float>();
	s.add(3.5f);
	s.add(4.5f);
	s.add(5.5f);
	
	Iterator<Float> iterator= s.iterator();
	float res = 0;
	while(iterator.hasNext())
	{
		res+=iterator.next();
	}
	System.out.print("Result "+res);
	
	
	
}
}
