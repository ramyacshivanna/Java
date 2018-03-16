package javaConcepts;
import java.util.Random;


public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
			int arr[]=new int[10];
			int arr1[]={0,8,2,10,4};
			System.out.println(arr[1]);
			System.out.println(arr1[3]);
			System.out.println(arr.length);
			System.out.println("***********************");
			Object obj[]=new Object[3];
			obj[0]=1;
			obj[1]="Hello";
			obj[2]=1.190;
			for(int z=0;z<obj.length;z++)
			{
				System.out.println(obj[z]);
			}
			
			for(int z: arr1)
			{
			 total+=z;
			 }
			System.out.println("sum of the elements in an array is: " + total);
			
			change(arr1);
			
			for(int y:arr1)
			{
				System.out.println(y);
			}
			System.out.println();
			
			}
	public static void change(int x[])
	{
		for (int counter=0;counter<x.length;counter++)
		{
			x[counter]+=5;
		}
	}
	
}

