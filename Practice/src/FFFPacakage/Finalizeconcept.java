package FFFPacakage;

public class Finalizeconcept { //Finalize is a method
//Finalize: This is a method which is used to perform the clean up the memory. Where objects have no references.
	public void finalize()//Just before the garbage collector, automatically it will called to clean up process.
	{
		System.out.println("finalize method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Finalizeconcept f1= new Finalizeconcept();
		Finalizeconcept f2= new Finalizeconcept();
		
		f1=null;
		f2=null;
		
		System.gc();//is used to clean the garbage collector. To free some space inside the memory.
		            //To do manually we use this method.
		
	}
	

}
