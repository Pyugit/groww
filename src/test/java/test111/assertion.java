package test111;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 
public class assertion {
	WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\piyush\\Desktop\\seleniun\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	@Test
	public void displayed()
	{
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/img"));
	    Assert.assertTrue(logo.isDisplayed());
}
	
}
