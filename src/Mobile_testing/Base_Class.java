package Mobile_testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base_Class {
	static AppiumDriver driver;
	public Base_Class() throws MalformedURLException {
		DesiredCapabilities  cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator");    
		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554"); 
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); 
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0"); 
		cap.setCapability("appPakage", "com.android.calculator2");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");

		URL  url=new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AppiumDriver(url,cap);    
		System.out.println("IT is STARTED...."); 
	
	 
	
		
		
	
	}





}
