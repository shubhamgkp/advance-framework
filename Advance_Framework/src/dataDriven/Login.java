package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
	
	public WebDriver driver;

	@Test
	public void loginFB() throws IOException{
				
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("Property_File/datadriven.properties");
		prop.load(file);
		
		/*System.out.println(prop.getProperty("user"));
		System.out.println(prop.get("pass"));
		System.out.println(prop.get("url"));
		System.out.println(prop.get("browser"));*/
		
		if(prop.getProperty("browser").equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("https://www.facebook.com/");
			driver.manage().window().maximize();
		}
		else if(prop.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.navigate().to("https://www.facebook.com/");
			driver.manage().window().maximize();
		}
		else if(prop.getProperty("browser").equals("edge")){
			
			System.setProperty("webdriver.edge.driver", "Resource/MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			driver.navigate().to("https://www.facebook.com/");
			driver.manage().window().maximize();
		}
		else{
			System.out.println("There is no browser defined");
		}
	}
}
