package com.core.driver.ui;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.core.driver.CoreDriver;

public class Util extends CoreDriver {

	boolean flag = false;
	public static String strError;

	public boolean isElementPresent(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (NoSuchElementException ex) {
			strError = ex.getMessage();
			return false;
		}
	}

	public boolean clickElement(WebElement element) {
		try {
			element.click();
			return true;
		} catch (NoSuchElementException ex) {
			strError = ex.getMessage();
			return false;
		}
	}

	public boolean enterText(WebElement element, String textValue) {
		try {
			element.sendKeys(textValue);
			return true;
		} catch (NoSuchElementException ex) {
			strError = ex.getMessage();
			return false;
		}
	}

	public boolean clearTextBoxEnterText(WebElement element, String textValue) {
		try {
			if (clickElement(element)) {
				element.clear();
				return enterText(element, textValue);
			} else
				return false;
		} catch (NoSuchElementException ex) {
			// TODO: handle exception
			strError = ex.getMessage();
			return false;
		}
	}
}
