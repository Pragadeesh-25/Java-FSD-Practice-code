import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Collection2 {

	public HashMap<Character, Integer> countChars(char[] ch)
	{
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		for(char t:ch)
		{
			if(hm.containsKey(t))
			{
				hm.put(t, hm.get(t)+1);
			}
			else {
				hm.put(t,1);
			}
		}
		return hm;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the word");
		Scanner sc=new Scanner(System.in);
		String l=sc.nextLine();
		char[] ch=l.toCharArray();
		Collection2 obj=new Collection2();
		HashMap<Character, Integer> hp=obj.countChars(ch);
		System.out.println("Sorted map");
		for(Entry<Character, Integer> mm:hp.entrySet())
    	{
			System.out.println(mm.getKey()+" "+mm.getValue());
  
    	}

	}

}
