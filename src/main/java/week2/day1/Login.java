package week2.day1;





import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	private static List<WebElement> WebElement;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Testleaf\\workspace\\MavenProject\\drivers\\chromedriver.exe" );
		// Set the property for ChromeDriver
		ChromeDriver driver = new ChromeDriver();
	     // Initiate the ChromeBroswer
		driver.get("http://leaftaps.com/opentaps/control/main");

				// Maximize the browser
		driver.manage().window().maximize();

				// Enter the UserName
		driver.findElementById("username").sendKeys("DemoSalesManager");

				// Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");

				// Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();

				// Click on crm/sfa button
		driver.findElementByLinkText("CRM/SFA").click();

				// Click on Leads
		driver.findElementByLinkText("Leads").click();

				// Click on Create Lead button
		driver.findElementByLinkText("Create Lead").click();

				// Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("UST");
		
				// Enter First Name
		driver.findElementById("createLeadForm_firstName").sendKeys("Vishi");

				// Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("rooban");
		

				// Click on Create Lead (Submit) button
		
		
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("26");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("26@gmail.com");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("26");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("26A7136478136478136879");
		
		
		
		
		

				// Verify the Lead is created by checking the Company or First Name
		WebElement option =  driver.findElementById("createLeadForm_dataSourceId");
		Select sourceoption = new Select(option);
		sourceoption.selectByVisibleText("Conference");
		
		WebElement option1 =  driver.findElementById("createLeadForm_marketingCampaignId");
		Select mcoption1 = new Select(option1);
		mcoption1.selectByValue("CATRQ_CARNDRIVER");
		
		WebElement option2 =  driver.findElementById("createLeadForm_industryEnumId");
		Select Indusoption2 = new Select(option2);
		Indusoption2.selectByIndex(9);
		
		 
		//List <WebElement> pcoptions = Preferredcurrecy.getoptions("createLeadForm_currencyUomId");
		
		 
		WebElement option3 =  driver.findElementById("createLeadForm_ownershipEnumId");
		Select ownershipoption3 = new Select(option3);
		ownershipoption3.selectByValue("OWN_PARTNERSHIP");
		
		WebElement option4 = driver.findElementByName("currencyUomId");
		Select preferredcurroption4 = new Select(option4);
		preferredcurroption4.selectByValue("ALL");
		
		WebElement option5 = driver.findElementByName("generalStateProvinceGeoId");
		Select stateoption5 = new Select(option5);
		List<WebElement> options = stateoption5.getOptions();
		int stateoption = options.size();
		stateoption5.selectByIndex(stateoption-2);
		
		
		WebElement option6 = driver.findElementByName("generalCountryGeoId");
		Select countryoption = new Select(option6);
		countryoption.selectByValue("ALB");
		
		
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("kei ");
		driver.findElementById("createLeadForm_birthDate-button").click();
	//to be clarified	//driver.findElementByXPath("//*[@id='ext-gen616']/table/thead/tr[2]/td[2]").click();
		
		driver.findElementByClassName("headrow").click();
		
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		
		//driver.findElementByLinkText("Account Name:").click();
		Alert alert = driver.switchTo().alert();
		
driver.findElementByXPath("(//label[text() = 'Account Name:'])/following::input[1]").sendKeys("vishi");
		
		//List<WebElement> Parentacc = driver.findElementsByXPath("//img[@alt='Lookup'][2]");
		
		
		
		 
     List<WebElement> monthchange = driver.findElementsByXPath("//tr[@class='headrow']/td[1]");
      
      
      for (WebElement eachRow : monthchange) {
    	  String names = eachRow.getText();
    	  System.out.println(names);
      }
		
    driver.findElementByClassName("smallSubmit").click();
    
    driver.findElementByLinkText("Find Leads").click();
   driver.findElementByXPath("//label[@class='x-form-item-label']/following::input[34]").sendKeys("vishi");
    //driver.findElementById("ext-gen334").click();
    driver.findElementByXPath("//*[@id='ext-gen334']").click();
	}
}
