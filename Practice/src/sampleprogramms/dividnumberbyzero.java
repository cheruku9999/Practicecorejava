package sampleprogramms;

public class dividnumberbyzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(9.0/0); //output is infinity
		System.out.println(12.33f/0);
	    System.out.println(19.0/0);
		System.out.println(19.0/0);
		System.out.println(9.99990/0);
		System.out.println(0/0); //output will be Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println(0.0/0);
		System.out.println(0.0/0.0); 
	}

}
//When we divide inter by zero then only we will get arithmetic exception error