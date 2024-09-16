import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Collection3 {
	public HashMap<Integer, Integer> getSquares(int arr[],int n)
	{
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			hm.put(arr[i], arr[i]*arr[i]);
		}
		return hm;
	}
	public static void main(String[] args) {
		System.out.println("Enter the value of number of values");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Collection3 c3=new Collection3();
		HashMap<Integer,Integer>h=c3.getSquares(arr, n);
		System.out.println("Sorted map");
		for(Entry<Integer, Integer> mm:h.entrySet())
    	{
			System.out.println("Value: "+mm.getKey()+" Square: "+mm.getValue());
  
    	}
	}
}
