package exceptionhandling;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//1.try-catch block:
		
		try
		{
			int i=9/0;
		}
		catch(Exception e)
		//catch(Throwable e)//Any error or exception will be coming it will be handled by throwable class.
		                  //It is the super class of all errors and exceptions in java language.
		              //imp question: What is the super class of errors and exceptions. Ans: Throwable
		//what is the super class of Throwable, the answer is object
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("ABC");
	}

}
