package DifferencebetweenInterfaceandAbstraction;

public class TestBankclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hdfcbank hb= new hdfcbank();
		
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();
		
		 Bank b= new hdfcbank();//dynamic polymorphism. b is reference of bank class
          b.credit();
          b.debit();
          b.loan();
}
}
//Abstraction means hiding the implementation.Eg:Bank abstract class has abstract method.So hdfc bank class will implements the abstract
//method with extends keyword.
//So the logic is hdfc bank will implements its own abstract method body. Like hdfc own interest rate, additional benefits etc.