package com.smatbot.qa_automation.smatBot;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.SS1_pageObjects;
import utilities.Base;
import utilities.urlRetriever;

public class SS1_billPayment_schedule extends Base
{
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@Test
	public void SS1_positiveAction() throws IOException, InterruptedException
	{
		//Open the driver
		driver = driverInitialize();
		driver.get(urlRetriever.getSmatBotHome_url());
		
		//Initialize a WebDriverWait object
		WebDriverWait wait = new WebDriverWait(driver, 30);

		//Create an object to access pageObjects
		SS1_pageObjects objects = new SS1_pageObjects(driver);

		//Switch to the required frame
		wait.until(objects.getWaitLocator());

		wait.until(objects.getlanguegeSelectWait());
		objects.clickOnEnglish();

		wait.until(objects.getPayBillWait());
		objects.clickOnPayBill();

		wait.until(objects.getElectricityBillWait());
		objects.clickOnElectricityBill();

		wait.until(objects.getDateWait());
		objects.clickOnDateButton();

		wait.until(objects.getTimeWait());
		objects.clickOnTimeButton();
	}
}
