package com;

public class Outerclass {
	public enum gender {MALE, FEMALE}
	int num1=9;
public static void out()
{
	System.out.println("Out method");
}
public class Innerclass
{
	int num1=10;
	public void in()
	{
		System.out.println("Out method");
	}
}
}
