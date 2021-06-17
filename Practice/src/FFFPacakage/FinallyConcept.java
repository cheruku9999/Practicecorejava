package FFFPacakage;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // testone();
       //testtwo();
       division();
       
	}

	public static void testone()
	
	{
		try {
			System.out.println("inside testone method");
			 throw new RuntimeException("test");
		}
		catch(Exception e)
		{
			System.out.println("inside catch block");
		}
//Finally is a block
		finally//its always executed after try catch block. Means its always associated with try and catch block.
		       //No matter exception is coming or not, Finally block will be executed after every try catch blocks.
	//Eg: In database connectivity , if cannot able to connect or cannot retrieve data.We must close the connection, so in that case
		//we write in close connection method in finally block.
		{
			System.out.println("inside finally block");
		}
	}
	public static void testtwo()
	{
		try {
			System.out.println("inside testone method");
			 
		}
		
		finally
		{
			System.out.println("finally code in test2 method");
		}
		
		
	}
	public static void division()
	
	{
		int i=10;
		try {
			
			System.out.println("inside try block");
			int k=i/0;
		}
//*****very important interview question:
	//We know we will get arithmetic exception if any number is divided by zero. So if we change the exception to null pointer exception?
		//Then the output:1)It will execute try block. 2)Throws arthimetic exception error. 3)Execute Finally block.
	//Output.	
/*inside try block
execute this code even after any exception
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at FFFPacakage.FinallyConcept.division(FinallyConcept.java:51)
	at FFFPacakage.FinallyConcept.main(FinallyConcept.java:9)
*/		
	 //catch(NullPointerException e)
		catch(ArithmeticException e )
		{
			System.out.println("inside catch block");
			System.out.println("divide by zero error");
		}
		finally
		{
			System.out.println("execute this code even after any exception");
		}
	}
}
