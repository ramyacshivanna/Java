package collectionsConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[3];//static array. Size is fixed
		
		//Dynamic array-- ArrayList. We can sore n number values. No limit in size and it can have duplicate values also.
		//Maintains insertion order
		//Synchronized. Its not thread safe. Its slow compared to other collection
		//It allows random access to fetch any element. It stores the values on the basis of indexes. 
		//Easy to retrieve values through its index.
		
		
		ArrayList ar=new ArrayList(); // Non Generic arraylist objects
		ar.add(10);
		ar.add(40);
		ar.add(30);
		System.out.println(ar.size());
		
		//to print all values: Use for loop or iterator
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		//non generic vs generic 
		//Generic means any one type of values like only Integer/Only Strings etc..
		//Non Generic means we can add mixed values like, value in one index will be int, another string, another boolean etc. 
		
		ArrayList<Integer> ai=new ArrayList<Integer>();
		ai.add(100);
		ai.add(500);
		
		ArrayList<String> as=new ArrayList<String>();
		as.add("Home");
		as.add("World");
		
		
		ArrayList<E> ae=new ArrayList<E>(); // create an arraylist for an object
		
		Employee e1=new Employee("Naveen",28,"EC");
		Employee e2=new Employee("Ramya",28,"CS");
		Employee e3=new Employee("Navi",22,"IS");
		
		ArrayList<Employee> are=new ArrayList<Employee>();
		are.add(e1);
		are.add(e2);
		are.add(e3);
		
		//Iterator to traverse above arraylist values. it will not work based on index since we are saving object here
		Iterator<Employee> it=are.iterator();
		while(it.hasNext())
		{
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		
		
		System.out.println("*************Demo of add all**********");
		ArrayList<String> as1=new ArrayList<String>();
		as1.add("Java");
		as1.add("C#");
		as1.add("C");
		
		as.addAll(as1);
		for(int j=0;j<as.size();j++)
		{
			System.out.println(as.get(j));
		}
		
		
		System.out.println("*************Demo of Remove all**********");
		as.removeAll(as1);
		for(int k=0;k<as.size();k++)
		{
			System.out.println(as.get(k));
		}
		
		
		System.out.println("*************Demo of RetainALl all**********");
		ArrayList<String> as2=new ArrayList<String>();

		as2.add("Java");
		as2.add("QTP");
		as2.add("Selenium");
		
		as1.retainAll(as2);
		for(int k=0;k<as1.size();k++)
		{
			System.out.println(as1.get(k));  //displays only common string
		}
		
				
	}
}
