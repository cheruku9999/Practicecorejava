package Practicepacakage;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] =new int[3];//this is static array and size is fixed
		
		
		//Dynamic array: Arraylist
		//Can contain duplicate values/elements
		//Maintains insertion order
		//Synchronized
		//Allows random access to fetch the element becoz the values on the basis of indexes.
		
		ArrayList ar= new ArrayList();// this is non generic
		
				ar.add(100);
				ar.add(200);
				ar.add(300);
				ar.add("tom");
				ar.add("john");
				ar.add("Jack");
				
				
				ar.remove(0);//to remove
				System.out.println(ar.size());
				
				System.out.println(ar.get(4));
				
		//to print all the values of arraylist		
				
		for(int i=0; i<ar.size(); i++)		
		{
			System.out.println(ar.get(i));
		}	
			
//to add only integer values
		ArrayList<Integer> ar1= new ArrayList<Integer>();// this is called generic 
		ar1.add(199);
		//ar1.add("tom"); not allowed as we given Integer as generic
		
		ArrayList<String> ar2= new ArrayList<String>();
		ar2.add("199");
		
	}

}
