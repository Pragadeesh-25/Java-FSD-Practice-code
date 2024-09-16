package hello;

import java.util.Scanner;

public class ex3 {
	void fibNonrec(int n)
	{
		int a=1,b=1;
		System.out.print(a+" "+b+" ");
		int c=0;
		for(int i=0;i<n-2;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
			
		
	}
	int fibRec(int n)
	{
		if(n==1)
			return 1;
		if(n==0)
			return 0;
		else
			return fibRec(n-1)+fibRec(n-2);
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex3 obj=new ex3();
		int n=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=s.nextInt();
		System.out.println("Non recursive");
		obj.fibNonrec(n);
		System.out.println("");

		System.out.println("Recursive");

		 for (int i = 1; i <=n; i++) {

	            System.out.print(obj.fibRec(i) + " ");
	        }

	}

}
