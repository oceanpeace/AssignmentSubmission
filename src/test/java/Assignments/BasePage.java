package Assignments;

//import java.io.File;
//import java.io.FileInputStream;
import java.util.List;
//import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



//import examples.TestData;

public class BasePage {
	public WebDriver driver;
	List<String> brokenlinks;
	
	
	public BasePage()
	{
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	public void launchApplication() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
	}
	

}