package sampleprogramms;

public class armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Means the sum of cubes of given number should be equal
		//Eg: 153->1*1*1=1; 5*5*5=125; 3*3*3=27; Sum total: 1+125+27=153
//		armstrongnumber am= new armstrongnumber();
//		am.IsArmstrong(153);
		IsArmstrong(153);
	}

	public static void IsArmstrong(int num)
	{
		int t=num;
		int r=0;
		int cube=0;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		if(t==cube)
		{
			System.out.println("this is armstrong");
			}
		else
			System.out.println("not a armstrong");
	}
}
