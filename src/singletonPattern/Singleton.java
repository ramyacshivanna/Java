package singletonPattern;

public class Singleton {
	//make constructor as private
	//write a static method that has return type of object of this singleton class(Lazy Initialization).
	private static Singleton singleton_instance=null;
	
	public String str;
	private Singleton()
	{
		str="I am learning singleton class and using in my project";
		System.out.println("constructor");
	}
	
	public static Singleton getInstance()
	{
		if(singleton_instance==null)
		{
			singleton_instance=new Singleton();
		}
		return singleton_instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Singleton class can have only single instantiate of an object. 
		//If we try to create similar object, it will call the first object.
		Singleton x=getInstance();
		Singleton y=getInstance();
		Singleton z=getInstance();
		
		String str=x.str;
		System.out.println(str);
		
		//Singleton s=new Singleton();
		//Singleton s2=new Singleton();
	}

}
