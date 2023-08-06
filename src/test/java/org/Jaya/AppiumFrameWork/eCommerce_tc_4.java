package org.Jaya.AppiumFrameWork;

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

	@Test
	public void fillform() throws InterruptedException {

		Thread.sleep(3000);
		formPage.setNameField("Arfat jaya");
		formPage.setGender("female");
		formPage.setCountryDropDown("Brazil");
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

		Assert.assertEquals(sum, displayforsum);
		cartPage.acceptTermAndCondition();
		cartPage.submitOrder();

	}

}
