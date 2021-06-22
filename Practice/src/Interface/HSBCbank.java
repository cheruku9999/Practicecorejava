package Interface;


public class HSBCbank implements USbank,BrazilBank {//we are achieving multiple inheritance or Is-a-relationship
//If a class is implementing any Interface, then its mandatory to define/override all the methods of Interface.
	// Eg: whatever the methods in usbank interface we need to implements all those methods in hsbc bank class

	//below methods are overiding from USbank
	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("hsbc credit");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("hsbc debit");
	}

	@Override
	public void tranfermoney() {
		// TODO Auto-generated method stub
		System.out.println("hsbc tranfermoney");
	}

	//below methods are separate methods of HSBC bank
	public void educationloan()
	
	{
		System.out.println("hsbc own education loans");
		
	}
	
public void carloan()
	
	{
	System.out.println("hsbc own car loans");
		
	}

//overiding from brazil bank
@Override
public void mutualfund() {
	// TODO Auto-generated method stub
	System.out.println("hsbc mutual fund ");
}


}
