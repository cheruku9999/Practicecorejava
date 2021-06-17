package PracticeOOPSConceptPart1;

public class FunctionsinJava {
//*************
	//main method: is starting point of execution 
	//we never write return statemnetn in main method
	//why main method is void, becoz we never write return statement in main method.
	//methods are called only from main method.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionsinJava obj=new FunctionsinJava();
//one object will be created  "obj" is the reference variable,referring to this object.		
//after creating the object, the copy of all "non static" methods will be given to this object. But not main method 
	//becoz it is static, the object cannot hold for static methods.
//it is mandotory to create object to call non static methods.
		
		obj.test(); //in other words, naveen plz walk(test()), plz run(pqr()), etc....
		int l=obj.pqr();//pqr method returns c value and we are giving to l.
		System.out.println(l);
		
		String S1=obj.QA();
		System.out.println(S1);
		
		int div=obj.division(30, 10);
		System.out.println(div);
		
		
	}
		//non static methods
		
		public void test()//void means doestnot return any value
		//return type is void
		{
			System.out.println("test method");
		}
		
		public int pqr()//return type is int
		{
			System.out.println("this is pqr method");
			
			int a=10;
			int b=20;
			int c=a+b;
			
			return c;
			
		}
		
		public String QA()
		{
			System.out.println("qa method");
			String s="Selenium";
			
			return s;
			
		}
		
		public int division(int x, int y)//x,y are input parameters or input arguments
		{
			System.out.println("division method");
			
			int d=x/y;
			return d;
			
			
		}
	}


