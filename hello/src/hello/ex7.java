package hello;

import java.util.Scanner;

public class ex7 {
boolean checkNumber(int n)
{
	boolean b=true;
	int temp=0;
	int x=0,y=0;
	x=n%10;
	while(n>0)
	{
		n=n/10;
		y=n%10;
		if(y>x)
		return false;
		
		x=y;
		
	}
	return b; 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the n");
		n=sc.nextInt();
		ex7 obj=new ex7();
		boolean x=obj.checkNumber(n);
		System.out.println("Output:"+x);
	}

}
