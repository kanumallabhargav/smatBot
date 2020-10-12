package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
	WebDriver driver;
	Properties prop = new Properties();

	public WebDriver driverInitialize() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\browserConfig.properties");
		prop.load(fis);
		String bName = prop.getProperty("browser");
		if(bName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(bName.equalsIgnoreCase("headlessChrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\drivers\\chromedriver.exe");
			ChromeOptions chromeOptionsObject = new ChromeOptions();
			chromeOptionsObject.addArguments("headless");
			driver = new ChromeDriver(chromeOptionsObject);
		}
		else if(bName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\main\\java\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;


	}
}
