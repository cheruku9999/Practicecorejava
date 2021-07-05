package sampleprogramms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class duplicateelementsinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String infra[]= {"amazon", "azure","microsoft", "amazon", "alibaba", "GCP","microsoft", "GCP"};
		
	//brute force method
		
		for(int i=0;i<infra.length;i++)
		{
			for(int j=i+1;j<infra.length;j++)//we are adding j=i+1 becoz we are comparing 1st index with 2nd index
				                               //i.e "amazon" with "azure" so what we both are same then there is duplicate.
				
				if(infra[i].equals(infra[j]))
					System.out.println(infra[i]);
		}
	

	//Hash set: The property of hash set is it cannot store the duplicate values.
	
	Set<String> data= new HashSet<String>(); //Set is an interface, Hashset is class object we created
	
	//advance for loop.To explain all the values of infra variable will go to "e"
	for(String e:infra)
	{
		if(data.add(e)==false)// so when the duplicate values will come it will restrict and print in ouput
		{
			System.out.println(e);
		}
	}
	
	//Hash Map: stores the values in the format of key and value
	
	//Map<String, Integer> infraMap = new Hashmap 
	//Little complicated

	//Using Streams set and filters
	
	//String infra[]= {"amazon", "azure","microsoft", "amazon", "alibaba", "GCP","microsoft", "GCP"};	
	 System.out.println("Streams********");
	    Set<String>dataset= new HashSet<String>();
	    
	     Set<String> dupset= Arrays.asList(infra).stream().filter(e->!dataset.add(e)).collect(Collectors.toSet());
	System.out.println(dupset);
	
//Streams using frequency
	
	 List<String> list= Arrays.asList(infra);
	 Set<String> elslist= list.stream().filter(e-> Collections.frequency(list,e)>1).collect(Collectors.toSet());
	 
	 System.out.println(elslist);
}
}