package programs_Interview;

public class MAXLengthOfPositiveInteger {

	public static void getLongestSeqPositiveNumbers(int[] arr, int n)
	{
		int Curr_Length=0, max_Length=0, curr_Index=0, max_Index=0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
			{
				Curr_Length++;
				if(Curr_Length==1)
				{
					curr_Index=i;
				}
			}
			
			else
			{
				if(Curr_Length > max_Length)
				{
					max_Length=Curr_Length;
					max_Index=curr_Index;
				}
				Curr_Length=0;
			}
		}
		if(max_Length > 0)
		{	
		System.out.println("The index which follows maximum of positive numbers in ana array is " + max_Index);
		System.out.println("The maximum positive numbers starting from index " + max_Index + " is " + max_Length);
		}
		else
		{
			System.out.println("No positive numbers found in a given array ");
		}
	}
	
	
	public static void main(String[] args) {
		// It should display the startng index of positive numer which follows many positive numbers
		  int arr[] = { 1, 2, -3, 2, 3, 4, -6, 1, 2, 3, 4, 5, -8, 5, 6 };
		  int n=arr.length;
		  getLongestSeqPositiveNumbers(arr,n);

	}

}
