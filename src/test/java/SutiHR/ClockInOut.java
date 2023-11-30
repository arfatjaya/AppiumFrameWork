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
import org.Jaya.pageObject.android.SutiHr.CancelApplyTimeOff;
import org.Jaya.pageObject.android.SutiHr.LoginToSutiHR;
import org.Jaya.pageObject.android.SutiHr.SimpleClockIn;

public class ClockInOut extends BaseTest {
 
	 @Test
	    public void applyTimeOffTest() throws InterruptedException {
		 LoginToSutiHR loginPage = new LoginToSutiHR(driver);
	        loginPage.login("dmoore", "test123");

	        // Handle permission dialog here if needed
	        Thread.sleep(5000);
	        SimpleClockIn cin=new SimpleClockIn(driver);
	        cin.ClockIn();
	         
	    }
	 
	
}
