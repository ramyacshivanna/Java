package programs_Interview;

public class PrimeTill100 {
	public static void findPrimeNumbersFrom1To100(int n)
	{
		int i;
		int num;
		String primenumbers= "";
		for(i=1;i<=100;i++)
		{
			int counter=0;
			for(num=i;num>=1;num--)
			{				
					if((i%num)==0)
					{
						counter=counter+1;
					}							
			}
			
			if(counter==2)
			{
				primenumbers=primenumbers + i + " " ;
			}
		}
		System.out.println("Prime numbers from 1 to " + n + " are ");
		System.out.println(primenumbers);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		findPrimeNumbersFrom1To100(n);	
		System.out.println("   888888 ");
}

}
