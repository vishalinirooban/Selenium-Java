package weekly2assignment;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deletelead {
      
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		
		// Click on Leads	
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		Thread.sleep(3000);   
		driver.findElementByXPath("//label[text() = 'Lead ID:']/following::input").sendKeys("11314");
		
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[@class = 'linktext'])[4]").click();
		Thread.sleep(3000);
		
		driver.findElementByXPath("//div[@class='frameSectionExtra']/a[4]").click();
		
         driver.findElementByLinkText("Find Leads").click();
		
		//Thread.sleep(3000);   
		//driver.findElementByXPath("//label[text() = 'First name:']/following::input[29]").sendKeys("vishi");
		Thread.sleep(3000);  
		driver.findElementByXPath("//label[text() = 'Lead ID:']/following::input").sendKeys("11314");
	
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		Thread.sleep(3000);
		
		  List<WebElement> veriycompy = driver.findElementsByLinkText("No records to display");
	      
	      
	      for (WebElement eachRow : veriycompy) {
	    	  String names = eachRow.getText();
	    	  System.out.println(names);
	      }
	}

}
