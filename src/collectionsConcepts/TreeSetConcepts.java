package collectionsConcepts;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating a treeset of arraylist;
		ArrayList al=new ArrayList();
		al.add("B");
		al.add("A");
		al.add("C");
		al.add("D");
		al.add("B");
		System.out.println("Print array list");
		System.out.println(al);
		
		
		TreeSet tree=new TreeSet();
		tree.addAll(al);
		System.out.println("print treeset");// duplicates elements not allowed
		System.out.println(tree);
		
		System.out.println("Tree set first element: " + tree.first());
		System.out.println("Trees set last element "+ tree.last());
		
		TreeSet tree1=new TreeSet();  
		tree1.add("GeeksforGeeks");
		tree1.add("Compiler");
		tree1.add("practice");
		
		System.out.println(tree1.headSet("O"));//elements lesser than O
		System.out.println(tree1.tailSet("G"));//elements greater than or equal to G
		System.out.println(tree1.subSet("C", "P"));//Elements ranging from C to P
		
		tree1.clear();//delete all elements from tree
		System.out.println(tree1);// empty tree
		
		

	}

}
