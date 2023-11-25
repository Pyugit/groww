package test111;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test11 {
	
	@BeforeTest
	public void method()
	{
		System.out.println("beforetest");
	}
	@BeforeClass
	public void method1()
	{
		System.out.println("beforeclass");
	}
	
	@BeforeMethod
	public void method2()
	{
		System.out.println("beforemethod");
	}
	@AfterClass
	public void method3()
	{
		System.out.println("afterclass");
	}
	@AfterMethod
	public void method4()
	{
		System.out.println("aftermethod");
		
	}
	@AfterTest
	public void method5()
	{
		System.out.println("aftertest");
	}
	@Test//(enabled=false)
	public void method6()
	{
		System.out.println("test6");
	}
	
	@Test// (priority=0)
	public void method7()
	{
		System.out.println("test7");
	}
	
	@Test//(dependsOnMethods= {"method9"})
	public void method8()
	{
		System.out.println("test8");
	}
	
	@Test//(invocationCount=3) //(dependsOnMethods= {"method6"})
	public void method9()
	{
		System.out.println("test9");
		//Assert.fail();
	}
	
	@Test//(invocationCount=3)
	public void method91()
	{
		System.out.println("test91");
	}
	
	@Test
	public void method92()
	{
		System.out.println("test92");
	}

}
