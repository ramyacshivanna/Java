package programs_Interview;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,4,5};
		int a1[]={-1,0,1,2,4,5};
		//1+2+4+5=12;
		//1+2+3+4+5=15;
		//15-12=3;
			
		int sum=0;
		//for(int i=0;i<a.length;i++)
		for(int i=0;i<a1.length;i++)
		{
			sum=sum+a1[i];
		}
		System.out.println("Sum is : " + sum);
		
		int sum1=0;
		//for(int j=1;j<=5;j++)
			for(int j=-1;j<=5;j++)
		{
			sum1=sum1+j;
			
		}
		System.out.println("sum of values from 1 to 5 is value: " + sum1);
		System.out.println("Missing Number is: " + (sum1-sum));
	}
	

}
