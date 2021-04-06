
package com.appian.robot.core.template;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DataProcess {

	// private String keywordCol;
	// private String locatorTypeCol;
	// private String locatorValueCol;
	// private String parameterCol;
	//
	// public DataProcess(String keyCol, String locTypeCol,String
	// locValueCol,String paramCol){
	// keywordCol = keyCol;
	// locatorTypeCol=locTypeCol;
	// locatorValueCol=locValueCol;
	// parameterCol=paramCol;
	// }
	//
	private By getElementLocator(String keyword, String locatorType, String locatorValue) {

		switch (locatorType) {
		case "className":
			return By.className(locatorValue);
		case "id":
			return By.id(locatorValue);
		case "cssSelector":
			return By.cssSelector(locatorValue);
		case "xpath":
			return By.xpath(locatorValue);
		default:
			return By.id(locatorValue);
		}
	}

	/**
	 * 
	 * @param driver
	 * @param keyword
	 * @param locatorType
	 * @param locatorValue
	 * @param param
	 * @author Anil
	 */
	public void performAction(WebDriver driver, String keyword, String locatorType, String locatorValue, String param) {

		switch (keyword) {

		case "openBrowser":
			driver.get(param);
			break;
		case "click":
			driver.findElement(By.xpath(locatorValue)).click();
			break;
		case "sendKeys":
			driver.findElement(getElementLocator(keyword, locatorType, locatorValue)).sendKeys(param);
			break;
		case "sendKeyss":
			driver.findElement(getElementLocator(keyword, locatorType, locatorValue)).sendKeys(param);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "selectComoboxValue":
			driver.findElement(By.xpath(locatorValue)).click();
			break;
		case "clearTextAnilsBox":
			driver.findElement(By.xpath(locatorValue)).clear();
			break;
		case "selectMultiValue":
			driver.findElement(By.xpath(locatorValue)).click();
			break;
		case "scrollPageDown":
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			break;

		}

	}

}
