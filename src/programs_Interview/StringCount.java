package programs_Interview;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aaabbccd";
		int count = 0;
		char temp = input.charAt(0);
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==temp)
				{
				count++;
			    //System.out.println(" count " + count);
				}
			    
			else
			{
				System.out.print(temp+""+count);
				count = 1;
				temp = input.charAt(i);
			}
		}
		System.out.print(temp+""+count);

	}

}
