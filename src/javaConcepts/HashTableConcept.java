package javaConcepts;
import java.util.Hashtable;


public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht=new Hashtable();
		ht.put("A", "Test");
		ht.put("B", "Hello");
		ht.put("C","World");
		System.out.println(ht.size());
		
		ht.put(1, "10.33");
		System.out.println(ht.get("A"));
		System.out.println(ht.get(1));
		
		Hashtable<Integer,Integer> h=new Hashtable<Integer,Integer>();
		h.put(20, 100);
		h.put(21, 250);
		System.out.println(h.get(20));
		
		Hashtable<Integer,String> hs=new Hashtable<Integer,String>();
		hs.put(30, "My");
		hs.put(31, "World");
		System.out.println(hs.get(31));
		
		hs.remove(20);
		
		System.out.println(hs.get(20));
		
			
				

	}

}
