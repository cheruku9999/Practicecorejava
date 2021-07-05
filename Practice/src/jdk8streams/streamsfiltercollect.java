package jdk8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class streamsfiltercollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<String> productList=Arrays.asList("macbook", "iphone","shoes","batterycharger","bat");
		 
		 System.out.println(productList);
		 productList.forEach(ele->System.out.println(ele));
	
		List<String> result=productList.stream().filter(ele-> !ele.equals("shoes")).collect(Collectors.toList());
		
		// System.out.println(result);   OR
		
		//result.forEach(ele->System.out.println(ele));
		//OR
		result.forEach(System.out::println);
	}

}
