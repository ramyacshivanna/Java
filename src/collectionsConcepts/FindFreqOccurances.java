package collectionsConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FindFreqOccurances {
	
	public static void findFreOccurences(int[] arr)
	{
		HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			Integer c=hmap.get(arr[i]);
			if(hmap.get(arr[i]) == null)
			{
				hmap.put(arr[i], 1);		
			}
			else
			{
				hmap.put((arr[i]),++c);
			}
		}
		
		for(Entry<Integer, Integer> en: hmap.entrySet())
		{
			System.out.println("frequency of " + en.getKey() + " is " + en.getValue());
		}
		
		//duplciate elements
		System.out.println("Duplicate elements are ");
		for(Entry<Integer, Integer> en: hmap.entrySet())
		{
						if(en.getValue()>1)
			{
				System.out.println(en.getKey());
			}
				
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,3,2,10,5,10,3};
		findFreOccurences(arr);
		

	}

}
