package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1
{
	@AfterTest
	public void LastExecution()
	{
		System.out.println("I will execute last");
	}
	// Can define multiple tests from single class
	@Test
	public void Demo()
	{
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("I'm the first from the bottom");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("Hello");
		System.out.println("Bye");
		System.out.println("Helloo");
		System.out.println("Byee");
	}
}
