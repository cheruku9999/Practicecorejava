package PracticeOOPSConceptPart1;

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading obj=new Methodoverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10,5);
		
	}
	
//******
//Can we overload main method, yes we can overload main method, but we dont use method overloading for main method.
	public static void main(int p)
	{
		
	}
	
	public static void main(int p, int q)
	{
		
	}
	
//you cannot create a method inside a method
//duplicate methods are not allowed, means: same method name with same number of arguments are not allowed, if datatypes are also same.
	
//method overloading: When the method name is same with different arguments or input parameters within the same class
	//is called method overloading.
	public void sum()//zero input parameter
	{
		
		System.out.println("sum method zero parameters");
	}

	public void sum(int i)//1 input parameter
	{
		
		System.out.println("sum method 1 input parameter");
		System.out.println(i);
	}
	public void sum(int k, int i)//2 input parameters. This concept is called method overloading
	{
		System.out.println("two input parameters");
		System.out.println(k+i);
		
	}
	
}

