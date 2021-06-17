package Interface;

public interface USbank {
//Interface means: we can achieve multiple inheritance it means a child class can implements multiple interfaces. 
//But in inheritance a child class can inherit only one parent class.
	
	
	int min_bal=100;
	
	public void credit();
	public void debit();
	public void tranfermoney();
	
//No main method declaration	
//only method declaration
//no method body or only method prototype
//in interface, we can declare variables. Variables are by default static in nature
//Variables values will not be changed, its final/constant in nature
//No static methods in interface
//Interfaces are abstract in nature or Instantiate , means we cannot create object of interface.
	
}
