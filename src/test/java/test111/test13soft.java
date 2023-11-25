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
import org.testng.asserts.SoftAssert;

import growww.pageobj.home;
import growww.pageobj.login;

public class test13soft {
	
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
		SoftAssert sort=new SoftAssert();
		String url=driver.getCurrentUrl();
		sort.assertEquals(url,"ttps://groww.in/mutual-funds/user/explore");//it may fail will but following code execute-soft assert
		String ttl=driver.getTitle();
		System.out.println(ttl);
		sort.assertEquals(ttl,"Mutual Funds Online: Explore/Invest in Direct Mutual Funds on Groww");
		sort.assertTrue(true);
		sort.assertFalse(false);
		sort.assertAll();//This method only available in softAssert. This is used to combine the result
		                //of all assertion present in the test method
	}
	
	@AfterMethod
	
	public void close()
	{
		driver.close();
	}
	


}
