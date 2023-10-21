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

	/*
	 * @Test public void login() throws InterruptedException { // No need to use
	 * Thread.sleep for static waits, use WebDriverWait instead WebDriverWait wait =
	 * new WebDriverWait(driver, Duration.ofSeconds(10));
	 * 
	 * wait.until(ExpectedConditions.presenceOfElementLocated(By.id(
	 * "com.SutiSoft.sutihr:id/usrid"))) .sendKeys("dmoore");
	 * 
	 * // Hide keyboard driver.hideKeyboard();
	 * 
	 * driver.findElement(By.id("com.SutiSoft.sutihr:id/pwd")).sendKeys("test0101");
	 * driver.findElement(By.id("com.SutiSoft.sutihr:id/chkRememberPwd")).click();
	 * 
	 * driver.findElement(By.id("com.SutiSoft.sutihr:id/logInButton")).click();
	 * 
	 * // Wait for permission dialog and click allow
	 * wait.until(ExpectedConditions.presenceOfElementLocated(By.id(
	 * "com.android.permissioncontroller:id/permission_allow_button"))) .click();
	 * 
	 * // Apply timeoff WebElement clockInLayout =
	 * wait.until(ExpectedConditions.presenceOfElementLocated(By.id(
	 * "com.SutiSoft.sutihr:id/timeOffLayout"))); clockInLayout.click();
	 * 
	 * // Select time off type WebElement submitButton =
	 * wait.until(ExpectedConditions.elementToBeClickable(By.
	 * xpath("//android.widget.RadioButton[contains(@text, 'Maternity')]")));
	 * submitButton.click();
	 * 
	 * driver.findElement(By.id("com.SutiSoft.sutihr:id/okbtn")).click();
	 * 
	 * // Select from date WebElement fromDateButton =
	 * wait.until(ExpectedConditions.presenceOfElementLocated(By.id(
	 * "com.SutiSoft.sutihr:id/fromDate"))); fromDateButton.click(); WebElement
	 * fromDateSelect = wait.until(ExpectedConditions.elementToBeClickable(By.
	 * xpath("//android.view.View[@content-desc='09 October 2023']")));
	 * fromDateSelect.click();
	 * driver.findElement(By.id("android:id/button1")).click();
	 * 
	 * // Select to date WebElement toDateButton =
	 * wait.until(ExpectedConditions.presenceOfElementLocated(By.id(
	 * "com.SutiSoft.sutihr:id/toDate"))); toDateButton.click(); WebElement
	 * toDateSelect = wait.until(ExpectedConditions.elementToBeClickable(By.
	 * xpath("//android.view.View[@content-desc='09 October 2023']")));
	 * toDateSelect.click();
	 * driver.findElement(By.id("android:id/button1")).click();
	 * 
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Save
	 * the time off request
	 * driver.findElement(By.id("com.SutiSoft.sutihr:id/save")).click(); }
	 */
	
	
	
	
	
	
	
	
	
	
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
