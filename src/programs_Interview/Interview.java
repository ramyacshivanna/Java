package programs_Interview;

abstract class MyClass{
   public void disp(){
     System.out.println("Concrete method of parent class");
   }
   abstract public void disp2();
}

class Interview extends MyClass{
   /* Must Override this method while extending
    * MyClas
    */
   public void disp2()
   {
       System.out.println("overriding abstract method");
   }
   public static void main(String args[]){
       Interview obj = new Interview();
       obj.disp();
   }
}

