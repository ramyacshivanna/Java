package collectionsConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedlist=new LinkedList<String>();
		linkedlist.add("test");
		linkedlist.add("QTP");
		linkedlist.add("selenium");
		linkedlist.add("soap");
		linkedlist.add("smart");
		linkedlist.add("ecom");
		
		//print
		System.out.println("Linked list data: " + linkedlist);
	    
		linkedlist.addFirst("function");
		System.out.println("Linked list data: " + linkedlist);
		
		linkedlist.addLast("Regression");
		System.out.println("Linked list data: " + linkedlist);
		System.out.println(linkedlist.getFirst());
		System.out.println(linkedlist.get(0));
		
		linkedlist.set(1, "Adhoc");
		System.out.println("Linked list data: " + linkedlist);
		
		linkedlist.removeFirst();
		System.out.println("Linked list data: " + linkedlist);
		
		linkedlist.removeLast();
		System.out.println("Linked list data: " + linkedlist);
		
		linkedlist.remove(2);
		System.out.println("Linked list data: " + linkedlist);
		
		//iterate alinkedlist values of linked list.
		//1. for loop
		for(int n=0;n<linkedlist.size();n++)
		{
			System.out.println(linkedlist.get(n));
		}
		
		System.out.println("*****************");
		//2. advanced for loop
		for(String str:linkedlist)
		{
			System.out.println(str);
		}
		
		System.out.println("*****************");
		
		//Iterator
		Iterator<String>it=linkedlist.iterator();
		while(it.hasNext())
		{			
				System.out.println(it.next());
		}
		
		
		System.out.println("*****************");
		//while loop
		int num=0;
		while(linkedlist.size()>num)
		{
			System.out.println(linkedlist.get(num));
			num++;
		}
		
		System.out.println("*****************");
		
	}

}
