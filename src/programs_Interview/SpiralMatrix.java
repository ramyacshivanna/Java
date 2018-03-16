package programs_Interview;

public class SpiralMatrix {
	
	public void printSpiral(int[][] arr,int row, int col)
	{
		int i=0; //iterator
		int row_start=0;
		int row_end=row;
		
		int col_start=0;
		int col_end=col;
		
		//print first row
		while(row_start<row_end && col_start<col_end)
		{
			for(i=col_start;i<col_end;++i)
			{	
			 System.out.print(arr[row_start][i] + " ");
			}
			row_start++;
			
			//print last column
			for(i=row_start;i<row_end;++i)
			{
				System.out.print(arr[i][col_end-1] + " ");
			}
			col_end--;
			
			//print last row from remaining rows
			
			if(row_start < row_end)
			{
				for(i=col_end-1;i>=1;--i)
				{
					System.out.print(arr[row_end-1][i] + " ");
				}
				row_end--;
			}
			
			if(col_start < col_end)
			{
				for(i=row_end-1;i>=1;--i)
				{
					System.out.print(arr[i][col_start] + " ");
				}
				col_start++;
			}
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row=3;
		int col=6;
		int[][] arr={ {1,  2,  3,  4,  5,  6},
                	  {7,  8,  9,  10, 11, 12},
                	  {13, 14, 15, 16, 17, 18},
                	  };
		int r=arr.length;
		System.out.println(r);
		int c=arr[0].length;
		System.out.println(c);
		
		SpiralMatrix sm=new SpiralMatrix();
		sm.printSpiral(arr, r, c);
		
		}

}
