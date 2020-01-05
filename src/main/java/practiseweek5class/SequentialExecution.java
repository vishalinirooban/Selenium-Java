package practiseweek5class;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class SequentialExecution {
	public ChromeDriver driver;
	@BeforeMethod
	public void SequentialExecution()
	{
	System.setProperty("webdriver.chrome.driver","E:\\Testleaf\\workspace\\MavenProject\\drivers\\chromedriver.exe" );
	// Set the property for ChromeDriver
	ChromeDriver driver = new ChromeDriver();
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
}
