package groww.tc;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import growww.pageobj.home;
import growww.pageobj.login;



public class testgrow {

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
		log.pin("7","3","1","9");	
		hom=new home(driver);
	}
	@Test
	public void launchmutual()
	{
		hom.mutual();
		String url=driver.getCurrentUrl();
		if(url.contains("mutual"))
			System.out.println("passed");
		else
			System.out.println("failed");
		
	}
	
	@AfterMethod
	
	public void close()
	{
		//driver.close();
	}
	
	
	
}
