package practice;
import java.util.Scanner;

public class First {
	public static void main(String args[])
	{
		int n=0;
	    Scanner scanner = new Scanner(System.in);
		n=scanner.nextInt();
		int arr[]=new int[n];
		int sum=0,temp=0,flag=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}
	
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		for(int i=0;i<n-1;i++)
		{
			temp+=arr[i];
			if(temp==sum-arr[i+1]-temp)
				{System.out.print("Pivotal index"+(i+1));
				flag++;
				break;
				}
			
		}
		if(flag==0)
		{System.out.print("Not found");
		}
		
	}


}
