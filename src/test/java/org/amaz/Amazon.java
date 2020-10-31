package org.amaz;

import java.awt.event.KeyEvent;


import io.appium.java_client.android.nativekey.AndroidKey;

public class Amazon extends BaseClass {
	static AndroidDriver<WebElement> driver;
public static void main(String[] args) {
AppLaunch();
	URL u= new URL("http://0.0.0.0:4723");
	Pojo p = new pojo();
	fill.(p.getEmail(),"nkr@gmail.com");
	fill.(p.getPass(),"njli89");
	KeyEvent k= new KeyEvent(AndroidKey.ENTER);
	btnclick.click();
	

	
}
}
