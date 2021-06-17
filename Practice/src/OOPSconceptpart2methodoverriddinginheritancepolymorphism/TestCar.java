package OOPSconceptpart2methodoverriddinginheritancepolymorphism;

public class TestCar {
//When same method is present in parent class as well in child class with same name and same number of arguments is called
	//Method Overridding.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//below is called static polymorphism or compile time polymorphism. Because at run time java compiler decides which method shuld be taken,
		//	means from parent or child class
		//Polymorphism means one to many.
		BMW b= new BMW();
		b.start();//here is the concept start method is there in parent(car class) and child(bmw class) so it will take from child class.
		           //becoz java compliler will check and tell why to take from parent while child class already inherited from parent.
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();//bmw is trying to inherit engine method which is present in grand parent class Vechicle
		
		
	System.out.println("***************");
      Car c= new Car();
      c.start();
      c.stop();
	  c.refuel();
	//	c.theftSafety(); we cannot call becoz this is belongs to BMW class which is child class.
	  //So is example where parent class cannot inherits child class.
	  System.out.println("***************");
	  
	  Car c1=new BMW();
	  //child class object can be referred by parent class reference variable. This is called dynamic or run time polymorphism
	   //this is also called top casting
	  
	  //Down Casting
	   // BMW b1=(BMW)new Car();//this is down cast, means parent object is being referred by child class reference. .
	                           // when we run we will get error called "Classcast exception". So down cast will possible but we will get error.
 //So down casting means we are degrading the cast of Parent Class(Car) to child class object and then referred by child reference variable
	    
	  c1.start();//
	  c1.stop();//
	  c1.refuel();
	  //c1.theftSafety(); cannot be access becoz bmw says we have done hardwork ln theftsatety how can you access just by creating reference.
	         //You can refer my object but cannot take my properties.
	//Only overridden methods, common methods and parent class methods will be called using dynamic polymorphism.
	  //If we want access c1.theftsatety() only by using static or compile time polymor
	}

}
