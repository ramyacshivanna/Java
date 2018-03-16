package collectionsConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       
		Set<String> hashset=new HashSet<String>();
		hashset.add("intel");
		hashset.add("technology");
		hashset.add("pvt");
		hashset.add("limited");
		hashset.add("intel");
		
		System.out.println(hashset); //hashst dont allow duplicate values
		
		Set<String> treeSet=new TreeSet<String>(hashset);// we can add hashset to treeset
		System.out.println(treeSet);//tree set gives sorted values
		
		hashset.remove("limited");
		System.out.println(hashset);
		
		Set<Integer> a=new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] {1,4,2,7,3,5}));
		
		Set<Integer> b=new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] {2,3,7,10,11}));
		
		Set<Integer> union=new HashSet<Integer>(a);
		union.addAll(b);
		System.out.println(union); //union of 2 sets
		
		Set<Integer> intersection=new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.println(intersection); //intersection of 2 sets
		
		Set<Integer> diff=new HashSet<Integer>(a);
		diff.removeAll(b);
		System.out.println(diff); //prints the non common elements from a
		
	}

}
