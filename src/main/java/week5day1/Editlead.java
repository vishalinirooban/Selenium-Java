package week5day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Editlead extends Commonfuctions{
	 @Test
		public void EditLead() throws InterruptedException {
			
					
					// Click on Leads	
					driver.findElementByLinkText("Leads").click();
					
					driver.findElementByLinkText("Find Leads").click();
					
					Thread.sleep(3000);
					
					//driver.findElementByXPath(("//label[text() = 'First name:'][3]")).click();
					driver.findElementByXPath("//label[text() = 'First name:']/following::input[29]").sendKeys("vishi");
					
					driver.findElementByXPath("//button[text() = 'Find Leads']").click();
					Thread.sleep(3000);
					driver.findElementByXPath("(//a[@class = 'linktext'])[4]").click();
					Thread.sleep(3000);
					
					driver.findElementByXPath("//div[@class='frameSectionExtra']/a[3]").click();
					WebElement elecomp = driver.findElementById("updateLeadForm_companyName");
					elecomp.clear();
					elecomp.sendKeys("test",Keys.TAB);
					
					driver.findElementByXPath("(//input [@class='smallSubmit'])[1]").click();
					
					 
				     List<WebElement> veriycompy = driver.findElementsById("viewLead_companyName_sp");
				      
				      
				      for (WebElement eachRow : veriycompy) {
				    	  String names = eachRow.getText();
				    	  System.out.println(names);
				      }
	}}


