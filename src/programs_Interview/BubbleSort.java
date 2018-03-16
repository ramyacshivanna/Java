package programs_Interview;

import java.util.Scanner;

public class BubbleSort {
	
	public void BubbleSorting(int n,int[] input)
	{
		int i,j,temp;
		
		for(i=0;i<(n-1);i++)
		{
			for(j=0;j<(n-i-1);j++)
			{
				if(input[j]>input[j+1])
				{
					temp=input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted list");
		for(int k=0;k<input.length;k++)
		{
			System.out.println(input[k] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements in an array");
		
		int n=sc.nextInt();
		int arr[] = new int[n];
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter an array elements to sort");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc1.nextInt();
		}
		BubbleSort obj=new BubbleSort();
		obj.BubbleSorting(n,arr);
		
		

	}

}
