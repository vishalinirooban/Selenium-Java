package week2.day1assigments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Testleaf\\workspace\\MavenProject\\drivers\\chromedriver.exe" );
		// Set the property for ChromeDriver
		ChromeDriver driver = new ChromeDriver();
	     // Initiate the ChromeBroswer
		driver.get("http://leafground.com/pages/Button.html");
        
          driver.manage().window().maximize();
		
		driver.findElementById("home").click();
		
		
        //driver.findElementByLinkText("Button").click();
		driver.findElementByLinkText("HyperLink").click();
		
		
		
		driver.findElementByLinkText("Go to Home Page").click();
		driver.findElementByLinkText("HyperLink").click();
		
		driver.findElementByLinkText("Find where am supposed to go without clicking me?").click();
		
		driver.findElementById("home").click();
		driver.findElementByLinkText("HyperLink").click();
		
		
		driver.findElementByLinkText("How many links are available in this page?").click();
		
		driver.findElementByLinkText("Verify am I broken?").click();
		
		Thread.sleep(3000);
		//driver.findElementByXPath("//a[text() = 'GotoHomePage'[2]").click();
		
		
		
	}

}
