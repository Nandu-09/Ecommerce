package org.amaz;

import java.awt.Dimension;
import java.awt.Point;
import java.time.Duration;

import org.Info.AndroidDriver;
import org.Info.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BaseClass {
	
	public static io.appium.java_client.android.AndroidDriver<io.appium.java_client.MobileElement> driver;
	public static void AppLaunch() {
		// TODO Auto-generated method stub
DesiredCapabilities cp = new DesiredCapabilities();
cp.setCapability("deviceName","oneplus6 ");
cp.setCapability("platformName","Android ");
cp.setCapability("platformVersion","10 ");
cp.setCapability("appPackage","in.amazon.mshop.android.shopping");
cp.setCapability("appActivity","com.amazon.mshop.home.HomeActivity");

driver= new AndroidDriver<MobilElement>(new U("Http://0.0.0.0:4723",cp));

public static void fill(WebElement e, String s) {
e.sendKeys(s);	
}

public static void btnclick(WebElement e) {
	e.click();
}
	public static void scrollDown() {
	Dimension size=	driver.manage().window().getSize();
		Double s= size.getHeight()* 0.5;
		Double e= size.getHeight()* 0.2;
		int start =s.intValue();
		int end= s.intValue();
		
		TouchActions acc= new TouchActions(driver);
		acc.press(PointOption.point(0,start)).WaitAction(WaitOptions.waitOptions(Duration.ofMinutes(start)f))
		.moveTo(PointOption.point(0,end)).release().perform();
	}
}
	}

}
