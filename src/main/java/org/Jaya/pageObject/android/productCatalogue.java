package org.Jaya.pageObject.android;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.AndroidActions;

public class productCatalogue extends AndroidActions {

	AndroidDriver driver;
	//setting AddTocart path
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ADD TO CART']")
	
	// using list becouse elements
	private List<WebElement> addToCart;
	
	//setting cart path
	@AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
	private WebElement cart;

	public productCatalogue(AndroidDriver driver) {

		// parent class constructor call
		super(driver);

		// assign local variable driver
		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	public void addItemToCart(int index) {
		addToCart.get(index).click();

	}
	
	//go to cart
	
	public cartPage goToCartPage() throws InterruptedException 
	{
		cart.click();
		Thread.sleep(3000);
		 return new cartPage(driver);
		
	}

}




















