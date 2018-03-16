package javaConcepts;

public class Time {
	
	private int hour;
	private int min;
	private int sec;
	
	public void set(int h, int m, int s)
	{
		hour=((h>=0 & h<24)? h: 0);
		min=((m>=0 & m<60) ? m : 0);
		sec=((s>=0 & s<60)? s: 0 );
		/*
		 this.hour=h;
		 this.min=m;
		 this.sec=s;
		 */
	}
	
	public String toMilitary()
	{
		return String.format("%02d:%02d:%02d",hour,min,sec);
	}
	
	public String toString()
	{
		return String.format("%d:%02d:%02d %s",((hour==0||hour==12)?12:hour%12),min,sec,((hour<12)? "AM":"PM"));	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Time t=new Time();
		System.out.println(t.toMilitary());
		System.out.println(t.toString());
		
		t.set(23, 16, 59);
		System.out.println(t.toMilitary());
		System.out.println(t.toString());
		
		
		
	}

}
