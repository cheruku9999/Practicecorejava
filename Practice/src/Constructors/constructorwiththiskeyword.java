package Constructors;

public class constructorwiththiskeyword {

	//class or global variables
	//String name1;
	String name;
	int age;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorwiththiskeyword obj= new constructorwiththiskeyword("tom", 43);
		
	}

	public constructorwiththiskeyword(String name, int age)//constructors always points to current state of object.
	{
		this.name=name;//means we are initializing local variable to global variable with "this" keyword
		this.age=age;//this keyword is use to initialize the class variables
		
	//if we give different name then its fine for eg:
		//name1=name;
		
		System.out.println(name);
		System.out.println(age);
	}
	
}

