package PracticeOOPSConceptPart1;

public class LocalVSGlobalvariables {

//String, int are Global or class variables. Becoz declared immediately after class.	
//The scope of global variables will be available through the program. But how to access.We need to create object
	//of this class
	String name="Tom";
	int age=24;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//if we want to access local variable simply we can print as showing below.
		int i=10;//local variables
		System.out.println(i);
//if we want to call global variables we need to create object as below.		
		LocalVSGlobalvariables obj= new LocalVSGlobalvariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
	}

	public void sum() {
		
		//local variables		
		int i=10;
		int j=20;
		int age=24; //we can use int age=24 becoz the scope of this variable is only within this sum method.
	}
}
