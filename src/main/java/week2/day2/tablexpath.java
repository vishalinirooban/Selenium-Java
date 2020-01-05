package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablexpath {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Testleaf\\workspace\\MavenProject\\drivers\\chromedriver.exe" );
		// Set the property for ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		
		driver.findElementById("chkSelectDateOnly").click();
		
		WebElement elesource = driver.findElementById("txtStationFrom");
		elesource.clear();
		elesource.sendKeys("MAS",Keys.TAB);
		WebElement eledestiny = driver.findElementById("txtStationTo");
		eledestiny.clear();
		eledestiny.sendKeys("SBC",Keys.TAB);
		Thread.sleep(3000);
		
		/*
		 * WebElement eletable = driver.
		 * findElementByXPath("//table[@class='DataTable TrainList TrainListHeader'");
		 * List <WebElement> findElement = eletable.findElements(By.tagName("tr"));
		 */
         
         List<WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr");
         
         for (WebElement eachRow : rows) {
        	 List<WebElement> cols = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr/td[2]");
        	 for (WebElement eachCol : cols) {
        		 String names = eachCol.getText();
        		 System.out.println(names);
			
        	 }
			
		}
		
		
		
	}

}
