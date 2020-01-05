package projectDay;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Zoomcar {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Testleaf\\workspace\\MavenProject\\drivers\\chromedriver.exe" );
		// Set the property for ChromeDriver
		ChromeDriver driver = new ChromeDriver();
	     // Initiate the ChromeBroswers
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Start your wonderful journey").click();
		driver.findElementByXPath("(//div[@class='items'])[1]").click();
		driver.findElementByClassName("proceed").click();
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("dd");
		String today= sdf.format(date);
		int tomorrow = Integer.parseInt(today)+1;
		System.out.println(tomorrow);
		 driver.findElementByXPath("//div[contains(text(),'"+tomorrow+"')]").click();
		 Actions builder = new Actions(driver);
		 WebElement drag = driver.findElementByXPath("//div[@class='vue-slider-always vue-slider-dot']");
		 WebElement drop = driver.findElementByXPath("//ul[@class='vue-slider-piecewise']/li[23]");
		/* Point location = drop.getLocation();
		 int x = location.getX();
		 int y = location.getY();
		 System.out.println(x);
		 System.out.println(y);*/
		 builder.dragAndDrop(drag, drop).build().perform();
	     driver.findElementByClassName("proceed").click();
	    // Thread.sleep(3000);
	    driver.findElementByXPath("//button[@class='proceed']").click();
	    Thread.sleep(6000);
	    String title1 = driver.getTitle();
		System.out.println(title1);
	    driver.findElementByXPath("//div[@class='sort-bar car-sort-layout']/div[1]").click();
	    String  text = driver.findElementByXPath("(//div[@class='price'])[1]").getText();
	   // int price = Integer.parseInt(text);
	    System.out.println(text);
	    driver.findElementByXPath("(//button[@class='book-car'])[1]").click();
	    driver.quit();
		// driver.findElementByXPath(using)
		
	    
		

}
}                                                                                        
		