package projectDay;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Testleaf\\workspace\\MavenProject\\drivers\\chromedriver.exe" );
		// Set the property for ChromeDriver
		ChromeDriver driver = new ChromeDriver();
	     // Initiate the ChromeBroswer
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElementById("twotabsearchtextbox").sendKeys("oneplus7promobiles");
		driver.findElementByXPath("(//input[@class='nav-input'])[1]").click();
		Thread.sleep(3000);
		String price = driver.findElementByXPath("//span[@class='a-price-whole']").getText();
		System.out.println(price);
		driver.findElementByXPath("//span[@class='a-price-whole']").click();
		Set<String> windowsHandles = driver.getWindowHandles();
		List<String> lstwindowsHandles = new ArrayList<String>(windowsHandles);
		System.out.println(lstwindowsHandles.size());
		String lastwindow = lstwindowsHandles.get(lstwindowsHandles.size()-1);
		driver.switchTo().window(lastwindow);
		String title = driver.findElementById("acrCustomerReviewText").getText();
		System.out.println(title);
		Thread.sleep(5000);
		driver.findElementById("add-to-cart-button").click();
		String  text = driver.findElementByXPath("//div[@id='huc-v2-order-row-confirm-text']/h1").getText();
		System.out.println(text);
	if(text.contains("Added to cart"))
		{
	System.out.println("Added");
}
//else
//{
	//System.out.println("fail");
//}


		driver.findElementById("hlb-ptc-btn-native").click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.findElementById("continue").click();
		String text2 = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
		System.out.println(text2);
		if(text2.contains("Enter your email or mobile phone number"))
		{
			System.out.println("success");
		}
		driver.quit();
	}
	
	
	}
