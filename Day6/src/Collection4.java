import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Collection4 {
	public HashMap<Integer, String> getStudents(HashMap<Integer, Integer> ip)
	{
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		for(Map.Entry<Integer,Integer> m:ip.entrySet())
		{
			if(m.getValue()>=90)
				hm.put(m.getKey(), "Gold");
			else if(m.getValue()>=80&&m.getValue()<90)
				hm.put(m.getKey(), "Silver");
			else if(m.getValue()>=70&&m.getValue()<80)
				hm.put(m.getKey(), "Bronze");
			
		}
		return hm;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=sc.nextInt();
		HashMap<Integer, Integer> inputHashMap=new HashMap<Integer,Integer>();
		int reg,mark;
		System.out.println("Enter the reg and marks");
		for(int i=0;i<n;i++)
		{
			reg=sc.nextInt();
			mark=sc.nextInt();
			inputHashMap.put(reg, mark);
		}
		Collection4 c4=new Collection4();
		HashMap<Integer, String> output=new HashMap<Integer,String>();

		output=c4.getStudents(inputHashMap);
		System.out.println("Sorted map");
		for(Entry<Integer, String> mm:output.entrySet())
    	{
			System.out.println("Reg number: "+mm.getKey()+" Medal: "+mm.getValue());
  
    	}

	}

}
