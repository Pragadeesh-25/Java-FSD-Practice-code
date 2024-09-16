package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Student implements Comparable<Student>{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.marks-this.marks;
	}
	public static void main(String[] args) {
		TreeSet<Student> set=new TreeSet<Student>();
		set.add(new Student("Abc", 99));
		set.add(new Student("def", 100));
		set.add(new Student("ghi", 85));
		set.add(new Student("jkl", 75));
		set.add(new Student("omn", 97));
		Iterator<Student> itr=set.iterator();
		int i=0;
		while(itr.hasNext())
		{ i++;
		
		Student objStudent=itr.next();
			System.out.println(objStudent.name+" "+objStudent.marks);
			
			if(i==3) 
			{break;}
		}
		
		
		




	}
	

}
