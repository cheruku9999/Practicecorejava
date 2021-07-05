package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googleTest {

	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
	System.setProperty("webdriver.gecko.driver", "C:\\Cheruku_Selenium\\geckodriver.exe");
	 driver= new FirefoxDriver();
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test(priority=1,groups="title")//we can also divide the test cases based on groups
	public void googletitletest()
	{
		
		String title=driver.getTitle();
		System.out.println(title);
		AssertJUnit.assertEquals(title, "Google","title is not matched");// Assertion is a kind of validation
	}
	
	@Test(priority=5,groups="test")
	public void test2()
	{
		
		System.out.println("test2 title");
	}
	@Test(priority=4,groups="test")
	public void test1()
	{
		
		System.out.println("testone title");
	}
	@Test(priority=3, groups="logo")
	public void googlelogo()
	{
		
		boolean b=driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		AssertJUnit.assertTrue(b);
		//OR
		AssertJUnit.assertEquals(b, true);
	}
	@Test(priority=2, groups="linktext")             //Test cases are always independent to each other
	public void googlelinktext()
	{
		
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	@AfterMethod
		public void tearDown()
	{
		driver.quit();
		
	}
}

//Interview questions: How would be execute your test cases in sequences manner. 
 //Ans: using priority key word

//To get output of test results. Refresh the project==>test-output-->index.html->righclick properties->copy url