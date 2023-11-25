package org.Jaya.pageObject.android.SutiHr;

import org.Jaya.pageObject.android.productCatalogue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AndroidActions;

public class LoginToSutiHR extends AndroidActions{

	AndroidDriver driver;

	public LoginToSutiHR(AndroidDriver driver) {

		//parent class constructor call
		super(driver);
		
		//assign local variable driver
		this.driver = driver;
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}


    

    @FindBy(id = "com.SutiSoft.sutihr:id/usrid")
    private WebElement usernameField;

    @FindBy(id = "com.SutiSoft.sutihr:id/pwd")
    private WebElement passwordField;

    @FindBy(id = "com.SutiSoft.sutihr:id/chkRememberPwd")
    private WebElement rememberPwdCheckbox;

    @FindBy(id = "com.SutiSoft.sutihr:id/logInButton")
    private WebElement loginButton;

    
    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    private WebElement permission;
    
    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    private WebElement LocationPermission;
    
    
  
  
    public void login(String username, String password) throws InterruptedException {
        usernameField.sendKeys(username);
        driver.hideKeyboard();
        passwordField.sendKeys(password);
        rememberPwdCheckbox.click();
        loginButton.click();
        Thread.sleep(8000);
        LocationPermission.click();
        Thread.sleep(8000);
        permission.click();
        Thread.sleep(5000);
       
    }
	
	
	
}
