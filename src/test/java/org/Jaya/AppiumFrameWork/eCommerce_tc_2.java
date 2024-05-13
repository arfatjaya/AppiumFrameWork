package org.Jaya.AppiumFrameWork;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.functions.ExpectedCondition;

public class eCommerce_tc_2 extends BaseTest {
	

	
	/*
	 * @BeforeMethod public void pre() { Activity activity=new Activity("", "");
	 * driver.startActivity(activity); }
	 */
	
	@Test
	public void fillformError() throws InterruptedException {
		Thread.sleep(3000);
	//	 driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("ArfatJayay");
		// hide key board
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Brazil\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Brazil']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
	String toast=	driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
	Assert.assertEquals(toast, "Please enter your name");
		Thread.sleep(2000);

	}
	/*
	 * @Test public void fillform() throws InterruptedException {
	 * Thread.sleep(3000);
	 * driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).
	 * sendKeys("ArfatJayay"); //hide key board driver.hideKeyboard();
	 * driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).
	 * click(); driver.findElement(By.id("android:id/text1")).click();
	 * driver.findElement( AppiumBy.
	 * androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Brazil\"));"
	 * ));
	 * driver.findElement(By.xpath("//android.widget.TextView[@text='Brazil']")).
	 * click();
	 * driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).
	 * click(); Thread.sleep(2000);
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 */

}
