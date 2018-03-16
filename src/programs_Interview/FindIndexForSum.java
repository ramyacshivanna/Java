package programs_Interview;

public class FindIndexForSum {
	
	// Given some value called sum value, find out the array index range which matches the given sum
	//eq: arr=1,4,5,2,6,8 and sum=13, then arr index from 2 and 4 gives sum of 11

	int FindArryIndex(int n, int[] arr,int sum)
	{
		int cur_sum=0;
		int i,j;
		for(i=0;i<n;i++)
		{
			cur_sum=arr[i];
			for(j=i+1;j<n;j++)
			{
				if(cur_sum==sum)
				{
					int p=j-1;
					System.out.println("Array index from : "+ i + " and " + p);
					return 1;
				}
			    if(cur_sum>sum ||j==n)
				{
					break;
				}
			    cur_sum=cur_sum+arr[j];
				
			}
				
		}
		System.out.println("No match array found");	
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,4,5,2,6,8};
		FindIndexForSum obj=new FindIndexForSum();
		int findSum=13;
		int size=a.length;
		obj.FindArryIndex(size, a, findSum);		
	}

}
