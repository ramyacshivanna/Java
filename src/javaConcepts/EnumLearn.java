package javaConcepts;
import java.util.EnumSet;

public class EnumLearn {
	
	public enum details
	{
	nivia("abc", "25"),	
	sachitha("silent","30"),
	shalini("descent","26"),
	baby("AMrican","10"),
	bosch("French","12");
	
	private final String desc;
	private final String year;
	
	details(String Description, String Birthday)
	{
		desc=Description;
		year=Birthday;
	}
	
	public String getDescription()
	{
		return desc;
	}
	
	public String getYear()
	{
		return year;
	}
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(details people: details.values())
		{
			System.out.printf("%s\t%s\t%s\n",people,people.getDescription(),people.getYear());
			
		}
		
		System.out.println("for the range of constants\n");
		for(details range: EnumSet.range(details.sachitha, details.bosch))
		{
			System.out.printf("%s\t%s\t%s\n",range,range.getDescription(),range.getYear());
		}
	
			
	}

}
