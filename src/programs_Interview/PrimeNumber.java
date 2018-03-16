package programs_Interview;

public class PrimeNumber {

	public static void main(String[] args) {
		// print prime numbers between 1 and 10
		int range=100;
		int counter=0;
		int i,j;
	
		for(i=2;i<=range;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					counter=1;
					break;
				}
				else
				{
				 counter=0;	
				}
			}
			if(counter==0)
			{
				System.out.println(i);
			}
				
			}
		}
				
	}

	
