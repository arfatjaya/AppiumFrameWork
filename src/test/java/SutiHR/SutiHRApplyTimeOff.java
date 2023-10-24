package SutiHR;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.Jaya.AppiumFrameWork.BaseTest;
import org.Jaya.pageObject.android.SutiHr.ApplyTimeOffPage;
import org.Jaya.pageObject.android.SutiHr.LoginToSutiHR;

public class SutiHRApplyTimeOff extends BaseTest {
 
	 @Test
	    public void applyTimeOffTest() throws InterruptedException {
		 LoginToSutiHR loginPage = new LoginToSutiHR(driver);
	        loginPage.login("dmoore", "test0101");

	        // Handle permission dialog here if needed
	        Thread.sleep(5000);
	        ApplyTimeOffPage timeOffPage = new ApplyTimeOffPage(driver);
	        timeOffPage.applyTimeOff();
	        

	         
	    }
	 
	
}
