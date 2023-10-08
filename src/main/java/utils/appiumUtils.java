package utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.utils.FileUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class appiumUtils {
	AppiumDriver driver;

	public appiumUtils(AndroidDriver driver) {

		
		// assign local variable driver
		this.driver = driver;

		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	
	
	public Double getFormatedAmount(String amount) {

		Double price = Double.parseDouble(amount.substring(1));
		return price;
	}
	public void waitForElementToAppear(WebElement ele) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		 wait.until(ExpectedConditions.attributeContains((ele), "text", "Cart"));
		
	}
	
	public String getScreenShot(String testCaseName,AppiumDriver driver) throws IOException {
		
		File source=driver.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir") +"\\reports"+testCaseName+".png";
		FileUtils.copyFile(source, new File(destination));
		 return destination;
		

}
}
