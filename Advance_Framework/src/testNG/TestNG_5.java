package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_5 {
	
	@Test(invocationCount=5)
	public void AccountOpening()
	{
		System.out.println("Opening new account!");
	}
	
	/*@Test(dataProvider="getData")
	public void AccountClosing(String user,String pass)
	{
		System.out.println("Closing the old account");
		System.out.println(user);
		System.out.println(pass);
	}*/
			
	/*@Parameters({"URL","API Key"})
	@Test
	public void CreditCard(String url, String key)
	{
		System.out.println("Application for credit card!");
		System.out.println(url);	
		System.out.println(key);
	}*/
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		
		data[0][0]="Shubham";
		data[0][1]="1234";
						
		data[1][0]="Kumar";
		data[1][1]="4321";
						
		data[2][0]="Verma";
		data[2][1]="2580";
		return data;
	}
}
