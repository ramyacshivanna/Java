package programs_Interview;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class DuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]={"Java","C#","Java","C","C++","Ruby","Perl","C++"};
		
		//compare each element. time complexity is more O(n^2);
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j]))
					{
					System.out.println("Duplicate element found is: "+names[i]);
					}
			}	
		}
		System.out.println("******************");
		
		// another method with less time complexity 
		//Use hashset to store i=unique values
		Set<String> store=new HashSet<String>();
		for(String name:names)
		{
			if(store.add(name)==false)
			{
				System.out.println("duplicate element is :: " + name);
			}
			else {
				store.add(name);
			}
				
		}
		System.out.println("*********************************");
		System.out.println("Now print only unique values by removing duplicates");
		Iterator<String> it=store.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println("******************");
		
		// Using HashMap : Key value mapping. Duplicate values are allowed since it stores based on key,value concept
		Map<String,Integer> storemap=new HashMap<String,Integer>();
		for(String name:names)
		{
			Integer count=storemap.get(name);
			System.out.println("count" + count);
			
			if(count==null)
			{
				storemap.put(name, 1);
			}
			else
			{
				storemap.put(name, ++count);
			}
		}
		//get the value from this hashmap object.
		System.out.println(storemap.entrySet());
		Set<Entry<String,Integer>> entrySet=storemap.entrySet();
		for(Entry<String,Integer> entry:entrySet)
		{
			if(entry.getValue()>1)
			{
				//to print only duplicate elements
				System.out.println("Duplicate element is :: "+entry.getKey() + entry.getValue());
				
			}
		}
				
		//to print unique values
		for(Entry<String,Integer> entry:entrySet)
		{
			if(entry.getValue()>=1)
			{
				System.out.println(entry.getKey() );
				
			}
		}
			

	}
}


