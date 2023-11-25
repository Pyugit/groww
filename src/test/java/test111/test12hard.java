package test111;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import growww.pageobj.home;
import growww.pageobj.login;

public class test12hard {
	
	WebDriver driver;
    login log;
    home hom;
	@BeforeTest
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\piyush\\Desktop\\seleniun\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@BeforeClass
	public void launchgrow()
	{
		driver.get("https://groww.in/login");
		driver.manage().window().maximize();
		log=new login(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@BeforeMethod
	public void launchhome()
	{
		log.mail("pyshbhyr@gmail.com");
		log.cont();
		log.pass("haa");
        log.submit();
		log.pin("9","5","1","2");	
		hom=new home(driver);
	}
	@Test
	public void launchmutual()
	{
		hom.mutual();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"ttps://groww.in/mutual-funds/user/explore");//it will fail dont execute following script-hard assertion
		String ttl=driver.getTitle();
		System.out.println(ttl);
		Assert.assertEquals(ttl,"Mutual Funds Online: Explore/Invest in Direct Mutual Funds on Groww");
		Assert.assertTrue(true);
		Assert.assertFalse(false);
	}
	
	@AfterMethod
	
	public void close()
	{
		driver.close();
	}
	


}
