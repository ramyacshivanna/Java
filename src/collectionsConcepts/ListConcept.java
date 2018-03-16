package collectionsConcepts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(3);
		l1.add(5);
		l1.add(6);
		System.out.println(l1);
		
		
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(10);
		l2.add(4);
		l2.add(5);
		System.out.println(l2);
		
		l1.addAll(1, l2); //add l2 elements to l1 from index 1
		System.out.println(l1);
		
		l1.remove(3); //remove index 3 element from l1
		System.out.println(l1);
		
		System.out.println(l1.get(3));//get index 3 item from l1
		
		
		l1.set(0, 20);//replace l1 index 0 element by 20
		System.out.println(l1);
		
		List<String> l3=new ArrayList<String>();
		l3.add("ramya");
		l3.add("naveen");
		l3.add("bt");
		l3.add("naveen");
		System.out.println("last index of object naveen is : " + l3.lastIndexOf("naveen"));
		System.out.println("first index of object naveen is : " + l3.indexOf("naveen"));
		System.out.println("Index of of object not found  is : " + l3.indexOf("intel"));
		
		//Linked list
		LinkedList<String> object = new LinkedList<String>();
		 object.add("A");
	        object.add("B");
	        object.addLast("C");
	        object.addFirst("D");
	        object.add(2, "E");
	        object.add("F");
	        object.add("G");
	        System.out.println("Linked list : " + object);
	        
	        
	        ListIterator ite=object.listIterator();
	       // object.remove("B");
	        //object.set(2, "D");
	        //object.removeFirst();
	        //object.removeLast();
	        //object.add(1, "T");
	        
	        //forward traversing
	        System.out.println("*****forward traversing******");
	        while(ite.hasNext())
	        {
	        	System.out.print(ite.next() + " ");
	        }
	        
	        //backword traversing
	        System.out.println(" ");
	        System.out.println("*****backward traversing******");
	        while(ite.hasPrevious())
	        {
	        	System.out.print(ite.previous() + " ");
	        }
		
		
		
		

	}

}
