package practice;

import java.util.*;
import java.util.Iterator;
public class Prob5 {
	
public static void main(String[] args) {
	HashSet<Object> hSet=new HashSet<>(5);
	String str1=new String("Hello");
	String str2=new String("World");
	MyOwnClass ob1=new MyOwnClass(44,"Virat");
	MyOwnClass ob2=new MyOwnClass(15, "Dhoni");
	int b=9;
	int c=10;
	hSet.add(str1);
	hSet.add(str2);
	hSet.add(ob1);
	hSet.add(ob2);
	hSet.add(b);
	hSet.add(c);
	Iterator<Object> itr=hSet.iterator();
	System.out.println("Hashset");
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ");
	}
	
	System.out.println("\nLinkedHashset");

	LinkedHashSet<Object> lSet=new LinkedHashSet<>(5);
	lSet.addAll(hSet);
	Iterator<Object> itr2=lSet.iterator();
	while(itr2.hasNext())
	{
		System.out.print(itr2.next()+" ");
	}

	System.out.println("\nArrayList");

	ArrayList<Object> aList=new ArrayList<>();
	aList.addAll(hSet);
	Iterator<Object> itr3=aList.iterator();
	while(itr3.hasNext())
	{
		System.out.print( itr3.next()+" ");
	}
}
}
