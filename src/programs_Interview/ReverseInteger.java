package programs_Interview;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num=1242;
		long  rev=0;

		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
System.out.println(rev);
	
	
	// Using string buffer
long num1=76543;
System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}

}
