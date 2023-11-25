package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datapro {
	
	@DataProvider(name="logindataprovider")
	public Object[][] getdata()
	{
		Object[][] data= {{"abc@gmail.com","123456"},{"abffc@gmail.com","1234567"},{"dfabc@gmail.com","12345"}};
		return data;
	}
	
	@Test(dataProvider="logindataprovider")
	public void logintest(String email, String pass)
	{
		System.out.println(email+"   "+pass);
	}
}
