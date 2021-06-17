package Interface;

public class Testbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//USbank b= new Usbank(); will get error when we try to create obj, beocoz we cannot Instantiate or create object of interface.
		
		System.out.println(USbank.min_bal);
		
		//USbank.min_bal=300; we cannot change the value becoz variable in interface are static in nature, so we already declared 100 in usbank
		
		HSBCbank hs=new HSBCbank();
		
		hs.credit();
		hs.carloan();
		hs.debit();
		hs.educationloan();
		hs.tranfermoney();
		hs.mutualfund();
		
		
	//so we achieved dynamic polymorphism, means
	//child class object can be referred by parent interface reference variable.
	
		System.out.println("**************");
		USbank b=new HSBCbank();
		b.credit();
		b.debit();
		b.tranfermoney();
	//We cannot call carloan(), educationload(), methods becoz, onlyoverridden methods will be called. 
		//Or in other words these methods are owned by HSBC bank and cannot be access by USbank interface.
		//
	}

}
