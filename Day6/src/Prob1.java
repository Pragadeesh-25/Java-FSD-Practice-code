import java.util.*;
import java.util.Map.Entry;



public class Prob1 
{
	public void findFrequency(ArrayList<String> al,int n) 
	{
		Map<String, Integer> hm = new TreeMap<String, Integer>();
		String temp=null;
		Iterator<String> itr=al.iterator();

		while(itr.hasNext())
		{
			temp=itr.next();
			if(hm.containsKey(temp))
			{
				hm.put(temp, hm.get(temp)+1);
			}
			else {
				hm.put(temp, 1);
			}
		}
        List<Map.Entry<String,Integer>> l=new ArrayList<Map.Entry<String,Integer>>(hm.entrySet());
        Collections.sort(l,new Comparator<Map.Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
        HashMap<String, Integer> t=new LinkedHashMap<>();
        for(Map.Entry<String, Integer> mm:l)
        	t.put(mm.getKey(), mm.getValue());
        System.out.println("Sorted map");
        int i=0;
        for(Map.Entry<String, Integer> mm:t.entrySet())
        	{System.out.println(mm.getKey()+" "+mm.getValue());
        	i++;
        	if(i==n)
        		break;
        	}
	}
public static void main(String[] args) {
	ArrayList<String> arrayList=new ArrayList<String>();
	String[] arr={"Banana","Apple","Orange","Apple","Banana","Banana","Apple","Grapes","Apple","Orange","Orange","Guava"};
	
	arrayList.addAll(Arrays.asList(arr));
	int n=0;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the value of n");
	n=scanner.nextInt();
	Prob1 objProb1=new Prob1();
	objProb1.findFrequency(arrayList,n);
}

}
