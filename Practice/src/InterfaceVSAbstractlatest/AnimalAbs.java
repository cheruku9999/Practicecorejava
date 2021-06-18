package InterfaceVSAbstractlatest;

public abstract class AnimalAbs {

	//This is example of 0% abstraction, becoz there is no abstract method.
	//public final void eat()-If we put final keyword, then we cannot override this method in child class.
	public  void eat()
	
	{
		System.out.println("Animal ...eat");
		
	}

}
