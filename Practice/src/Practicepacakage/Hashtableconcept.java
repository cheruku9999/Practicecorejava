package Practicepacakage;

import java.util.Hashtable;

public class Hashtableconcept {
//this is also a collection a dynamic array
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable h= new Hashtable();
		h.put("A", "Test");//in hastbale we have key and value, unlike index in array
		h.put("B","testone");
		h.put("C","testtwo");
		
			
		h.put(1,100);
		h.put(2,200);
		h.put(3,300);
		
		h.put(3,"Tesing");
		System.out.println(h.size());
		System.out.println(h.get(1));
		System.out.println(h.get("A"));
		
		Hashtable<Integer,Integer> h1= new Hashtable<Integer,Integer>();
		
		h1.put(11, 1999);
		//h1.put("a", 100); we will get error
		
		Hashtable<Integer,String> h2= new Hashtable<Integer,String>();
		
		h2.put(21, "atest");
	}

}
