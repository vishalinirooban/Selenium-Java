package week5day2dataprovider;

import org.testng.annotations.Test;

import practiseweek5class.SequentialExecution;


public class Createlead extends SequentialExecution{
	   @Test
			public void CreateLead() {
				// TODO Auto-generated method stub
				

						
				// Click on Leads
				driver.findElementByLinkText("Leads").click();

						// Click on Create Lead button
				driver.findElementByLinkText("Create Lead").click();

						// Enter Company Name
				driver.findElementById("createLeadForm_companyName").sendKeys("UST");
				
						// Enter First Name
				driver.findElementById("createLeadForm_firstName").sendKeys("VISHI");

						// Enter Last Name
				driver.findElementById("createLeadForm_lastName").sendKeys("ROOB");
				
				 driver.findElementByClassName("smallSubmit").click();
				


}
}
