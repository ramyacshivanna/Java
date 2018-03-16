package programs_Interview;

public class FindSecondLargest {
	
	public static void findSecondLargestElement(int[] arr)
	{
		int first= 0;
		int second=0;
		//int first=Integer.MIN_VALUE;
		//int second=Integer.MIN_VALUE;
		
		if(arr.length<2)
		{
			System.out.println("Invalid input");
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				second=first;
				first=arr[i];				
			}
			
			else if(arr[i]>first && arr[i]<second)
			{
				second=arr[i];
			}
		}
		
		if(second==0) //if(second==Integer.MIN_VALUE
		{
			System.out.println("there is no second largest elemnt");
		}
		else
		{
			System.out.println("second largest element is " + second);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {30,12,35,14,6,31};
		findSecondLargestElement(arr);
		}

}
