package Constructors;

public class constructorconcept {
	
	
	
	public static void main(String[] args) {
	//how to call constructor? Ans: The movement you create object of the particular class	construnctor will be called.
		
		constructorconcept obj= new constructorconcept();//this is default constructor. The default constructor is hidden constructor.
		                                                 //means
		constructorconcept obj1= new constructorconcept(56);
		constructorconcept obj2= new constructorconcept(34,89);
	}

	//Can we overload constructor?
	//Yes we can overload constructor, and below are examples.
	
	
	  public constructorconcept()//default constructor y default becoz no  parameters.
	  { 
		  System.out.println("default const"); 
		  }
	  
	  public constructorconcept(int i)//single parameter constructor(these are constructor overloading) 
	  {
		  System.out.println("single value const");
	  System.out.println("the value of i  " + i);
	  }
	  
	  public constructorconcept(int i, int j)//2 params parameter constructor  (these are constructor overloading)
	  {
	  System.out.println("double value const");
	  System.out.println("the value of i  " + i);
	  System.out.println("the value of j  " + j); 
	  }
	 
}
//constructor is, it executes a block of code whenever an object is created.
//constructor will not return values unlike methods.
//constructors are not a methods.
//there will no return type for constructors.
//name of constructor should be the class name only.	
		//duplicate constructors are not allowed.
//If there are no constructors.
               //Then always remember that,  the hidden constructor which is called default constructor will be called.
                //And when we run, the output will be shown blank in the console.

//whenever you create object a constructor is called in java
	//eventhough we donot define any constructor, compiler will called default or implicit constructor	
//**** if we do not define any contructor jave compliler think there is no contructor and it picks or hit implecit
//contructor. And if we define any of the constructor then java will not hits creates implicit contructor
