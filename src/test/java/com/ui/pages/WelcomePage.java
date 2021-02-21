package com.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.core.driver.ui.Util;


public class WelcomePage {

	Util util = new Util();

	@FindBy(xpath = "//div[@class = 'EggTimer-start-content']")
	private static WebElement welcomeImage;

	@FindBy(xpath = "//input[@id = 'EggTimer-start-time-input-text']")
	private static WebElement inputTimeTextBox;

	@FindBy(xpath = "//div[@class = 'EggTimer-start-time-input']/button")
	private static WebElement timerGoButton;


	public WelcomePage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
		
	}

	public boolean verifyWelcomePage() {
		return util.isElementPresent(welcomeImage);
	}

	public boolean enterTime(String timeValue) {
		return util.clearTextBoxEnterText(inputTimeTextBox, timeValue);
	}

	public boolean clickOnTimerButton() {
		return util.clickElement(timerGoButton);
	}
}
