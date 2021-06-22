package exceptionhandling;

public class throwskeyword {//jvm will except this exception, means jvm will handle the exception

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		throwskeyword obj= new throwskeyword();
		obj.sum();
		System.out.println("ABC");
	}

	 public void sum()
	 {
		 try {
		 div();
		 }
		 catch(ArithmeticException e)
		 {
			 
		 }
		 }
	 
	 
	 public void div() throws ArithmeticException
	 {
		 
		 int i=9/0;
	 }
}
