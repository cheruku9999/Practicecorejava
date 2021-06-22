package sampleprogramms;

public class intergercaching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//comparing 2 integer numbers(Integer Caching)--
		
		//Integer Caching range is from  -128 to 127. If we give the range -128 to 127 then only we will get equal.
	
		
		  // Integer num1 =100; // Integer num2=100;  the out put will be both are equal.
		 		
		   Integer num1= 129; // the output will be "both are not equal" becoz of integer caching. 
		   Integer num2= 129;    //num1 and num2 are auto boxed which is called interger caching.
		   
			if(num1 == num2)
			{
				System.out.println("both are equal");
			}
			else
			{
				System.out.println("both are not  equal");
			}
		}
}