package PracticeOOPSConceptPart1;

public class wrapperlclass {
//wrappler class is datatype conversition
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="100";
		System.out.println(x+20);
		
		int i=Integer.parseInt(x);
		System.out.println(i);
	//integer, double, character, boolean--there are wrapper classes
		
		//String to double conversion
		
		String y="12.33";
		double d=Double.parseDouble(y);
		System.out.println(d);
		
		
	//String to boolean
		
		String k="true";
		Boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		
	//int to String conversion
		int j=200;
		String s=String.valueOf(j);
		System.out.println(s+20);
		
		String u="100A";
		Integer.parseInt(u);//we will get "java.lang.NumberFormatException:" as its not purely integer 
	}

}
