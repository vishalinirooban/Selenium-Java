package weekly2assignment;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartextrafeatures {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				System.setProperty("webdriver.chrome.driver","E:\\Testleaf\\workspace\\MavenProject\\drivers\\chromedriver.exe" );
				// Set the property for ChromeDriver
				ChromeDriver driver = new ChromeDriver();
			     // Initiate the ChromeBroswer
				driver.get("http://www.flipkart.com");

				// Maximize the browser
		         driver.manage().window().maximize();
		         
		         driver.findElementByXPath("//button[text()='✕']").click();
		         Actions builder = new Actions(driver);
		         Thread.sleep(3000);
		         
		         driver.findElementByClassName("_1jA3uo").click();
	}

}
