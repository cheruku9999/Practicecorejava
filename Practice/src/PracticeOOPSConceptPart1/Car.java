package PracticeOOPSConceptPart1;


//what is class: class is a entity where we have to define number of methods and variables.
//What are methods and variables.Eg: Im name is Srinivas im a human class,my name is srinivas wht are my properties , srinivas can 
//sleep, walk play are the chractersitcs.

public class Car {
	
	//Class Variables
	
	int mod;
	int wheel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new Car() -- this is the object of Car class. OR new human()--this is the object of human class
		//a , b, c are object reference variables	 OR   naveen, ram, rajesh are object representing or regerence the human class
		// new keyword is used to create an object
		
		
        Car a= new Car();//created new object(new Car()) of car class, who is representing the object 'a' is representing
          //Human naveen= new human();		
		Car b= new Car();
		
		Car c= new Car();
		
		a.mod=222;//we have initiated class variable(mod) value to reference variable.
		a.wheel=422;
		
		b.mod=233322;
		b.wheel=422;
		
		c.mod=33622266;
		c.wheel=422;
		
		System.out.println("before assiging the reference");
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("after assiging the reference");
		
		a=b;
		b=c;
		c=a;
		a.mod=10;
		System.out.println(a.mod);//10
		c.mod=20;
		System.out.println(a.mod);//20
		System.out.println(c.mod);
	}
	}
	
