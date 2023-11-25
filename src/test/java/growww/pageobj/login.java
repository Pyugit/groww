package growww.pageobj;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	@FindBy (xpath="//input[@type='text']")
	private WebElement email;
	@FindBy (xpath="(//div[@class='absolute-center btn51ParentDimension'])[1]")
	private WebElement continu;
	@FindBy (xpath="//input[@id='login_password1']")
	private WebElement pass;
	
	@FindBy (xpath="//div[@class='absolute-center btn51ParentDimension']")
	private WebElement sub;
	@FindBy (xpath="//input[@type='number']")
	private List <WebElement> pin;
	
	public login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void mail(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void cont()
	{
		continu.click();
	}
	
	public void pass(String paas)
	{
		pass.sendKeys("Pyuved@07");
	}
	
	public void submit()
	{
		sub.click();
	}
	public void pin(String a,String b,String c,String d)
	{
		pin.get(0).sendKeys("8");
		pin.get(1).sendKeys("5");
		pin.get(2).sendKeys("2");
		pin.get(3).sendKeys("0");
	}

}
