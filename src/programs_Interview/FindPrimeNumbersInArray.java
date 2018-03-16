package programs_Interview;

import java.util.Arrays;
import java.util.Scanner;

public class FindPrimeNumbersInArray {
	
	public static void findPrimeNumbersOfArray(int[] arr)
	{
		int counter=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean isPrime=true;
			
			for(int j=2;j<=arr[i]/2;j++)
			{
				if((arr[i]%j) == 0)
				{
					isPrime=false;
					break;
				}
				
			}
			
			if(isPrime)
			{
				System.out.println(arr[i]);
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		
		int n=sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		
			arr[i]=sc.nextInt();
			
		findPrimeNumbersOfArray(arr);

	}

}
