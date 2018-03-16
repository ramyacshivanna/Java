package programs_Interview;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//First method
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int len=(s.length())-1;
		String rev="";
		for(int i=len;i>=0;i--)
		{
			rev=rev + s.charAt(i);
		}

		System.out.println("Reverse of the string is : " +rev);
	

//2nd method using string buffer;
	StringBuffer sf=new StringBuffer(s);
	System.out.println("Reverse of the string is : " + sf.reverse());
	

	
	
	
}
}
