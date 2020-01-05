package week2.day1assigments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Testleaf\\workspace\\MavenProject\\drivers\\chromedriver.exe" );
		// Set the property for ChromeDriver
		ChromeDriver driver = new ChromeDriver();
	     // Initiate the ChromeBroswer
		driver.get("http://leafground.com/pages/Button.html");

				// Maximize the browser
		driver.manage().window().maximize();
		
		driver.findElementById("home").click();
		
		
        //driver.findElementByLinkText("Button").click();
		driver.findElementByLinkText("HyperLink").click();
		driver.findElementByLinkText("Verify am I broken?").click();
        
		
		
	}

}
