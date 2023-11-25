package growww.pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {

	@FindBy (xpath="//div[@class='valign-wrapper dashboardTabsText']")
	private WebElement mutualfund;
	
	public home(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void mutual()
	{
		mutualfund.click();
	}
}
