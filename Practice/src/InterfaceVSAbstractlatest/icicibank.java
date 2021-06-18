package InterfaceVSAbstractlatest;
                                               //*************
public class icicibank implements USBank,RBI { //a particular class can implements multiple interfaces
	//rbi interface
	
	@Override
	public void educationloan() {
		// TODO Auto-generated method stub
		System.out.println("icici education loan");
	}

	@Override
	public void homeloan() {
		// TODO Auto-generated method stub
		System.out.println("icici home loan");
	}

	@Override
	public void carloan() {
		// TODO Auto-generated method stub
		System.out.println("icici car loan");
	}
//us bank interface
	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("icici debit");
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("icici credit");
	}

	@Override
	public void transfermoney() {
		// TODO Auto-generated method stub
		System.out.println("icici transfer money");
	}

	@Override
	public void trading() {
		// TODO Auto-generated method stub
		System.out.println("icici trading");
	}

	//ICICI bank own methods
	
	public void mutualfunds()
	{
		System.out.println("icici mutual funds");
		
	}
	public void insurance()
	{
		System.out.println("icici insurance");
		
	}
}
