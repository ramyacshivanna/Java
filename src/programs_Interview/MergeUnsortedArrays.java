package programs_Interview;

import java.util.Arrays;
import java.util.Scanner;

public class MergeUnsortedArrays {

	public static void mergeUnSortedArray(int[] first , int[] second)
	{
		int i,j,k;
		i=j=k=0;
		int[] merge= new int[first.length+second.length];
		Arrays.sort(first);
		Arrays.sort(second);
		
		while(i<first.length && j<second.length)
		{
		  if(first[i]<= second[j])
		  {
			  merge[k++]=first[i++];
			  
		  }
		  
		  else
		  {
			  merge[k++]=second[j++];
			  
		  }
		}	   
		System.out.println("value of i now is " + i);
		System.out.println("value of j now is : " + j);
		System.out.println("value of k now is : " + k);
				
		while(i<first.length)
		{
			merge[k++]=first[i++];
		}
		
		while(j<second.length)
		{
			merge[k++]=second[j++];
		}
		
	System.out.println("Sorted array after merging first and second array is ");
		
		for(k=0;k<merge.length;k++)
		{
			System.out.print(merge[k] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of first array");
		int m=sc.nextInt();
		int[] array1=new int[m];		
		
		System.out.println("Enter sorted array elements of first array");
		for(int i=0;i<m;i++)
		{
			array1[i]=sc.nextInt();
		}
			
		
		System.out.println("Enter size of second array");
		int n=sc.nextInt();
		int[] array2=new int[n];
		System.out.println("Enter sorted array elements of second array");
		for(int j=0;j<m;j++)
		{
			array2[j]=sc.nextInt();
		}
		
		
		mergeUnSortedArray(array1,array2);
			

	}
}