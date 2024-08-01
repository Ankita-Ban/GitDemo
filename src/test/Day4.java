package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4
{
	@Parameters({ "URL" })
	@Test
	public void WebLoginHomeLoan(String uname)
	{
		// Selenium
		System.out.println("Web login home personal loan");
		System.out.println(uname);
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("Mobile login home");
	}
	
	@Test(enabled=false)
	public void LoginAPIHomeLoan()
	{
		// Rest API automation
		System.out.println("API login home");
	}
}
