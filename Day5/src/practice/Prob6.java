package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.print.attribute.SetOfIntegerSyntax;


public class Prob6 {
public static void main(String[] args) {
	ArrayList<Integer> arrayList=new ArrayList<Integer>();
	for(int i=0;i<10;i++)
	{
		arrayList.add(i);
	}
	Iterator<Integer> itr=arrayList.iterator();
	int temp=0;
	System.out.println("Odd numbers in the list:");
	while(itr.hasNext())
	{
		temp=itr.next();
		if(temp%2!=0)
		{
			System.out.print(temp+" ");
		}
	}
	Collections.sort(arrayList);
	System.out.println("\nMinimum value:"+arrayList.get(0));
	
Collections.reverse(arrayList);	
Iterator<Integer> itr1=arrayList.iterator();

	System.out.println("Reverse list:");
	while(itr1.hasNext())
{
	System.out.print(itr1.next()+" ");
}
	
		
}
}
