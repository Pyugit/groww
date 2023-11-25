package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class para2 {

WebDriver driver;
	
	@Test
	@Parameters("browser")
	
	void launchbrowser(String browser)
	{
	
	if(browser.contains("edge"))
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\piyush\\Desktop\\New folder (2)\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");

		 
	}
	else if(browser.contains("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\piyush\\Desktop\\seleniun\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	
	}
}	