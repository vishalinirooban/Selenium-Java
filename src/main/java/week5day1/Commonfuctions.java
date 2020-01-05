package week5day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
 

public class Commonfuctions {
	public ChromeDriver driver;


    @BeforeMethod
    
	public void commonfunct() 
	{
	System.setProperty("webdriver.chrome.driver","E:\\Testleaf\\workspace\\MavenProject\\drivers\\chromedriver.exe" );
	// Set the property for ChromeDriver
	 driver = new ChromeDriver();
     // Initiate the ChromeBroswer
	driver.get("http://leaftaps.com/opentaps/control/main");

			// Maximize the browser
	driver.manage().window().maximize();

			// Enter the UserName
	driver.findElementById("username").sendKeys("DemoSalesManager");

			// Enter the Password
	driver.findElementById("password").sendKeys("crmsfa");

			// Click on Login Button
	driver.findElementByClassName("decorativeSubmit").click();

			// Click on crm/sfa button
	driver.findElementByLinkText("CRM/SFA").click();
	
	

}
    @AfterMethod
    public void closefunctions() 
    {
    	driver.close();
    }
}