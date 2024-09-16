package hello;
import java.util.*;
public class ex6 {
	int calculateDifference(int n)
	{
		int diff=0,sum=0,sum2=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i*i;
			sum2+=i;
		}
		sum2=sum2*sum2;
		diff=sum-sum2;
		return diff;
	}
	public static void main(String[] args) {
	ex6 obj=new ex6();
	int n=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value of n");
	n=s.nextInt();
	int res=obj.calculateDifference(n);
	System.out.println("Required Output:"+Math.abs(res));
	
	}
}
