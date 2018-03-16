package programs_Interview;

public class PrintPatterns {

	//print simple pyramid of stars
	public static void pyramidStar(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
	
	//Print simple pyramid of starts after 180 degree rotation
	public static void pyramidStar180(int n)
	{
		int k=2*n-2;
		int j;
		for(int i=0;i<n;i++)
		{
			for(j=0;j<k;j++)
			{
				System.out.print(" ");
			}
			k=k-2;
			
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	//Print stars in triangle shape
	public static void startsTriangle(int n)
	{
		int k=2*n-2;
		int j;
		for(int i=0;i<n;i++)
		{
			for(j=0;j<k;j++)
			{
				System.out.print(" ");
			}
			k=k-1;
			
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//Print numbers in pyramid structure starting from one in each line
	public static void numbersPyramidFrom1(int n)
	{
		int j;
		for(int i=0;i<n;i++)
		{  
			int num=1;
						
			for(j=0;j<=i;j++)
			{
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
	
	//Print numbers in pyramid structure without re assigning
	public static void numbersPyramidNoReassign(int n)
	{
		int j;
		int num=1;
		for(int i=0;i<n;i++)
		{  
									
			for(j=0;j<=i;j++)
			{
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print simple pyramid of starts");
		pyramidStar(5);
		
		System.out.println("Print simple pyramid of starts after 180 degree rotation");
		pyramidStar180(5);
		
		System.out.println("Print stars in triangle shape");
		startsTriangle(5);
		
		System.out.println("Print numbers in pyramid structure starting from one in each line");
		numbersPyramidFrom1(5);
		
		System.out.println("Print numbers in pyramid structure without re assigning");
		numbersPyramidNoReassign(5);
		
	}

}
