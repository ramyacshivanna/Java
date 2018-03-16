package collectionsConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hmap=new HashMap();
		hmap.put("A", new Integer(100));
		hmap.put("B",200);
		hmap.put("D", new Integer(50));
		hmap.put("C", new Integer(300));
		hmap.put("C", new Integer(400)); //it overrides existing value
		
		System.out.println("Print initial hashmap");
		System.out.println(hmap);
		
	Set<Map.Entry<String,Integer>> hs=hmap.entrySet();
	for(Map.Entry<String,Integer> ms : hs)
	{
		System.out.print(ms.getKey() + " ");
		System.out.println(ms.getValue());
	}
	
	if(hmap.isEmpty())
	{
		System.out.println("Map is empty");
	}
	else if(hmap.containsKey("C"))
	{
		System.out.println("value of a key C is " + hmap.get("C"));
	}
		
	}

}
