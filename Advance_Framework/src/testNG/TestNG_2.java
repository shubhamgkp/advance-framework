package testNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_2 {
	
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
	public void personalLoan(){
		//Assert.assertTrue(false);
		System.out.println("This is Personal Loan");
	}
	
	@Test(groups={"Smoke"})
	public void smokePersonalLoan(){
		
		System.out.println("This is Smoke Personal Loan");
	}
	
}
