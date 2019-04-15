package testNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TestNG {
	
	@BeforeTest		// Will execute first before all the test
	public void prerequisite(){
		
		System.out.println("I will execute first before all the test!!");
	}
	
	@AfterTest		//Will execute in the last after all the test
	public void lastexecute(){
		
		System.out.println("I will execute in the last after all the test!!");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("I will always execute before every method!!");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("I will always execute after every method!!");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("I will always execute before every class!!");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("I will always execute after every class!!");
	}
	
	@Test
	public void demo(){
		
		//Assert.assertTrue(false);
		System.out.println("This is testNG demo");				
	}
	
	@Test(groups={"Sanity"})
	public void demo1(){
		
		System.out.println("This is Sanity testNG demo-2");
	}
	
	@Test(groups={"Smoke"})
	public void Smokedemo1(){
		
		System.out.println("This is Smoke testNG demo-2");
	}

}
