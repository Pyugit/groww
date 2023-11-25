package test;

import org.testng.annotations.Test;

public class grouping {
	@Test (groups={"sanity"})
	public void m()
	{
		System.out.println("test1...");
	}
	
	@Test(groups={"sanity"})
	public void m1()
	{
		System.out.println("test2...");
	}
	
	@Test(groups={"sanity"})
	public void m2()
	{
		System.out.println("test3...");
	}
	
	@Test(groups={"regression","sanity"})
	public void m3()
	{
		System.out.println("test4...");
	}
	
	@Test(groups={"regression"})
	public void m4()
	{
		System.out.println("test5...");
	}
}
