package programs_Interview;

public class RemoveAnagram {

	static int remAnagram(String str1, String str2)
    {
        // make hash array for both string 
        // and calculate frequency of each
        // character
		int count1[]=new int[26];
		int count2[]=new int[26];
		int result=0;
		
 
        // count frequency of each charcter 
        // in first string
		for(int i=0;i<str1.length();i++)
		{
			System.out.println(str1.charAt(i) - 'a');
			count1[str1.charAt(i) - 'a']++;
		}
        
        
        System.out.println(" ************* ");
        // count frequency of each charcter 
        // in second string
        for(int j=0;j<str2.length();j++)
        {
        	System.out.println(str2.charAt(j) - 'a');
        	count2[str2.charAt(j) - 'a']++;
        }
        
 
        System.out.println(" ***************** ");
        // traverse count arrays to find 
        // number of characters to be removed
        for(int i=0;i<26;i++)
        {
        	result= result+ Math.abs(count1[i] - count2[i]);
        }
        
        return result;    
    
    }
	
 
    // 
    public static void main(String[] args)
    {
    	//Find out number of chracters to be removed to make an 2 strings to be anagram
        String str1 = "bcadeh", str2 = "hea";
        System.out.println(remAnagram(str1, str2));
    }
}
