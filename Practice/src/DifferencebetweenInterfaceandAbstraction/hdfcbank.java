package DifferencebetweenInterfaceandAbstraction;

public class hdfcbank extends Bank {

	@Override
	public void loan() {
		// this loan method belongs to bank abstract class 
		System.out.println("hdfc load method");
	}

	public void funds()
	{
		System.out.println("hdfc funds");
	}
	
	
}
