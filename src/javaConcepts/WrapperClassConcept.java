package javaConcepts;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="100";
		System.out.println(x+20);
		
		int i=Integer.parseInt(x); // Data conversion
		System.out.println(i);
		
		String y="12.33";
		double d=Double.parseDouble(y);
		System.out.println(d);
		
		String k="true";
		Boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		
		int j=200;
		String s=String.valueOf(j);
		System.out.println(s+20);
		
		/*
		String u="100A"; // combination of digit and string
		int z=Integer.parseInt(u);
		System.out.println(z); // Number format Exception
		*/
		
		

	}

}
