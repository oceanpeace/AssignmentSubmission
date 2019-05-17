package Assignments;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Properties;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Question1 {
	
	
	//reading from config file
	File file = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" +  File.separator + "config.properties");
    Properties prop = new Properties();
    FileInputStream fipg = new FileInputStream(file);
   // prop.load(fipg);
	
    
	 //assigning keys and values from config file 
	    final String usernamee = prop.getProperty("Username");
	    String password = prop.getProperty("Password");
	    String name = prop.getProperty("Name");
	    String mobile = prop.getProperty("Mobile");
	    String address = prop.getProperty("Address");
	    String Demo_url = prop.getProperty("demo_url");
	    String Demo_username= prop.getProperty("demo_username");
	    String Demo_password = prop.getProperty("demo_password");
	    String url = prop.getProperty("URL");
	
	
	
	
	WebDriver driver;

	public Question1() throws IOException
	{
		
	
	    
	   
		
				
				
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("Username"));
		System.out.println(prop.getProperty("Password"));
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
        driver.get(url);
	}
	
/*	Scenario 1-
	a- Login Page validation, create submit page method
	b- Write TestNG Test in Test Scenario file and write login flow*/

	@Test(enabled=true,priority=1)
	public void testLogin() {
		
	 
		LoginPage login=new LoginPage(driver);
		login.enterUsername(usernamee);
		login.enterPassword(password);
		login.clickLoginButton();

	}
 
/* Scenario 2-
 a- Create Directory Page class, Create method for search and Reset method.
 b- Write 2 test method one for
 a. search(enter value in text box, select Title and location dropdown, Validate search result using Assert)
 b. other test method for reset*/
 
 @Test(enabled=false)
 public void searchDirectory() throws InterruptedException
 {
	 testLogin();
	 Thread.sleep(8000);
	 OrangeHRMHomePage homePage=new OrangeHRMHomePage(driver);
	 String welcomeText=homePage.getWelcomeMessage();
	 Assert.assertEquals(welcomeText.contains(usernamee), true);
	 homePage.clickDirectoryTab();

	 Thread.sleep(5000);
	 DirectoryPage directoryPage=new DirectoryPage(driver);
	 directoryPage.enterSearchName("Linda Anderson");
	 directoryPage.selectJobTitle("HR Manager");
	 directoryPage.selectLocation("    Texas R&D");
	 directoryPage.clickSearchButton();
	 
	 Assert.assertEquals(directoryPage.returnSearchResults().contains("Linda Anderson"),true);
	 
	 directoryPage.clickResetButton();
 }
 
/* Scenario 3-
 a- Go to Admin Page, Write POM structure for Admin page in a separate Admin class, Write
 method for Search and Reset
 b- Write 3 test method on Test scenario class, one is fora.
 search � Enter Username, select UserRole, select Employee Name and status
 dropdown
 b. Reset
 c. Select checkbox for searched employee and click on Add.*/
 
 @Test(enabled=false)
 public void searchAdmin() throws InterruptedException
 {
	 testLogin();
	 Thread.sleep(8000);
	 OrangeHRMHomePage homePage=new OrangeHRMHomePage(driver);
	 homePage.clickAdminTab();
	 Thread.sleep(4000);
	 AdminPage admin=new AdminPage(driver);
	/* admin.enterUserName("Daniel");
	 admin.selectUserRole("ESS");
	 admin.enterEmployeeName("Daniel Daniel Daniel");
	 admin.selectStatus("Enabled");*/
	 
	 admin.enterUserName("fiona.grace");
	 admin.selectUserRole("ESS");
	 admin.enterEmployeeName("Fiona Grace");
	 admin.selectStatus("Enabled");
	 
	 admin.clickSearchButton();
	 
	// Assert.assertEquals(admin.returnSearchResults().contains("Daniel"),true);
	 Assert.assertEquals(admin.returnSearchResults().contains("fiona.grace"),true);
	 Thread.sleep(5000);
	 admin.clckCheckBoxForAUser("Daniel");
	 admin.clickAddButton();
	// admin.clickResetButton();
 }
 
/* Scenario 4-
 a- Go to Assign Leave and create POM class page for Assign leave
 b- Write a method in Test scenario class and select assign.*/
 @Test(enabled=true)
 public void AssignLeave() throws InterruptedException
 {
	 Thread.sleep(5000);
	 OrangeHRMHomePage homePage=new OrangeHRMHomePage(driver);
	 homePage.clickLeaveTab();
	 Thread.sleep(3000);
	 homePage.clickAssignLeaveTab();
	 AssignLeavePage leavePage=new AssignLeavePage(driver);
	 Thread.sleep(3000);
	 leavePage.enterEmployeeName("Robert Craig");
	 leavePage.selectLeaveType("Sick");
	 String pattern = "yyyy-MM-dd";
	 
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date1 = simpleDateFormat.format(new Date());
	//	System.out.println(date1);
		LocalDate date2=LocalDate.now().plusDays(3);
	//	System.out.println(LocalDate.now().plusDays(3));
		
	 leavePage.enterFromDate(date1);
	 leavePage.enterToDate(date2.toString());
	 leavePage.selectDuration("Full Day");
	 leavePage.clickAssignButton();
 }
 
}