package com.core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InitializeIEDriver {
	public static final String IEDRIVER_PATH = "drivers/IEDriverServer.exe";
	public WebDriver setCapability(WebDriver driver,String headless) {
		boolean setHeadless;
		if(headless.equalsIgnoreCase("Yes"))
			setHeadless = true;
		else
			setHeadless = false;
		System.setProperty("webdriver.ie.driver", IEDRIVER_PATH);
		
		//Define desired Options and Capabilities for IE
		
		driver = new InternetExplorerDriver();
		return driver;
	}


}