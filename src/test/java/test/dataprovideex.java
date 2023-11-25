package test;
 
import org.testng.annotations.Test;

public class dataprovideex {
	
	@Test(dataProvider="logindataproviderr",dataProviderClass=dataprovderr.class)
	public void logintest(String email, String pass)
	{
		System.out.println(email+"   "+pass);
	}
	
	
	
	

}
