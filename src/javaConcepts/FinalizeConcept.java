package javaConcepts;

public class FinalizeConcept {
	
	public void Finalize()
	{
		System.out.println("****---finalize method ---**");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeConcept f1=new FinalizeConcept();
		FinalizeConcept f2=new FinalizeConcept();
		//garbage collections: It destroys the unused objects. When there is no object reference, automatically it will be called. 
		f1=null;
		f2=null;
		//f1.Finalize();
		System.gc();//it calls garbage collector method. To free the memory.
		
		
	}

}
