package PracticeOOPSConceptPart1;

public class staticandnonstaticconcept {
//global variables: the scope of global variables will be avaliable across all the functions with some conditions.

	String name="Tom";//non static global variable
	static int age=25; //static global variable
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//how to call static methods and variables
		
		//Methods
		//1. direct calling
		sum();
		
		//2. Calling by classname
	    
		staticandnonstaticconcept.sum();
		
		//Variables
		
		System.out.println(age);
		System.out.println(staticandnonstaticconcept.age);
		
	//how to call non static methods and variable
		
		//methods
		staticandnonstaticconcept obj=new staticandnonstaticconcept();
		obj.sendMail();
		
		//Variables
		
		System.out.println(obj.name);
		
//question: Can i access static methods by using object reference?
//Ans: Yes i can access, but how? 
		
		obj.sum();// warning will be given
		
		
		
	}

	public void sendMail()//non static method
	{
		System.out.println("send email method");
	}
	
	public static void sum()
	{
		System.out.println("sum method");
	}
	}

