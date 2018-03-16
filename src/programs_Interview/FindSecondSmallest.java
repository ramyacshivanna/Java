package programs_Interview;

public class FindSecondSmallest {

	public static void findSecondSmallestElement(int[] arr)
	{
		int first=Integer.MAX_VALUE;
		int second=Integer.MAX_VALUE;
		
		if(arr.length<2)
		{
			System.out.println("Invalid input");
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<first)
			{
				second=first;
				first=arr[i];				
			}
			
			else if(arr[i]<second && arr[i]!=first)
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
			System.out.println("smallest element is " + first);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {30,12,35,14,6,31};
		findSecondSmallestElement(arr);
	}

}
