package org.Jaya.pageObject.android.SutiHr;

import java.time.Duration;

import org.Jaya.pageObject.android.productCatalogue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AndroidActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleClockOut extends AndroidActions {

	AndroidDriver driver;
	  WebDriverWait wait;

	public SimpleClockOut(AndroidDriver driver) {

		// parent class constructor call
		super(driver);

		// assign local variable driver
		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@FindBy(id = "com.SutiSoft.sutihr:id/clockOutLayout")
	private WebElement ClockOutButton;
	
	@FindBy(id = "com.SutiSoft.sutihr:id/clockInLayout")
	private WebElement ClockInButton;

	@FindBy(id = "android:id/button1")
	private WebElement GPSSettingButton;

	@FindBy(id = "android:id/switch_widget")
	private WebElement OnGps;

	@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Back\"]")
	private WebElement BackButton;

	@FindBy(id = "android:id/message")
	private WebElement AlertTextUnVerifiedLoactionAlert;

	@FindBy(id = "android:id/message")
	private WebElement UnVerifiedLoactionAlert;

	@FindBy(id = "android:id/button1")
	private WebElement OkButton;

	@FindBy(id = "com.SutiSoft.sutihr:id/continueButton")
	private WebElement Continu;
	
	@FindBy(id = "com.SutiSoft.sutihr:id/overrideButton")
	private WebElement oContinu;
	
	@FindBy(id = "android:id/alertTitle")
	private WebElement SucessAlert;
	
	 
	
	
	
	public void ClockIn() {
		try {

			if (isElementPresent(ClockInButton)) {
				
				 wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				wait.until(ExpectedConditions.elementToBeClickable(ClockInButton)).click();
				wait.until(ExpectedConditions.elementToBeClickable(Continu)).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				if (isElementPresent(GPSSettingButton)) {
					wait.until(ExpectedConditions.elementToBeClickable(GPSSettingButton)).click();

					wait.until(ExpectedConditions.elementToBeClickable(OnGps)).click();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
					wait.until(ExpectedConditions.elementToBeClickable(BackButton)).click();
					wait.until(ExpectedConditions.elementToBeClickable(ClockInButton)).click();
					wait.until(ExpectedConditions.elementToBeClickable(Continu)).click();
					

				}
				

				else if (isElementPresent(UnVerifiedLoactionAlert)) {

					String expectedText = "It seems you are trying to Clock In from an unverified location. Please Clock In from a verified location.";
					String holidayAlertText = new AndroidActions(driver)
							.getElementText(AlertTextUnVerifiedLoactionAlert);
					AssertJUnit.assertEquals(expectedText, holidayAlertText);
					wait.until(ExpectedConditions.elementToBeClickable(OkButton)).click();
				}
				
	}
			 
			 

		} catch (Exception e) {
			e.printStackTrace(); // Handle the exception as per your requirement
		}
	}


}
