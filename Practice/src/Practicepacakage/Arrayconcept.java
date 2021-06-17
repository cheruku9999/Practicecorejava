package Practicepacakage;

public class Arrayconcept {
//disadvantage of array
 //size if fixed:static array. To overcome this problem we use collections --dynamic array--Arraylist	
	//it stores only similar data types: To overcome from this problem , we use object array.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i[]= new int[4];
		
		i[0]=1;
		i[1]=23;
		i[2]=45;
		i[3]=34;
		
		System.out.println(i[3]); 
		
		int j[]=new int[6];
		j[0]=23;
		j[1]=43;
		j[2]=213;
		j[3]=143;
		j[4]=231;
		j[5]=493;
		
		
		for(int k=0; k<j.length;k++)
		//System.out.println(j[k]);
		System.out.println(j.length);
				
		
		
		
	}

}
