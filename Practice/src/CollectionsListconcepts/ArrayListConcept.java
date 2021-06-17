package CollectionsListconcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] =new int[3];//this is static array and size is fixed
		
		
		//Dynamic array: Arraylist
		//Can contain duplicate values/elements
		//Maintains insertion order
		//Synchronized
		//Allows random access to fetch the element becoz the values on the basis of indexes.
		
		ArrayList ar= new ArrayList();// this is non generic, we havent defined any thing means whether interger or string values. 
		                                 //So we will get warining this is called non generic.
		
				ar.add(100);
				ar.add(200);
				ar.add(300);
				ar.add("tom");
				ar.add("john");
				ar.add("Jack");
				
				
				ar.remove(0);//to remove
				System.out.println(ar.size());//size of array
				
				System.out.println(ar.get(4));//to get value of the index
				
		//to print all the values of arraylist		
				//1.for loop
				//2.using iterator
				
		for(int i=0; i<ar.size(); i++)		
		{
			System.out.println(ar.get(i));
		}	
			
	
		
		
//Generic 
		ArrayList<Integer> ar1= new ArrayList<Integer>();// this is called generic 
		ar1.add(199);
		//ar1.add("tom"); not allowed as we given Integer as generic
		
		ArrayList<String> ar2= new ArrayList<String>();
		ar2.add("199");
		ar2.add("selenium");
		
//If we are not sure what data type we will use, then we need to declare as below
		ArrayList<E> ar3= new ArrayList<E>();
		
	//Now creating Employee class objects
		Employee e1= new Employee("Naveen", 29, "QA");//Employee is constructor which we created
		Employee e2= new Employee("Tom", 39, "Dev");
		Employee e3= new Employee("Peter", 26, "Admin");
	
		
		//***	very important interview question
		//how to store the specific user define class object in this particular arraylist		
		//create arraylist
		
		ArrayList<Employee> ar4= new ArrayList<Employee>();//we need to define genrics. As we cannot store integers, we need to store
		                                                  //employee objects which are combination of string and integers. 
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		
		//iterator to traverse the values
		
		//
		
	Iterator<Employee> it=ar4.iterator();
		while(it.hasNext())
		{
			Employee emp= it.next();
			
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
	

	
	System.out.println("*************");
	
	//addAll()--will merge 2 array lists
ArrayList<String> ar5= new ArrayList<String>();
         ar5.add("testone");
         ar5.add("testtwo");
         ar5.add("testthree");
         
         ArrayList<String> ar6= new ArrayList<String>();//we are adding values to ar5
         ar5.add("test4");
         ar5.add("test5");
         ar5.add("test6");
         
        ar5.addAll(ar6);

for(int i=0;i<ar5.size();i++)
{
	System.out.println(ar5.get(i));
}
//remove all
ar5.removeAll(ar6);
for(int i=0;i<ar5.size();i++)
{
	System.out.println(ar5.get(i));
}

//retainAll---will display the common value
System.out.println("*************");

ArrayList<String> ar7= new ArrayList<String>();
ar7.add("testing");
ar7.add("Testingone");
ar7.add("Testingtwo");

ArrayList<String> ar8= new ArrayList<String>();
ar8.add("testing");
ar8.add("Testingon");
ar8.add("Testingtw");

//ar7.addAll(ar8);
ar7.retainAll(ar8);
 for(int i=0;i<ar7.size();i++)
 {
	 System.out.println(ar7.get(i));
 }
 System.out.println("*************");
 
 
 
}
}
