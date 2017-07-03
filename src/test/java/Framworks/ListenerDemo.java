package Framworks;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//to implement the ITestListener interface
//this class name should be included in the testng.xml 

public class ListenerDemo implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("TestCase started====" +result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCase success====" +result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("TestCase Failed====" +result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
