package testNG;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_3 {
	
	@BeforeSuite
	public void beforeSuite()
	{	
		System.out.println("I will always execute first!");		
	}
	
	@AfterSuite
	public void afterSuite()
	{	
		System.out.println("I will always execute in the last!");		
	}
	
	@Test
	public void WebCarLoan()
	{
		//Assert.assertTrue(false);
		System.out.println("Car Login through Web");
	}
	
	@Test
	public void MobileCarLoan()
	{
		System.out.println("Car Login through Mobile");
	}

	@Test
	public void MobileCarLoanLogin()
	{
		System.out.println("Car Login through Mobile");
	}

	@Test
	public void APICarLoan()
	{
		System.out.println("Car Login through API");
	}
	
	@Test(groups={"Smoke"})
	public void SmokeAPICarLoan()
	{
		System.out.println("This is Smoke Car Login through API");
	}
}
