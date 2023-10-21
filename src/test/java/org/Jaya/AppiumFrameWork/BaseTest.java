package org.Jaya.AppiumFrameWork;

import java.net.MalformedURLException;
import java.net.URL;

import org.Jaya.pageObject.android.FormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {

	public AndroidDriver driver;
	public FormPage formPage;

	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException {

		// run server auto matic

		/*
		 * AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(new
		 * File(
		 * "C:\\Users\\samqu\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"
		 * )) .withIPAddress("127.0.0.1").usingPort(4723).build();
		 */

		// service.start();

		UiAutomator2Options option = new UiAutomator2Options();
		option.setDeviceName("vivo V2151");
//	option.setDeviceName("realme narzo N55");

		// SET APP PATH-----------------------------------------------

	// option.setApp("C:\\Users\\samqu\\eclipse-workspace\\AppiumTutorial\\src\\test\\java\\Resource\\General-Store.apk");

	 	option.setApp("C:\\Users\\samqu\\git\\AppiumFrameWork\\AppiumFrameWork\\src\\test\\java\\Resource\\SutiHR.apk");

		// URL appiumServerURL = new URL("http://192.168.183.35:4723");
		URL appiumServerURL = new URL("http://127.0.0.1:4723");

		driver = new AndroidDriver(appiumServerURL, option);
		// creates an instance of a class named FormPage, passing a driver object as a
		// parameter to its constructor.
		formPage = new FormPage(driver);
	}

	// thismethod will long press

	public void longpress(WebElement ele) {

		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "duration", 2000));

	}

	// this method will keep on scrole based enad of page
	public void scrollToEnd() {

		boolean canScrollMore;
		do {
			canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap
					.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", "down", "percent", 3.0));
		} while (canScrollMore);

	}
	// This gesture performs swipe gesture on the given element/area.

	public void swipeGesture(WebElement ele, String direction) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",
				((RemoteWebElement) ele).getId(), "direction", direction, "percent", 0.75));

	}

	public void scroll(String scrollText) {

		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + scrollText + "\"));"));
	}

	public Double getFormatedAmount(String amount) {

		Double price = Double.parseDouble(amount.substring(1));
		return price;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}