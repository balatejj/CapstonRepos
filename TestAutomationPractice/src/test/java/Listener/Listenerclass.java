package Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerclass implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Testing Started");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test case Skipped");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test case success");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test case Failed");
	}

}









