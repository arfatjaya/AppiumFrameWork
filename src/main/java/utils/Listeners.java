package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners  implements ITestListener{
	
	ExtentReports extend=ExtendReport.report();
	ExtentTest test;
	
	  @Override
	    public void onTestStart(ITestResult result) {
	        // Code to execute when a test starts
		    test=extend.createTest(result.getMethod().getMethodName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        // Code to execute when a test succeeds
	    	
	    	test.log(Status.PASS, "Test pass");
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        // Code to execute when a test fails
	    	test.fail(result.getThrowable());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        // Code to execute when a test is skipped
	    }
	    public void onFinish(ITestResult context) {
	       // System.out.println("Test Suite Finished: " + context.getName());
	        extend.flush();
	    }

	    // Other methods from ITestListener can be overridden as needed

	}
	 




  