package com;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the ss");
		String ss=sc.next();
		System.out.print("ss"+ss);
		int x=sc.nextInt();
		System.out.print("x"+x);

		

		
		
		
iTest it=new Testclass();
it.aa();
it.bb();
iTest.cc();

Testclass tt=new Testclass(); //Make it abstract, have unique method in abstract, try to call it using this object
tt.bb();
tt.cc();
Testclass.cc();

Hello2 hh=new Hello3();
hh.x();
hh.y();
hh.z();
	}

}
