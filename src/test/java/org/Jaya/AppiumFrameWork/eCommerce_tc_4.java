package org.Jaya.AppiumFrameWork;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.Jaya.pageObject.android.FormPage;
import org.Jaya.pageObject.android.cartPage;
import org.Jaya.pageObject.android.productCatalogue;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.functions.ExpectedCondition;

public class eCommerce_tc_4 extends BaseTest {

	@Test(dataProvider="getdata")
	public void fillform(String name,String gender,String country) throws InterruptedException {

		Thread.sleep(3000);
		formPage.setNameField(name);
		formPage.setGender(gender);
		formPage.setCountryDropDown(country);
		productCatalogue productCatalogue = formPage.submitButton();

		productCatalogue.addItemToCart(0);
		productCatalogue.addItemToCart(0);
		cartPage cartPage = productCatalogue.goToCartPage();

		Thread.sleep(3000);

		/*
		 * WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		 * wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id(
		 * "com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
		 */

		double sum = cartPage.getProductSum();
		double displayforsum = cartPage.getTotalAmountDisplay();

		AssertJUnit.assertEquals(sum, displayforsum);
		cartPage.acceptTermAndCondition();
		cartPage.submitOrder();

	}
	
	
	  @DataProvider 
	  public Object[][] getdata() {
	  
	  
	  return new Object[][] {{"ARFAT JAYA" , "femall" , "Brazil"}}; 
	  
	  }
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
