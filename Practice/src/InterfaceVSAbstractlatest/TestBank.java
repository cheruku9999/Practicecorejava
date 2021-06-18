package InterfaceVSAbstractlatest;

public class TestBank {
	
	TestBank()//child class constructor
	{
		System.out.println("Test class constructor");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		icicibank ic= new icicibank();
		
		ic.carloan();
		ic.credit();
		ic.debit();
		ic.educationloan();
		ic.homeloan();
		ic.insurance();
		ic.mutualfunds();
		ic.transfermoney();
		ic.trading();
		
		//to call the static variable which is there in usbank interface
		
		System.out.println(RBI.min_bal);//static variables are called by class names.
		
		USBank us=new icicibank();//We cannot create object of interface, but we can create reference of interface. Which can refer 
		                             //to child class objects. This concept is called dynamic polymorphism.
		
		us.credit();
		us.debit();
		us.trading();
		us.transfermoney();
	}

}
