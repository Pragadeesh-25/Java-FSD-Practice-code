package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Prob7 implements Comparable<Prob7>{
String word;
int frequencies=0;
public Prob7(String word, int frequencies) {
	super();
	this.word = word;
	this.frequencies = frequencies;
}
public static void printTopn(ArrayList<String> arr,int n)
{
	ArrayList<Prob7> obj=new ArrayList<Prob7>();
Iterator<String> itr = arr.iterator();
String tempString=null;
Prob7 temp2=null;
while(itr.hasNext())
{
tempString=itr.next();
Iterator<Prob7> itr2=obj.iterator();
int found=0;
while(itr2.hasNext())
{
	temp2=itr2.next();
	if(temp2.word.equals(tempString))//Existing
	{
		temp2.frequencies++;
		found=1;
		break;
	}
	
	
}
if(found==0)
	{
		obj.add(new Prob7(tempString, 1));
	}
}
Collections.sort(obj);
System.out.println("Top "+n);

for(int i=0;i<n;i++)
{
	System.out.println("Word "+obj.get(i).word+" Frequencies"+ obj.get(i).frequencies);
}
	
}
public static void main(String[] args) {
ArrayList<String> arrayList=new ArrayList<String>();

arrayList.add("Apple");
arrayList.add("Banana");
arrayList.add("Apple");
arrayList.add("Apple");
arrayList.add("Orange");
arrayList.add("Orange");
arrayList.add("Guava");
arrayList.add("Apple");
arrayList.add("Apple");
arrayList.add("Orange");
arrayList.add("Banana");
arrayList.add("Grapes");
arrayList.add("Watermelon");
int n=0;
System.out.println("Enter the value of n");
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
printTopn(arrayList, n);
}
@Override
public int compareTo(Prob7 o) {
	
	return o.frequencies-this.frequencies;
}
}
