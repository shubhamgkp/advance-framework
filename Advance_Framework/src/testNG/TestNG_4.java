package testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_4 {
	
	@Test(timeOut=4000)
	public void WebBikeLoan()
	{
		System.out.println("Bike Login through Web");
	}
	
	@Test(enabled=false)
	public void MobileBikeLoan()
	{
		System.out.println("Bike Login through Mobile");
	}

	/*@Test(dependsOnMethods={"SmokeAPIBikeLoan"})
	public void APIBikeLoan()
	{
		System.out.println("Bike Login through API");
	}
	*/
		
	/*@Parameters({"URL"})
	@Test
	public void SmokeAPIBikeLoan(String url)
	{
		System.out.println("This is Smoke Bike Login through API");
		System.out.println(url);		
	}*/
}
