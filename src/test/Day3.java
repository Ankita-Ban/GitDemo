package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before executing all methods in the class");
	}
	
@Parameters({ "URL" , "APIKey/usrname"})
	@Test
	public void WebLoginCarLoan(String urlName, String key)
	{
		// Selenium
		System.out.println("Web Login");
		System.out.println(urlName);
		System.out.println(key);
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After executing all methods in the class");
	}
	
	@Test(timeOut=4000)
	public void MobileSigninCarLoan()
	{
		//Appium
		System.out.println("Mobile Sign In");
	}
	
	@BeforeMethod
	public void BfEveryMethod()
	{
		System.out.println("I will execute before every test method in Day3 class");
	}
	
	@AfterMethod
	public void AfEveryMethod()
	{
		System.out.println("I will execute after every test method in Day3 class");
	}
	
	@Test(dataProvider = "getData")
	public void MobileSignoutCarLoan(String uername, String password)
	{
		//Appium
		System.out.println("Mobile Sign Out");
		System.out.println(uername);
		System.out.println(password);
	}
	
	@BeforeSuite
	public void BfSuite()
	{
		System.out.println("I'm no 1");
	}

	@Test(dependsOnMethods= {"WebLoginCarLoan", "MobileSigninCarLoan"})
	public void LoginAPICarLoan()
	{
		// Rest API automation
		System.out.println("API Login");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		// 1st combination - username password - good credit history
		// 2nd combination - username password - no credit history
		// 3rd combination - fraudelent credit history
		Object[][] data = new Object[3][2];
		// 1st Set
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";
		// 2nd Set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		// 3rd Set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;
	}
}
