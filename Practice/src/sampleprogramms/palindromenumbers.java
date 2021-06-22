package sampleprogramms;

public class palindromenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		palidrome(181);
	}

	public static void palidrome(int num)//writing static method
	{
		int r=0;
		int sum=0;
		int t;
		 t=num;
		while(num>0)
		{
		   r= num%10; //to get the remainder. Eg: we given 151%10-->15*10=150 so num value is 150 now, and remainder is 1
		   sum= (sum*10)+r;
		   num= num/10;// here we are dividing num with 10, hence 150/10=15.
		}
		if(t==sum)
		{
			System.out.println("this is palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
	
}
