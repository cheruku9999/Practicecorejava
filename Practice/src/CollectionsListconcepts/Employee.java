package CollectionsListconcepts;

public class Employee {

	String name;
	int age;
	String dept;
//Creating constructor, constructor is always class name	
	Employee(String name, int age, String dept)//constructor the global variables(name, age, dept) and variables within constructors 
	{                                          //are different.
	//To initialize the global variable values to the local variable, we use "this" keyword. 
	 //If global variable and local variable names are are same we use this keyword.
	this.name=name; //this.name is global variable.
	this.age= age;
	this.dept=dept;
	
	
		
	}
}
