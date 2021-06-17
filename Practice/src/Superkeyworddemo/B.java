package Superkeyworddemo;

public class B extends A {
	
	public B()
	{
		super(); //if we do not writer super keyword in constructor, by defalut constructor will be called.
		         //if we pass no value parent default class constructor will be called
		
	}
	public B(int i)//calling the parent class parameterized constructor
	{
		
		super(i);
		
	}
//To call all other constructors in parent class then we need to create another constructor in child class as below.
	public B(int i, int j)
	{
		super(i,j);
			
	}
	
	public static void main(String[] args) {
		
		
		B obj= new B();
		B obj1=new B(20);
		B obj2=new B(30, 40);
	}
	}

//super keyword is used to called a parent class constructor.
//If we don't write super keyword by default the default constructor will be called.
//if we pass single value single value parameter will be called.
//super keyword must be always return in child class constructor.
//it should be the first statement. It cannot be the second or last statement in the constructor.
//in constructor there should be only one super keyword.