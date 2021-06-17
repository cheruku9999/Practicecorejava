package CollectionsListconcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Link list is a class ed is silent
		LinkedList<String> ll= new LinkedList<String>();//we defined genrics(String)
		
		ll.add("test");
		ll.add("QTPtest");
		ll.add("Selenium test");
		ll.add("Java test");
		ll.add("Security test");
		ll.add("RFTtest");
		
		System.out.println("contents of linked list" + ll);
		//add first operation
		ll.addFirst("cheruku");
		
		//add last opertion
		ll.addLast("automation");
		System.out.println("contents of linked list" + ll);
		
		//get
		System.out.println(ll.get(0));
		
		//set
		
		ll.set(1, "Tom");
		
		System.out.println(ll.get(1));
		
		//remove first and last
		System.out.println("***********");
		ll.removeFirst();
		ll.removeLast();
		System.out.println("contents of linked list" + ll);
		
		ll.remove(2);
		
		System.out.println("contents of linked list" + ll);
		
		//how to iterate or print all the values of linkedlist
		
		//for loop
		System.out.println("using for loop******************");
		for(int n=0; n<ll.size();n++)
			
		{
			System.out.println(ll.get(n));
		}
		//advanced for loop or also called for each loop
		System.out.println("using advance for loop******************");
		
		for(String str :ll)
			System.out.println(str);
		
		System.out.println();
		//iterator
		System.out.println("using iterator******************");
		Iterator<String> it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//while loop
		System.out.println("using while loop******************");
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num++;
		}
		
	}

	
	
	
}
