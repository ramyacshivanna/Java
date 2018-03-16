package LearnInheritance;

public class TestCar {
	public static int var=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static/compile time polymorphism. Method overloading is happening in child class(same method name is again getting implemented in child class
		Bmw b=new Bmw();
		b.start();
		b.stop();
		b.refuel();
		b.safety();
		b.engine();
		System.out.println(var);
      Car c=new Car();
      c.start();
      
      //top casting
      Car d=new Bmw(); //Child class object can be referred by parent class. Dynamic/run time polymorphism
      d.start();
      d.stop();
      d.refuel();   
     
      
      //down casting is not allowed in Java. It gives a run time error //ClassCastException
      Bmw n=(Bmw) new Car();
      
  	}

}
