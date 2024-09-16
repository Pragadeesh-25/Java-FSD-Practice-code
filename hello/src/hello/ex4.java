package hello;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the n");
		n=sc.nextInt();
		int temp=0;
		for(int i=1;i<=n;i++)
		{temp=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
					temp++;
			}
			if(temp==1)
				System.out.println(i+" ");
		}

	}

}
