package org.Jaya.pageObject.android;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AndroidActions;

public class cartPage extends AndroidActions{
	AndroidDriver driver;

	public cartPage(AndroidDriver driver) {

		// parent class constructor call
		super(driver);

		// assign local variable driver
		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/productPrice")
	public List<WebElement> produclist;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/totalAmountLbl")
	public  WebElement  totalAmount;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/termsButton")
	public WebElement terms;
	
	@AndroidFindBy(id = "android:id/button1")
	public WebElement acceptButton;
	

	@AndroidFindBy(id = "com.androidsample.generalstore:id/btnProceed")
	public WebElement proceed;
	
	@AndroidFindBy(className = "android.widget.CheckBox")
	public WebElement checkBox;
	
	
	public List<WebElement> getProductList() {
		return produclist;
		
	}
	
	public double getProductSum()
	{
		
		
		 int count=produclist.size(); 
		  double sum=0;
		  for (int i = 0; i < count; i++) 
		  {
		  String amount=produclist.get(i).getText(); Double
		  price=getFormatedAmount(amount); 
		  sum=sum + price;
		  }
		  return sum;
	}
	
	public double getTotalAmountDisplay()
	{
		return getFormatedAmount(totalAmount.getText());
		
	}
	public void acceptTermAndCondition() throws InterruptedException {
		checkBox.click();
		Thread.sleep(3000);
	}
	
	public Double getFormatedAmount( String amount) {
		Double price=Double.parseDouble(amount.substring(1));
		return price;
	}
	
	public void submitOrder() {
		proceed.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
