package utils;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AndroidActions extends appiumUtils{
	
	AndroidDriver driver;

	
	public AndroidActions(AndroidDriver driver) {
super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
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

	public void scroscrollText(String scrollText) {

		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+scrollText+"\"));"));
	}

	public String getElementText(WebElement element) {
        return element.getText();
    }
	
	
	 public boolean isElementPresent(WebElement element) {
	        try {
	            element.isDisplayed();
	            return true;
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	    }

}
