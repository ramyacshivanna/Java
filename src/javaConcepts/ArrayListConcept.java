package javaConcepts;
import java.util.ArrayList;


public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add(300);
		ar.add(250);
		
		System.out.println(ar.size());
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		ar.add(10.29);
		ar.add("Home");
		ar.add('M');
		ar.remove(2);
		
		System.out.println(ar.size());
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}

	}

}
