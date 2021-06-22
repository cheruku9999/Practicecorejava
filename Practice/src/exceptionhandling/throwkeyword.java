package exceptionhandling;

public class throwkeyword {//if deliberately we want to throw the exception we use throw

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ABC");
		
		try {
			throw new Exception("Srinivas exception");//throws should be always declare in try and catch blocsk.
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		String Exec_Flag="";
		if(Exec_Flag.equals(""))
			try {
				throw new Exception("Exec flag is blank exception");//throws should be always declare in try and catch blocsk.
				}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		System.out.println("PQR");
	}

}
