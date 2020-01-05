package projectDay;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACMETESTAPP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Testleaf\\workspace\\MavenProject\\drivers\\chromedriver.exe" );
		// Set the property for ChromeDriver
		ChromeDriver driver = new ChromeDriver();
	     // Initiate the ChromeBroswer
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		Thread.sleep(3000);
		driver.findElementById("buttonLogin").click();
		Thread.sleep(6000);
		Actions builder = new Actions(driver);
		WebElement vendorbutton = driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[4]");
		builder.moveToElement(vendorbutton).perform();
		driver.findElementByLinkText("Search for Vendor").click();
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementByXPath("//button[text()='Search']").click();
		String country = driver.findElementByXPath("(//table[@class='table']//td[5])").getText();
		System.out.println(country);
	}
}
