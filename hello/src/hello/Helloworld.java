package hello;
import java.util.*;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,sum=0;
		char A=97;
		byte b=20;
		
		System.out.print("enter n");

		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			int temp=n%10;
			sum+=temp*temp*temp;
			n=n/10;
		}
		
		System.out.print("Sum of cubes of digits:"+sum+" "+A);
	}

}
