package javaConcepts;

public class StaticVariable {

	static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable obj=new StaticVariable();
		obj.method1();
		obj.method2();
		//System.exit(i=0); it will not allow the further execution of steps.
		obj.method3();
		obj.method1();
	    }
	public void method1()
	{
		System.out.println(i);
		i++;

		System.out.println(i);
	}
	public void method2()
	{
		i++;
		System.out.println(i);
		
	}
	public void method3()
	{
		i++;
		System.out.println(i);
		
		
	}

}
