package javaConcepts;

public class twodimenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first[][]={{1,4,5},{7,3,2}};
		int second[][]={{20,11,10},{30},{22,30}};
		display(first);
		display(second);
		
		
		System.out.println("**************************");
		String s[][]=new String[3][5];
		System.out.println("number of rows in string "+s.length);
		System.out.println("NUmber fo columns in particular row "+s[0].length);
		s[0][0]="A";//1st row
		s[0][1]="B";
		s[0][2]="C";
		s[0][3]="D";
		s[0][4]="E";
		
		s[1][0]="A1"; //2n row
		s[1][1]="B1";
		s[1][2]="C1";
		s[1][3]="D1";
		s[1][4]="E1";
System.out.println(s[1][3]);
System.out.println(s[0][4]);
		
		
	}
	public static void display(int x[][])
	{
		for(int row=0;row<x.length;row++)
		{
			for(int col=0;col<x[row].length;col++)
			{
				System.out.println( x[row][col]+ "\t");
			}
			System.out.println();
	   }
	}
}	

