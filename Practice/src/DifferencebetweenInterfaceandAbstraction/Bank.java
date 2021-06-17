package DifferencebetweenInterfaceandAbstraction;

//this is called partial abstraction means:

//through abstract class we are not achieving 100% abstraction.
//i.e loan() method is abstract in nature, but credit(), debit() methods are common for all the child classes.
//no need to define these methods in side the child classes we can directly inherit


//So in bank class we have one abstract and 2 non abstract methods so its called partial abstraction.
public abstract class Bank {

	public abstract void loan();//abstract method---no method body
	
	//these are called non abstract methods
	public void credit()
	{
		System.out.println("bank credit");
		
	}
		public void debit()
		{
			System.out.println("bank debit");
		}
	
}

//Hiding the implementation logic is called Abstraction
//giving abstract keyword the class becomes abstract class
//In abstract class atleast one method should be there which is Abstract in nature.
//Now what is Abstract method: 
 //Only prototype means only method declaration, no method body.
//Abstract class can have abstract methods and non abstract methods. Which is called abstraction.
