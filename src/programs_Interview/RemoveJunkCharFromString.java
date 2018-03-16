package programs_Interview;

public class RemoveJunkCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=",&$=_ ** latin string 0123457";
		System.out.println(s);
		
		String s1="selenium #$%^&*())( !@#$%^ Java ^%$#@9865432"; 
				
		//Use regular expression[1-z],[A-Z][0-9]
		s=s.replaceAll("[^a-zA-Z0-9]", " ");// ^ symbol to keep them	
		
		System.out.println(s);
		System.out.println(s.trim());
		
		//exclude the alphabets and numbers
		s1=s1.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(s1);
				
	}

}
