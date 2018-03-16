package javaConcepts;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UniqueIntegerFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,5,2,10,6,5,2};
		
		System.out.println("using hashset");
		Set<Integer> hset=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(hset.add(a[i])== false)
			{
				System.out.println(" ");
			}
			else
		    {
				hset.add(a[i]);
		    }
		}		
		Iterator<Integer> it=hset.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		
		System.out.println(" ******************** ");
		System.out.println("using hashmap");
		
		Map<Integer,Integer> hashmap=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			Integer count=hashmap.get(a[i]);
			if(count==null)
			{
				hashmap.put(a[i], 1);
			}
			
			else
			{
				hashmap.put(a[i], ++count);
			}
		}	
			
		//print all unique numbers
			for(Map.Entry<Integer, Integer> en: hashmap.entrySet())
			{
				if(en.getValue()>=1)
				{
				System.out.println(en.getKey());
				}
			}	
			
			System.out.println("print only duplicate integers ");
			for(Map.Entry<Integer, Integer> en: hashmap.entrySet())
			{
				
				if(en.getValue()>1)
				{
					System.out.print(en.getKey() + " ");
				}
			
		}
		}
		
}

