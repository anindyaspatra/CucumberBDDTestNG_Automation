package com.core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InitializeChromeDriver {
	private static final String CHROMEDRIVER_PATH = "drivers/chromedriver.exe";
	public WebDriver setCapability(WebDriver driver, String headless) {
		boolean setHeadless;
		if(headless.equalsIgnoreCase("Yes"))
			setHeadless = true;
		else
			setHeadless = false;
		System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH);
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(setHeadless);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		driver = new ChromeDriver(options);
		return driver;
	}

}
