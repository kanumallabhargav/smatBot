package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.Base;

public class SS1_pageObjects extends Base
{
	WebDriver driver;
	
	private String baseFrameName = "myFrame";
	private ExpectedCondition<WebDriver> waitLocator = ExpectedConditions.frameToBeAvailableAndSwitchToIt(baseFrameName);
	
	private By languageSelect = By.xpath("/html/body/div[4]/div[2]/div/button[1]");
	private ExpectedCondition<WebElement> languageSelectWait = ExpectedConditions.elementToBeClickable(languageSelect);
	
	private By payBillButton = By.xpath("//*[@id='avatar-scroll']/div[1]");
	private ExpectedCondition<WebElement> payBillWait = ExpectedConditions.visibilityOfElementLocated(payBillButton);
	
	private By electricityBillButton = By.xpath("/html/body/div[4]/div[2]/div[4]/div[2]/div/div[1]");
	private ExpectedCondition<WebElement> electricityBillWait = ExpectedConditions.elementToBeClickable(payBillButton);
	
	private By dateButton = By.xpath("/html/body/div[4]/div[3]/div/div/table/tbody/tr[5]/td[4]/button");
	private ExpectedCondition<WebElement> dateWait = ExpectedConditions.elementToBeClickable(dateButton);
	
	private By timeButton = By.xpath("/html/body/div[4]/div[3]/div[2]/div/label[6]");
	private ExpectedCondition<WebElement> timeWait = ExpectedConditions.elementToBeClickable(timeButton);
	
	public SS1_pageObjects(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public ExpectedCondition<WebDriver> getWaitLocator()
	{
		return waitLocator;
	}
	
	
	public void clickOnEnglish()
	{
		driver.findElement(languageSelect).click();
	}
	public ExpectedCondition<WebElement> getlanguegeSelectWait()
	{
		return languageSelectWait;
	}
	
	public ExpectedCondition<WebElement> getPayBillWait()
	{
		return payBillWait;
	}
	public void clickOnPayBill()
	{
		driver.findElement(payBillButton).click();
	}
	
	public ExpectedCondition<WebElement> getElectricityBillWait()
	{
		return electricityBillWait;
	}
	public void clickOnElectricityBill()
	{
		driver.findElement(electricityBillButton).click();
	}
	
	public ExpectedCondition<WebElement> getDateWait()
	{
		return dateWait;
	}
	public void clickOnDateButton()
	{
		driver.findElement(dateButton).click();
	}
	
	public ExpectedCondition<WebElement> getTimeWait()
	{
		return timeWait;
	}
	public void clickOnTimeButton()
	{
		driver.findElement(timeButton).click();
	}
}
