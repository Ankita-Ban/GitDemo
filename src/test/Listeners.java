package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

// ITestListener - is an interface which implements TestNG listeners
public class Listeners implements ITestListener
{
	@Override
	public void onTestSuccess(ITestResult result)
	{
		//System.out.println("I successfully executed Listeners pass code");
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		// Screenshot code
		// Response if API failed
		System.out.println("I failed executing listeners Pass code" +result.getName());
	}
}
