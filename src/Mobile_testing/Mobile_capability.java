package Mobile_testing;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.reporters.jq.Main;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AppiumCommandExecutor;
import io.appium.java_client.remote.MobileCapabilityType;

public class Mobile_capability extends Base_Class{
	public Mobile_capability() throws MalformedURLException {
		super();
	}

	@Test
	public void calculted() throws InterruptedException {
	WebElement  nine=driver.findElement(By.id("com.android.calculator2:id/digit_9"));
		WebElement  five=driver.findElement(By.id("com.android.calculator2:id/digit_5"));
		WebElement  plus=driver.findElement(By.id("com.android.calculator2:id/op_add"));
		WebElement  equals=driver.findElement(By.id("com.android.calculator2:id/eq"));
		WebElement  Result=driver.findElement(By.id("com.android.calculator2:id/result"));
    	nine.click();
		Thread.sleep(2000);   // static waits or hard waits
	 
		five.click();
		Thread.sleep(2000);
		plus.click();
		Thread.sleep(2000);
		nine.click();
	Thread.sleep(2000);
	five.click();
		equals.click();
	SoftAssert sp=new SoftAssert();
		sp.assertEquals("190", "190");
		sp.assertAll();
  System.out.println("thi is done");
  
		
		
}
} 









