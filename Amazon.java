package org.amaz;

import java.awt.event.KeyEvent;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.util.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;

public class Amazon extends BaseClass {
	static AndroidDriver<WebElement> driver;
public static void main(String[] args) {
AppLaunch();
	URL u= new URL("http://0.0.0.0:4723");
	Pojo p = new pojo();
	fill.(p.getEmail(),"nkr@gmail.com");
	fill.(p.getPass(),"njli89");
	KeyEvent k= new KeyEvent.(AndroidKey.ENTER);
	driver.pressKey(k);
	
	MobileElement fin=driver.findElement(By.xpath("//*resource-id='in.amazon.mshop.android.shopping:id/rs_search_src_text']"));
	fin.sendKeys("smart lcd tv");
	driver.pressKey(k);
	Assert.assertTrue("65 inch tv",true);
	MobileElement find  = driver.findElement(By.xpath("//*[starts-with(text(),=65 inch tv"));
	scrollDown();
find.click();
driver.rotation();
	driver.quit();
	

	
}
}
