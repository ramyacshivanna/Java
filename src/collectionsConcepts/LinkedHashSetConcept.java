package collectionsConcepts;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkset=new LinkedHashSet<String>();
		linkset.add("A");
		linkset.add("B");
		linkset.add("C");
		linkset.add("D");
		linkset.add("B");
		
		System.out.println(linkset);
		
		System.out.println("remove one string");
		linkset.remove("B");
		System.out.println(linkset);
		
		System.out.println("print using iterator");
		Iterator it=linkset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("check if elemet is present or not");
		System.out.println(linkset.contains("D"));
		System.out.println(linkset.contains("F"));

	}

}
