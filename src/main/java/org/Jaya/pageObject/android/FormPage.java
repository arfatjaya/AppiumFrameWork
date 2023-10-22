package org.Jaya.pageObject.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AndroidActions;

public class FormPage extends AndroidActions{

	AndroidDriver driver;

	public FormPage(AndroidDriver driver) {

		//parent class constructor call
		super(driver);
		
		//assign local variable driver
		this.driver = driver;
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
	private WebElement nameField;

	@AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Female']")
	private WebElement femaleOption;

	@AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Male']")
	private WebElement maleOption;

	@AndroidFindBy(id = "android:id/text1")
	private WebElement CountrySelection;
	
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
	private WebElement shopButton;
	
	// send key
	public void setNameField(String name) {
		nameField.sendKeys(name);
		driver.hideKeyboard();

	}

	// select gender
	public void setGender(String gender) {

		if (gender.contains("female")) {
			femaleOption.click();
		} else {
			maleOption.click();

		}
	}
	
	
	//select country from dropdown
	
	public void setCountryDropDown(String CountryName)
	{
		CountrySelection.click();
		scroscrollText(CountryName);
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+CountryName+"']")).click();
		
		
	}
	
	public productCatalogue submitButton()
	{
		
		shopButton.click();
		//create and return an instance of a class productCatalogue,
		return new productCatalogue(driver);
	}
	
	
	
	
}
