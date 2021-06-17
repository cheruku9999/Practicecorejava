package PracticeOOPSConceptPart1;

public class CallbyValandcallbyRef {
 int p;
 int q;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallbyValandcallbyRef obj= new CallbyValandcallbyRef();
		int x=30;
		int y=60;
		System.out.println(obj.Sum(x,y));//copy of 30, 60 will be given to a, b
		                                 //this is called call by value or pass by value
		
		obj.p=50;
		obj.q=60;
		obj.swap(obj);
		
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
public int Sum(int a, int b)
{
	a=50;
	b=20;
	int c=a+b;
	return c;
}
//call by reference, means we are passing value of object reference.


public void swap(CallbyValandcallbyRef t)//now obj and t is referring to the object CallbyValandcallbyRef
{
	int temp;
	temp=t.p;//temp=50
	t.p=t.q;//t.q=60
	t.q=temp;//t.p=50
	
	
}

	
}

