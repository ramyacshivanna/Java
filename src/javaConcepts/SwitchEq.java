package javaConcepts;
import java.util.Scanner;


public class SwitchEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		switch(age)
		{
		case 1: 	System.out.println("You can crawl");
					break;
		case 2: 	System.out.println("You can walk");
					break;
		case 3: 	System.out.println("you can go to school");
						break;
		default: 	System.out.println("You ahve grown a lot");
		 break;
		}
		
		
		

	}

}
