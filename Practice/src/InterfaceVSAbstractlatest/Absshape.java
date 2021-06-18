package InterfaceVSAbstractlatest;

public abstract class Absshape {

	Absshape()
	{
		System.out.println("Absshape constuctor--abstract class constrctor");//we can create constructors in abstract class. But not in Interface.
		
	}
	int color;
	
	abstract void drawing(); //abstract method
	
	public void fill()         //non abstract method
	{
		System.out.println("shape fill");
	}
	
}
//cannot create the object of Abstract