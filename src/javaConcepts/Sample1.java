package javaConcepts;

public class Sample1 {

	
		  public int i; // This is Non Static variable
		  
		  static 
		  {
		    System.out.println("This is static block");
		  }
		  
		  {
		    System.out.println("This is ananuymous block");
		  }
		  

		  Sample1() 
		  {
			  
		    System.out.println("This is constructor");
		  }
		  
		 
		 static void method() 
		  {
			 
		    System.out.println("This is method");
		  }
		 
		 {
			    System.out.println("This is ananuymous block2");
		 }
		 
		
		  class AnotherClass 
			{
			  
			}
		
		public static void main(String[] args) 
		{//Always static blocks will be executed first and anonymous block will be executed next(if no statement comes before it)
			// TODO Auto-generated method stub
			System.out.println("Hello world");
			Sample1 obj1=new Sample1();
			method(); // static method can be called witout instantiating an object of the class
			obj1.method();
			
					
	}

}
