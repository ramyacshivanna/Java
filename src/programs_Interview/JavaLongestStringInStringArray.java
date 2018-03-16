package programs_Interview;

import java.util.Scanner;

public class JavaLongestStringInStringArray {
	
	 public static String getLongestString(String[] array) {
	      int max = 0;
	      String longestString = null;
	      for (String s : array) {
	          if (s.length() > max) {
	              max = s.length();
	              longestString = s;
	          }
	      }
	      return longestString;
	  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binary=new Scanner(System.in).next();
		
		String[] arrayBin = binary.split("0+");
	      String longestString = getLongestString(arrayBin);
	      System.out.format("longest string: '%s'\n", longestString);
	}

}
