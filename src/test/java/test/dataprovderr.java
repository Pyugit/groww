package test;

import org.testng.annotations.DataProvider;

public class dataprovderr {
	@DataProvider(name="logindataproviderr")
	public Object[][] getdata()
	{
		Object[][] data= {{"abc@gmail.com","123456"},{"abffc@gmail.com","1234567"},{"dfabc@gmail.com","12345"}};
		return data;
	}

}
