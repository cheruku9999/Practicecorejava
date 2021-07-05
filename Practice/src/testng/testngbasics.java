package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//@Beforesuite--setup system property for chrome
//@BeforeTest--launch browser
//@Beforeclass--login into app

//@Beforemthod--enter url
//@test--google title test
//@Aftermethod---logout from app

//@Beforemthod--enter url
//@test--search test
//@Aftermethod---logout from app

//@Afterclass---close browser
//@Aftertest--delete all cookies



public class testngbasics {
//pre conditions annotatoins starting with @Before
	@BeforeSuite
	public void setup()
	{
		System.out.println("@Beforesuite--setup system property for chrome");
	}
	@BeforeClass
	public void launchBrower()
	{
		System.out.println("@Beforeclass--login into app");
	}
	@BeforeTest
	public void login()
	{
		System.out.println("@BeforeTest--launch browser");
	}
	@BeforeMethod
	public void enterUrl()
	{
		System.out.println("@Beforemthod--enter url");
	}
//test cases--starting with @Test
	@Test
	public void googletitletest()
	{
		System.out.println("@test--google title test");
	}
	@Test
	public void searchtest()
	{
		System.out.println("@test--search test");
	}

//post conditions--starting with @After
	
	@AfterClass
	public void closeBrower()
	{
		System.out.println("@Afterclass---close browser");
	}
	@AfterTest
	public void deleteallcookies()
	{
		System.out.println("@Aftertest--delete all cookies");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("@Aftermethod---logout from app");
	}
	@AfterSuite
	public void generateTestReport()
	{
		System.out.println("generate test report");
	}
}
