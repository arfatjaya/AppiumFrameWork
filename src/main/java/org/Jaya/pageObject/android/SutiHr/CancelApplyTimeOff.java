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

public class CancelApplyTimeOff extends AndroidActions {

	AndroidDriver driver;

	public CancelApplyTimeOff(AndroidDriver driver) {

		//parent class constructor call
		super(driver);
		
		//assign local variable driver
		this.driver = driver;
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}


    
	@FindBy(id = "com.SutiSoft.sutihr:id/navigationMenuImageView")
    private WebElement Menu;

    @FindBy(xpath = "//android.widget.TextView[@text='Time Off']")
    private WebElement timeoff;

    @FindBy(id = "com.SutiSoft.sutihr:id/okbtn")
    private WebElement okButton;

    @FindBy(id = "com.SutiSoft.sutihr:id/fromDate")
    private WebElement fromDateButton;

    @FindBy(xpath = "//android.view.View[@content-desc='09 October 2023']")
    private WebElement fromDateSelect;
    
    @FindBy(id = "android:id/button1")
    private WebElement SelectDateOkButton;

    @FindBy(id = "com.SutiSoft.sutihr:id/toDate")
    private WebElement toDateButton;

    @FindBy(id = "com.SutiSoft.sutihr:id/save")
    private WebElement saveButton;
    
    @FindBy(id = "android:id/message")
    private WebElement Holidayalert;
    
   
    
    
    
    public void CancelApplYTimeoff() {
        try {
        	
        	if(isElementPresent(Menu))
        	{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            
            wait.until(ExpectedConditions.elementToBeClickable(Menu)).click();
            if(isElementPresent(timeoff))
        	{
            
            wait.until(ExpectedConditions.elementToBeClickable(timeoff)).click();
             
            
             
        	}
            }
        } catch (Exception e) {
            e.printStackTrace(); // Handle the exception as per your requirement
        }
    }

	
     
	
	
	
}
