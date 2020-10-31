package org.amaz;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Pojo extends BaseClass {
	
	public Pojo() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	@AndroidBy(xpath="//*resource id='in.amazon.mshop.android.shopping:id/sso_email']")
	private WebElement email;
	
	@AndroidBy(xpath="//*resource id='in.amazon.mshop.android.shopping:id/sso_pass']")
	
	private WebElement pass;
	
	@AndroidBy(xpath = "//resoure id='login']")
	private WebElement login;
	
	public static AndroidDriver<MobileElement> getDriver() {
		return driver;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass;
	}
	
	public WebElement getLogin() {
		return login;
	}


}
