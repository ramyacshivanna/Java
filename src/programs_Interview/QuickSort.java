package programs_Interview;

public class QuickSort {
	
	public void quickSort(int[] arr, int low, int high)
	{
		if(low<high)
		{
			int pi=partition(arr,low,high);
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
		}
		
	}
	
	public int partition(int[] arr, int low, int high)
	{
		int pivot=arr[high];
		int i=low-1;
				
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;				
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		return i+1;
	}
	
	public void printArray(int[] arr)
	{
		for(int i=0; i<arr.length;++i)
		{
			System.out.print(arr[i] + " ");
		}
				
	}

	public static void main(String[] args)
	{
		//Quick sort
		int[] arr= {10, 7, 8, 9, 1, 5};
		int n=arr.length;
		QuickSort qs=new QuickSort();
		qs.quickSort(arr,0,n-1);
		
		System.out.println("Print sorted array ");
		qs.printArray(arr);
	}

}
