package sampleprogramms;

public class primenumbers {  
	
	//2 is the lowest prime number. 1 is not prime number
	//negative numbers are not consider as prime numbers
	public static boolean isPrimenumber(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2; i<num;i++)//since 2 is the lowest prime number
		{
			
			if(num % i==0)  //% means modules, that is the remainder is zero.
				return false;
		}
		return true;
	}
	
//To know how many prime numbers are there for a given number
	
	public static void primelist(int numm)
	{
		 System.out.println("The prime numbers are:");
		for(int i=2;i<=numm;i++)	
		{
			if(isPrimenumber(i)) //we are calling primenumber method directly here.
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.out.println("12 is prime:"  + isPrimenumber(12)); //calling method, since it is static method we are directly calling the class name.
		
	primelist(10);
		
	}

	
}
