package sampleprogramms;

public class Factorialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(factorial(9));
		System.out.println(fact(5));
		
	}
//1. Without recursive --use for loop
	public static int factorial(int num)
	{
		int fact=1;
	
		for(int i=1;i<=num;i++)
		{
			
			fact=fact*i;//
		}
		
			return fact;
			
		
	}
	
	//2. With reursive function: Means a function is calling itself.
	public static int fact(int num)
	{
		if(num==0)
			return 1;
		else
			return(num* fact(num-1));
			
	}
	
}
