package programs_Interview;

public class KadaneAlgorithm {
	//Kadane's Algorithm means finding the Largest Sum of Contiguous Subarray
	//-2, -3, 4, -1, -2, 1, 5, -3 should return 7. (4-1-2+1+5=7)

	public static int maxSumInSubArray(int[] arr)
	{
		int maxEnd=0;
		int maxSoFar=0;
		for(int i=0;i<arr.length;i++)
		{
			maxEnd=maxEnd+arr[i]; 
			if(maxEnd<0)
			{
				maxEnd=0;
			}
			if(maxSoFar<maxEnd)
			{
				maxSoFar=maxEnd;
			}
		}
		
		return maxSoFar;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {-2,7,1 -3, 4, -1, -2, 1, 5, -3}; // should return 12
		int maxSum=maxSumInSubArray(a);
		System.out.println(maxSum);

			
	}

}
