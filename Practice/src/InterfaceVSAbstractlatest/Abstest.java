package InterfaceVSAbstractlatest;

public class Abstest extends Absshape {

	Abstest()
	
	{
		System.out.println("Abstest constuctor--child class constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Absshape s= new Abstest(); //cannot create object of abstract class, but we can reference to the child class object.
//		
//		s.drawing();
//		s.fill();
		
		Abstest ab=new Abstest();
				
		
	}

	@Override
	void drawing() {
		// TODO Auto-generated method stub
		System.out.println("test drawing");
	}

}

//whenever a constructor of abstract class is created it will called when the object of child class is created.

