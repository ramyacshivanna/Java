package programs_Interview;

public class Fibonocii {
	
	public static int fibonacci(int n)
	{
		if(n<=1)
			return n;
		return fibonacci(n-1)+fibonacci(n-2);	
	}
	
	public static void fibonacciReverseOrder(int n)
	{
		//print fibonacci series in revere order
		
		int[] a=new int[n];
		a[0]=0;
		a[1]=1;
		
		for(int i=2;i<n;i++)
		{
			a[i]=a[i-2]+a[i-1];
		}
		
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.print(a[j] + " ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println("Print fibnocii numbers ");
		
		int first=0;
		int second=1;
		int fib=0;
		System.out.print(first + " " );
		for(int i=2;i<=n;i++)
		{
			fib=first+second;
			System.out.print(fib +  " ");
			second=first;
			first=fib;
			
		}
		System.out.println();
		
		System.out.println("fibnocie sum ");
		System.out.println(fibonacci(n));
		
		System.out.println("Print fibnociee series in reverse order ");
		fibonacciReverseOrder(n);
		

	}

}
