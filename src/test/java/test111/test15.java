package test111;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test15 {
	@BeforeSuite
	public void method11()
	{
		System.out.println("BeforeSuit15");
	}
	
	@BeforeTest
	public void method()
	{
		System.out.println("beforetest15");
	}
	@BeforeClass
	public void method1()
	{
		System.out.println("beforeclass15");
	}
	
	@BeforeMethod
	public void method2()
	{
		System.out.println("beforemethod15");
	}
	@AfterClass
	public void method3()
	{
		System.out.println("afterclass15");
	}
	@AfterMethod
	public void method4()
	{
		System.out.println("aftermethod15");
		
	}
	@AfterTest
	public void method5()
	{
		System.out.println("aftertest 15");
	}
	@Test//(enabled=false)
	public void method6()
	{
		System.out.println("test6 15");
	}
	
	@Test //(priority=0)
	public void method7()
	{
		System.out.println("test7 15");
	}
	@AfterSuite
	public void method12()
	{
		System.out.println("aftersuite15");
	}
	
	
//	@Test//(dependsOnMethods= {"method9"})
//	public void method8()
//	{
//		System.out.println("test8 15");
//	}
//	
//	@Test//(invocationCount=3) //(dependsOnMethods= {"method6"})
//	public void method9()
//	{
//		System.out.println("test9 15");
//		//Assert.fail();
//	}
//	
//	@Test//(invocationCount=3)
//	public void method91()
//	{
//		System.out.println("test91 15");
//	}
//	
//	@Test
//	public void method92()
//	{
//		System.out.println("test92 15");
//	}


}
