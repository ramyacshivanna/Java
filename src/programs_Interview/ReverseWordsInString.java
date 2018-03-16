package programs_Interview;

import java.util.ArrayList;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I love java programming";
		String arr=" ";
		String[] a1=s.split(" ");
		for(int i=a1.length-1;i>=0;i--)
		{
			System.out.print(a1[i] + " ");
		}
		
		System.out.println("Now reverse the words also");
		for(int i=a1.length-1;i>=0;i--)
		{
			String a2=a1[i];
			String rev="";
			for(int j=a2.length()-1;j>=0;j--)
			{
				rev=rev+a2.charAt(j);
			}
			System.out.print(rev + " " );
						
		}	
		
	}

}
