package hello;

import java.util.Scanner;

public class ex5 {
	int calculateSum (int n)
	{
		int res=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0||i%5==0)
				res+=i;
		}
		return res;
	}
public static void main(String args[])
{
	int n=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the n");
	n=sc.nextInt();
	ex5 obj=new ex5();
	int res=obj.calculateSum(n);
	System.out.println("Result"+res);
}
}
