package javaConcepts;

public class CallByValueAndCallByReference {

	int p;
	int q;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValueAndCallByReference obj=new CallByValueAndCallByReference();
		obj.p=50;
		obj.q=20;
		System.out.println(obj.AddSum(10, 20));
		obj.Swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);

	}
	
	public int AddSum(int x, int y)
	{
		int z=x+y;
		return z;
	}
	
	public void Swap(CallByValueAndCallByReference t)
	{
		int temp;
		temp=t.p;
		p=t.q;
		q=temp;
	}

}
