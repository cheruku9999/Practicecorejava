package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class testngfeatures {

	@Test
	public void loginTest() {
		System.out.println("logintest");
		int i=9/0; //We are failing loginTest to check whether homepagetest is executing or not
		
//scenario where logintest method fails then there is no use of home page execution. So there is a feature "dependsonMethods"
	}
	@Test(dependsOnMethods="loginTest")//So homepageTest method will execute only once loginTest method passes.
	                                     //We need to exact method name(loginTest) for dependsOnMethods
	public void homepageTest() {
		System.out.println("home page test");
	}
	@Test
	public void searchpageTest() {
		System.out.println("searchpage test");
	}
}
