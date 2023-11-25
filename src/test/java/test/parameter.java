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

public class parameter {

WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser","url"})
	
	void launchbrowser(String browser,String app)
	{
	
	if(browser.contains("edge"))
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\piyush\\Desktop\\New folder (2)\\msedgedriver.exe");
		driver=new EdgeDriver();
		 
	}
	else if(browser.contains("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\piyush\\Desktop\\seleniun\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	driver.get(app);
	
	}
 	@Test
	void displayed()
	{
//		WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']"));
//	    Assert.assertTrue(logo.isDisplayed());
 		System.out.println("hello");
}
// 	@AfterMethod
// 	void close()
// 	{
// 		driver.close();
// 	}
}
