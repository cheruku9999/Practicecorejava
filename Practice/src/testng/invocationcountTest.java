package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class invocationcountTest {

	
	@Test(invocationCount=9)//to print this output 9 times
	
	public void sum()
	{
		int a=10;
		int b=20;
		int c=a+b;
		
		System.out.println("sum=" + c);
		
	}
}
