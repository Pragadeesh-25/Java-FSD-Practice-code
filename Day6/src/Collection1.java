import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Collection1 {

	public HashMap<Integer, String> getValues(HashMap<Integer, String> hm)
	{
		List<Map.Entry<Integer, String>> l= new ArrayList<Map.Entry<Integer,String>>(hm.entrySet());
		Collections.sort(l,new Comparator<Map.Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		HashMap<Integer, String> temp=new LinkedHashMap<Integer, String>();
		for(Map.Entry<Integer, String>mm:l)
		{
			temp.put(mm.getKey(), mm.getValue());
		}
		
		
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hMap=new HashMap<Integer,String>();
		
		hMap.put(3,"Third");
		hMap.put(4,"Fourth");
		hMap.put(1, "First");
		hMap.put(2, "Second");
		hMap.put(8, "Eighth");
		hMap.put(6, "Sixth");
		Collection1 c1=new Collection1();
		HashMap<Integer, String> hmm=c1.getValues(hMap);
		System.out.println("Sorted map");
		for(Entry<Integer, String> mm:hmm.entrySet())
    	{
			System.out.println(mm.getKey()+" "+mm.getValue());
  
    	}
		
		

	}

}
