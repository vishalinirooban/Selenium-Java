package practiseweek5class;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Deletelead extends SequentialExecution{
     @Test 
	public void Deletelead() throws InterruptedException{
		
		
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
